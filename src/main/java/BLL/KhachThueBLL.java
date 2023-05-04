/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.KhachThueDAL;
import DTO.KhachThueDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class KhachThueBLL {
    KhachThueDAL khachthue = new KhachThueDAL();
    
    public ResultSet LoadKhachThue() throws Exception {
        return khachthue.LoadAll();
    }
    
    public ResultSet LoadKhachThueDatPhong() throws Exception {
        return khachthue.LoadKhachThueDatPhong();
    }
    
    public ResultSet TimKhachThueTheoTen(KhachThueDTO khachthueDTO) throws Exception {
        return khachthue.TimKiemKhachTheoTen(khachthueDTO);
    } 
    public ResultSet TimKhachThueTheoMa(KhachThueDTO khachthueDTO) throws Exception {
        return khachthue.TimKiemKhachTheoMa(khachthueDTO);
    } 
    public ResultSet TimKhachThueTheoQueQuan(KhachThueDTO khachthueDTO) throws Exception {
        return khachthue.TimKiemKhachTheoQueQuan(khachthueDTO);
    } 
    public ResultSet TimKhachThueTheoNgheNghiep(KhachThueDTO khachthueDTO) throws Exception {
        return khachthue.TimKiemKhachTheoNgheNghiep(khachthueDTO);
    } 
    
    public int ThemKhachThueKhongDatPhong(KhachThueDTO khachthueDTO) {
        return khachthue.ThemKhachThueKhongDatPhong(khachthueDTO);
    }
    public int ThemKhachThueDatPhong(KhachThueDTO khachthueDTO) {
        return khachthue.ThemKhachThueDatPhong(khachthueDTO);
    }
    public int XoaKhachThue(KhachThueDTO khachthueDTO) {
        return khachthue.XoaKhachThue(khachthueDTO);
    }
    public int SuaKhachThue(KhachThueDTO khachthueDTO) {
        return khachthue.SuaKhachThue(khachthueDTO);
    }
}
