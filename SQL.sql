CREATE DATABASE QUANLYPHONGTRO

CREATE TABLE USER_KHACHTHUE --Done
(
	UserID INT identity (1,1)PRIMARY KEY,
	Username  nvarchar (25),
	Pwd nvarchar(25),
	IsAdmin int check (IsAdmin IN (1,0)) Default 0,
	MaKhach varchar(5),
	TenKhach nvarchar(30),
	Phai nvarchar(5),
	CMND varchar(11),
	QueQuan nvarchar(20), 
	NgheNghiep nvarchar(20),
	TinhTrang int,
)

CREATE TABLE KHACH_THUE 
(
	MaKhach varchar(5) primary key,
	TenKhach nvarchar(30),
	Phai nvarchar(5),
	CMND varchar(11),
	QueQuan nvarchar(20), 
	NgheNghiep nvarchar(20),
)

CREATE TABLE PHONG_TRO
(
	MaPhong varchar(5)primary key,
	TrangThai int check (TrangThai IN (1,0)) Default 0,
	ThongTinPhong nvarchar(50),
	SoNguoi int,
)

CREATE TABLE GIA_THUE
(
	SoNguoi int primary key,
	GiaTien money,
)

CREATE TABLE CT_KHACH_THUE
(
	MaKhach varchar(5),
	MaPhong varchar(5),
	NgayVaoPhong datetime
	
)

CREATE TABLE HOA_DON
(
	MaHoaDon int identity(1,1) primary key,
	NgayLap datetime,
	MaPhong varchar(5),
)

CREATE TABLE DICH_VU --Done
(
	MaDichVu varchar(5) primary key,
	DichVu nvarchar(30),
	GiaDichVu money,
	MaLoaiDichVu varchar(5),
	QuyCach nvarchar(30),
)

CREATE TABLE LOAI_DICH_VU
(
	MaLoaiDichVu varchar(5) primary key,
	TenLoaiDichVu nvarchar(20),
)

Create table CT_DICHVU
(
	MaHoaDon int,
	MaDichVu varchar(5),
	DonViSuDung int,
)

ALTER TABLE DICH_VU
ADD CONSTRAINT FK_DICHVU_LOAIDICHVU FOREIGN KEY (MaLoaiDichVu)
REFERENCES LOAI_DICH_VU (MaLoaiDichVu)

ALTER TABLE PHONG_TRO
ADD CONSTRAINT FK_PHONGTRO_GIATHUE FOREIGN KEY (SoNguoi)
REFERENCES GIA_THUE (SoNguoi)

ALTER TABLE HOP_DONG
ADD CONSTRAINT FK_PHONGTRO_HOPDONG FOREIGN KEY (MaPhong)
REFERENCES PHONG_TRO (MaPhong)

ALTER TABLE USER_KHACHTHUE
ADD CONSTRAINT FK_USERKHACHTHUE_KHACHTHUE FOREIGN KEY (MaKhach)
REFERENCES KHACH_THUE (MaKhach)

ALTER TABLE CT_KHACH_THUE
ADD CONSTRAINT FK_CTKHACHTHUE_KHACHTHUE FOREIGN KEY (MaKhach)
REFERENCES KHACH_THUE (MaKhach)

ALTER TABLE CT_KHACH_THUE
ADD CONSTRAINT FK_CTKHACHTHUE_PHONGTRO FOREIGN KEY (MaPhong)
REFERENCES PHONG_TRO (MaPhong)

ALTER TABLE HOA_DON
ADD CONSTRAINT FK_HOADON_PHONGTRO FOREIGN KEY (MaPhong)
REFERENCES PHONG_TRO (MaPhong)

ALTER TABLE CT_DICHVU
ADD CONSTRAINT FK_HOADON_CTDICHVU FOREIGN KEY (MaHoaDon)
REFERENCES HOA_DON (MaHoaDon)

ALTER TABLE CT_DICHVU
ADD CONSTRAINT FK_DICHVU_CTDICHVU FOREIGN KEY (MaDichVu)
REFERENCES DICH_VU (MaDichVu)

--------------Procedure---------------------
create proc ThemKhachThueKhongDatPhong
(
@makhach varchar(5),
@tenkhach nvarchar(30),
@phai nvarchar(5),
@cmnd varchar(15),
@quequan nvarchar(30),
@nghenghiep nvarchar(30),
@taikhoan varchar(25),
@matkhau varchar(25)
)
as
	begin
			insert into KHACH_THUE values(@makhach,@tenkhach,@phai,@cmnd,@quequan,@nghenghiep)
			insert into USER_KHACHTHUE (Username,Pwd,IsAdmin,MaKhach, TenKhach,Phai,CMND,QueQuan,NgheNghiep)values(@taikhoan,@matkhau,0, @makhach,@tenkhach,@phai,@cmnd,@quequan,@nghenghiep)
	end

	create proc ThemKhachThueDatPhong
(
@makhach varchar(5),
@tenkhach nvarchar(30),
@phai nvarchar(5),
@cmnd varchar(15),
@quequan nvarchar(30),
@nghenghiep nvarchar(30),
@taikhoan varchar(25),
@matkhau varchar(25)
)
as
	begin
			insert into KHACH_THUE values(@makhach,@tenkhach,@phai,@cmnd,@quequan,@nghenghiep)
			insert into USER_KHACHTHUE (Username,Pwd,IsAdmin,MaKhach, TenKhach,Phai,CMND,QueQuan,NgheNghiep)values(@taikhoan,@matkhau,0, @makhach,@tenkhach,@phai,@cmnd,@quequan,@nghenghiep)
			update USER_KHACHTHUE set TinhTrang = 1 where MaKhach = @makhach 
	end

CREATE PROC XoaKhachThue
(
    @MaKhach varchar(5),
    @TaiKhoan varchar(25)
)
AS
BEGIN
    -- Kiểm tra nếu khách không có trong bảng CT_KHACH_THUE thì xóa thông tin của khách và kết thúc thủ tục
    IF(@TaiKhoan IS NOT NULL AND NOT EXISTS(SELECT @MaKhach FROM CT_KHACH_THUE WHERE @MaKhach = MaKhach))
    BEGIN
        DELETE FROM USER_KHACHTHUE WHERE MaKhach = @MaKhach;
        DELETE FROM KHACH_THUE WHERE MaKhach = @MaKhach;
        RETURN;
    END;

    -- Kiểm tra nếu khách có tài khoản và đã thuê phòng
    IF(@TaiKhoan IS NOT NULL AND EXISTS(SELECT @MaKhach FROM CT_KHACH_THUE WHERE @MaKhach = MaKhach))
    BEGIN
        DECLARE @MaPhong varchar(5);
        SELECT @MaPhong = MaPhong FROM CT_KHACH_THUE WHERE MaKhach = @MaKhach;

        -- Xóa thông tin của khách trong các bảng
        DELETE FROM CT_KHACH_THUE WHERE MaKhach = @MaKhach;
        DELETE FROM USER_KHACHTHUE WHERE MaKhach = @MaKhach;
        DELETE FROM KHACH_THUE WHERE MaKhach = @MaKhach;

        -- Giảm giá trị cột SoNguoi trong bảng PHONG_TRO đi 1
        UPDATE PHONG_TRO SET SoNguoi -= 1 WHERE MaPhong = @MaPhong;
    END;
END;

create proc SuaKhachThue
(
	@makhach varchar(5),
	@tenkhach nvarchar(30),
	@phai nvarchar(5),
	@cmnd varchar(15),
	@quequan nvarchar(30),
	@nghenghiep nvarchar(30)
	@taikhoan varchar(20),
	@matkhau varchar(20)
)
as
	begin
		update KHACH_THUE
		set TenKhach = @tenkhach,
			Phai = @phai,
			CMND = @cmnd,
			QueQuan = @quequan,
			NgheNghiep = @nghenghiep
		where MaKhach = @makhach
	end

create proc ThemPhong
(
	@songuoi int,
	@giatien money
)
as
	begin
		insert into GIA_THUE values(@songuoi,@giatien)
	end

create proc SuaPhong
(
	@songuoi int,
	@giatien money
)
as
	begin
		update GIA_THUE
		set GiaTien = @giatien
		where SoNguoi =@songuoi
	end

create proc ThemKhachThueVaoOGhep
(
	@MaKhach varchar(5),
	@MaPhong varchar(5),
	@NgayVaoPhong datetime
)
as
	begin
		insert into CT_KHACH_THUE values(@MaKhach,@MaPhong,convert(varchar(10),@NgayVaoPhong,103))
		update PHONG_TRO set SoNguoi+=1 where MaPhong = @MaPhong
	end

create proc ThemKhachThueVaoPhongMoi
(
	@MaKhach varchar(5),
	@MaPhong varchar(5),
	@NgayVaoPhong datetime
)
as
	begin
		insert into HOP_DONG values(convert(varchar(10),@NgayVaoPhong,103),@MaPhong)
		insert into CT_KHACH_THUE values(@MaKhach,@MaPhong,convert(varchar(10),@NgayVaoPhong,103))
		update PHONG_TRO set SoNguoi=1 where MaPhong = @MaPhong
	end

create proc ThemHoaDon
(
	@maphong varchar(5),
	@ngaylap datetime
)
as
	begin
		insert into HOA_DON values(convert(varchar(10),@ngaylap,103), @maphong)
	end

create proc ThemChiTietDichVu
(
	@madichvu varchar(5),
	@donvisudung int
)
as
	begin
		declare @mahoadon int
			set @mahoadon= (select top(1) mahoadon from HOA_DON order by MaHoaDon desc)
		insert into CT_DICHVU values ( @mahoadon,@madichvu, @donvisudung)
	end

create proc XoaHoaDon
(
	@mahoadon int
)
as
	begin
		delete from CT_DICHVU where @mahoadon = MaHoaDon
		delete from HOA_DON where @mahoadon = MaHoaDon
	end

create proc ThemDichVu
(
	@madichvu varchar(5),
	@tendichvu nvarchar(30),
	@giatien money,
	@maloaidichvu varchar(5),
	@quycach nvarchar(30)
)
as
	begin
		insert into DICH_VU values(@madichvu,@tendichvu,@giatien,@maloaidichvu,@quycach)
	end

create proc SuaDichVu
(
	@madichvu varchar(5),
	@tendichvu nvarchar(30),
	@giatien money,
	@maloaidichvu varchar(5),
	@quycach nvarchar(30)
)
as
	begin
		update DICH_VU
		set DichVu = @tendichvu,
			GiaDichVu = @giatien,
			MaLoaiDichVu = @maloaidichvu,
			QuyCach = @quycach
		where MaDichVu = @madichvu
	end

create proc XoaDichVu
(
	@MaDichVu varchar(5)
)
as
	begin
		delete from DICH_VU where MaDichVu  = @MaDichVu
	end