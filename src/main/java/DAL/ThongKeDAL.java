/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.ThongKeDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class ThongKeDAL {
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    public ResultSet LoadThang() throws Exception {
        String sql = "Select right(convert(varchar(10), ngayLap, 103),7) as thang from HOA_DON group by right(convert(varchar(10), ngayLap,103),7)";
        return rs = data.executeQuery(sql);
    }
    
    public ResultSet LoadHDTheoThang(ThongKeDTO thongKeDTO) throws Exception {
        String sql = "select MaHoaDon, CONVERT(varchar(10), NgayLap, 103) as ngaylap, MaPhong from HOA_DON where RIGHT(CONVERT(varchar(10), ngaylap, 103),7) = RIGHT(CONVERT(varchar(10), '"+thongKeDTO.getNgayLap()+"', 103),7)";
        return rs = data.executeQuery(sql);
    }
    
    public ResultSet LoadTienPhongTheoMa(ThongKeDTO thongKeDTO) throws Exception
    {        
        String sql = "select MaPhong, PARSENAME(convert(varchar,convert(money,GiaTien),1),2 ) as giatien from GIA_THUE, PHONG_TRO where GIA_THUE.SoNguoi = PHONG_TRO.SoNguoi and MaPhong = '"+thongKeDTO.getMaPhong()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    public ResultSet LoadTienDichVuTheoMa(ThongKeDTO thongKeDTO) throws Exception {
        String sql = "select MaPhong, HOA_DON.MaHoaDon, DichVu,  PARSENAME(convert(varchar,convert(money,DonViSuDung*GiaDichVu),1),2 ) as giatien from CT_DICHVU, DICH_VU, HOA_DON where CT_DICHVU.MaDichVu = DICH_VU.MaDichVu and HOA_DON.MaHoaDon = CT_DICHVU.MaHoaDon and MaPhong = '"+thongKeDTO.getMaPhong()+"' and RIGHT(CONVERT(varchar(10), NgayLap, 103),7) =  RIGHT(CONVERT(varchar(10),  '"+thongKeDTO.getNgayLap()+"', 103),7)";
        return rs = data.executeQuery(sql);
    }
    
    public ResultSet TongTien() {
        return data.LayDuLieu("{call TinhTien}");
    }
    
    public ResultSet TongTienTheoThang(ThongKeDTO thongKeDTO) throws Exception {
        String sql = "select  PARSENAME(convert(varchar,convert(money, sum(tinhtienphong.giatien+ tinhtiendichvu.giatien)),1),2 ) as giatien from tinhtienphong, tinhtiendichvu where tinhtienphong.maphong = tinhtiendichvu.maphong and RIGHT(CONVERT(varchar(10), tinhtiendichvu.NgayLap, 103),7) = RIGHT(CONVERT(varchar(10), '"+thongKeDTO.getNgayLap()+"', 103),7) and RIGHT(CONVERT(varchar(10), tinhtienphong.NgayLap, 103),7) = RIGHT(CONVERT(varchar(10), '"+thongKeDTO.getNgayLap()+"', 103),7) group by tinhtienphong.ngaylap";
        return rs = data.executeQuery(sql);
    }
    
    public ResultSet TongTienTheoThangCuaPhong(ThongKeDTO thongKeDTO) throws Exception
    {        
        
        String sql = "select PARSENAME(convert(varchar,convert(money,((sum(GiaDichVu*DonViSuDung))+GIA_THUE.GiaTien)),1),2 ) as giatien from CT_DICHVU, DICH_VU, HOA_DON, PHONG_TRO, GIA_THUE where CT_DICHVU.MaDichVu = DICH_VU.MaDichVu and CT_DICHVU.MaHoaDon = HOA_DON.MaHoaDon and GIA_THUE.SoNguoi = PHONG_TRO.SoNguoi and PHONG_TRO.MaPhong = HOA_DON.MaPhong and PHONG_TRO.MaPhong = '"+thongKeDTO.getMaPhong()+"' and RIGHT(CONVERT(varchar(10), NgayLap, 103),7) = RIGHT(CONVERT(varchar(10), '"+thongKeDTO.getNgayLap()+"', 103),7) group by HOA_DON.MaHoaDon, ngaylap, HOA_DON.MaPhong, PHONG_TRO.SoNguoi, GIA_THUE.GiaTien";
        rs = data.executeQuery(sql);
        return rs;
    }
}
