/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.HoaDonDichVuDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class HoaDonDichVuDAL {
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    public ResultSet LoadDichVu() throws Exception {
        String sql = "select DichVu from DICH_VU";
        return rs = data.executeQuery(sql);
    }
    
    public ResultSet LoadDichVuTheoMa(HoaDonDichVuDTO hoaDonDichVu) throws Exception {
        String sql = "select MaDichVu, DichVu, PARSENAME(convert(varchar, convert(money, GiaDichVu),1) ,2 ) as GiaDichVu, QuyCach from DICH_VU where DichVu = N'" + hoaDonDichVu.getDichVu() + "'";
        return rs = data.executeQuery(sql);
    }
    
    public ResultSet LoadPhongChuaCoHoaDon(HoaDonDichVuDTO hoaDonDichVu) throws Exception {
        String sql = "select MaPhong From PHONG_TRO where MaPhong in(select MaPhong from CT_KHACH_THUE) and MaPhong not in(select MaPhong from HOA_DON )";
        return rs = data.executeQuery(sql);
    }
    
    public ResultSet LoadPhongDaCoHoaDon(HoaDonDichVuDTO hoaDonDichVu) throws Exception {
        String sql = "select MaPhong from PHONG_TRO where MaPhong in(select MaPhong from CT_KHACH_THUE) and MaPhong in (select MaPhong from HOA_DON)";
        return rs = data.executeQuery(sql);
    }
    
    
    public ResultSet LoadCT_DICHVU(HoaDonDichVuDTO hoaDonDichVu) throws Exception {
        String sql = "select HOA_DON.MaHoaDon, right(convert(varchar(10),  NgayLap,103),7) as NgayLap, MaPhong, CT_DICHVU.MaDichVu, PARSENAME(convert(varchar,convert(money,DonViSuDung*GiaDichVu),1),2 ) as ChiPhi from HOA_DON, CT_DICHVU, DICH_VU where HOA_DON.MaHoaDon = CT_DICHVU.MaHoaDon and DICH_VU.MaDichVu = CT_DICHVU.MaDichVu and MaPhong = '"+hoaDonDichVu.getMaPhong()+"'";
        return rs = data.executeQuery(sql);
    }
    
    public int ThemHoaDon(HoaDonDichVuDTO hoaDonDichVu) {
        int thamSo = 2;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = hoaDonDichVu.getMaPhong();
        giaTri[1] = hoaDonDichVu.getNgayLapHoaDon();
        return data.Update("{call ThemHoaDon(?, ?)}", giaTri, thamSo);
    }
    
    public int ThemChiTietDichVu(HoaDonDichVuDTO hoaDonDichVu) {
        int thamSo = 2;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = hoaDonDichVu.getMaDichVu();
        giaTri[1] = hoaDonDichVu.getDonViSuDung();
        
        return data.Update("{call ThemChiTietDichVu(?, ?)}", giaTri, thamSo);
    }
    
    public int XoaHoaDon(HoaDonDichVuDTO hoaDonDichVu) {
        int thamSo = 1;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = hoaDonDichVu.getMaHoaDon();
        return data.Update("{call XoaHoaDon(?)}", giaTri, thamSo);
    }
}
