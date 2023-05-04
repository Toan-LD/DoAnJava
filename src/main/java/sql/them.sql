drop proc ThemKhachThueKhongDatPhong
drop proc ThemKhachThueDatPhong

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