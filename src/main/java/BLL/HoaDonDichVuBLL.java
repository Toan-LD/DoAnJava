/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.HoaDonDichVuDAL;
import DTO.HoaDonDichVuDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class HoaDonDichVuBLL {
    HoaDonDichVuDAL hoaDonDichVuDAL = new HoaDonDichVuDAL();
    
    public ResultSet LoadDichVu() throws Exception {
        return hoaDonDichVuDAL.LoadDichVu();
    }
    
    public ResultSet LoadDichVuTheoMa(HoaDonDichVuDTO hoaDonDichVu) throws Exception {
        return hoaDonDichVuDAL.LoadDichVuTheoMa(hoaDonDichVu);
    }
    
    public ResultSet LoadPhongChuaCoHoaDon(HoaDonDichVuDTO hoaDonDichVu) throws Exception {
        return hoaDonDichVuDAL.LoadPhongChuaCoHoaDon(hoaDonDichVu);
    }
    
    public ResultSet LoadPhongDaCoHoaDon(HoaDonDichVuDTO hoaDonDichVu) throws Exception {
        return hoaDonDichVuDAL.LoadPhongDaCoHoaDon(hoaDonDichVu);
    }
    
    public ResultSet LoadCT_DICHVU(HoaDonDichVuDTO hoaDonDichVu) throws Exception {
        return hoaDonDichVuDAL.LoadCT_DICHVU(hoaDonDichVu);
    }
    
    public int ThemHoaDon(HoaDonDichVuDTO hoaDonDichVu) {
        return hoaDonDichVuDAL.ThemHoaDon(hoaDonDichVu);
    }
    
    public int ThemChiTietDichVu(HoaDonDichVuDTO hoaDonDichVu) {
        return hoaDonDichVuDAL.ThemChiTietDichVu(hoaDonDichVu);
    }
    
    public int XoaHoaDon(HoaDonDichVuDTO hoaDonDichVu) {
        return hoaDonDichVuDAL.XoaHoaDon(hoaDonDichVu);
    }
}
