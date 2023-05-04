/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DangKyPhongTroDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class DangKyPhongTroDAL {
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    public ResultSet LoadKhachThueChuaCoPhong() throws Exception {
        String sql = "select MaKhach, TenKhach, Phai, QueQuan, NgheNghiep from KHACH_THUE where MaKhach not in(select MaKhach from CT_KHACH_THUE)";
        rs = data.executeQuery(sql);
        return rs;
    }   

    public ResultSet LoadPhongChuaCoKhach() throws Exception {
        return rs = data.executeQuery("select MaPhong from PHONG_TRO where SoNguoi is Null");
    }
    
    public ResultSet LoadPhongDaCoKhach() throws Exception{
        return rs =data.executeQuery("select MaPhong from PHONG_TRO where SoNguoi is not null");
    }
    
    public ResultSet LoadChiTietKhachThue(DangKyPhongTroDTO dangKyPhong) throws Exception {
        String sql = "select TenKhach, Phai, NgheNghiep, Convert(varchar, NgayVaoPhong, 103) as NgayVaoPhong from CT_KHACH_THUE, KHACH_THUE where CT_KHACH_THUE.MaKhach = KHACH_THUE.MaKhach and MaPhong = '"+dangKyPhong.getMaPhong()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    public int ThemKhachOGhep(DangKyPhongTroDTO dangKyPhong) {
        int thamSo = 3;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = dangKyPhong.getMaKhach();
        giaTri[1] = dangKyPhong.getMaPhong();
        giaTri[2] = dangKyPhong.getNgayVaoPhong();
        return data.Update("{call ThemKhachOGhep(?,?,?)}", giaTri, thamSo);
    }
    
    public int ThemKhachThueVaoPhongMoi(DangKyPhongTroDTO dangKyPhong) {
        int thamSo = 3;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = dangKyPhong.getMaKhach();
        giaTri[1] = dangKyPhong.getMaPhong();
        giaTri[2] = dangKyPhong.getNgayVaoPhong();
        return data.Update("{call ThemKhachThueVaoPhongMoi(?,?,?)}", giaTri, thamSo);
    }
    
    public ResultSet LoadMaPhongOGhep() throws Exception {
        String sql = "select MaPhong from PHONG_TRO where MaPhong in (select MaPhong from CT_KHACH_THUE)";
        return rs = data.executeQuery(sql);
    }
    
    public ResultSet LoadMaPhongMoi() throws Exception {
        String sql = "select MaPhong from PHONG_TRO where MaPhong not in(select MaPhong from CT_KHACH_THUE)";
        return rs = data.executeQuery(sql);
    }
}

