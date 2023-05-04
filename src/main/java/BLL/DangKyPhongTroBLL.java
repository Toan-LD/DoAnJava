/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DBAccess;
import DAL.DangKyPhongTroDAL;
import DTO.DangKyPhongTroDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class DangKyPhongTroBLL {
    DangKyPhongTroDAL dangKyPhongTro = new DangKyPhongTroDAL();
    public ResultSet LoadPhongChuaCoKhach() throws Exception {
        return dangKyPhongTro.LoadPhongChuaCoKhach();
    }
    
    public ResultSet LoadPhongDaCoKhach() throws Exception {
        return dangKyPhongTro.LoadPhongDaCoKhach();
    }
    
    public ResultSet LoadKhachThueChuaCoPhong() throws Exception {
        return dangKyPhongTro.LoadKhachThueChuaCoPhong();
    }
    public ResultSet LoadChiTietKhachThue(DangKyPhongTroDTO dangKyPhong) throws Exception{
        return dangKyPhongTro.LoadChiTietKhachThue(dangKyPhong);
    }
    
    public ResultSet LoadMaPhongOGhep() throws Exception {
        return dangKyPhongTro.LoadMaPhongOGhep();
    }
    
    public ResultSet LoadMaPhongMoi() throws Exception {
        return dangKyPhongTro.LoadMaPhongMoi();
    }
    
    public int ThemKhachOGhep(DangKyPhongTroDTO dangKyPhong) {
        return dangKyPhongTro.ThemKhachOGhep(dangKyPhong);
    }
    
    public int ThemKhachThueVaoPhongMoi(DangKyPhongTroDTO dangKyPhong) {
        return dangKyPhongTro.ThemKhachThueVaoPhongMoi(dangKyPhong);
    }
}

