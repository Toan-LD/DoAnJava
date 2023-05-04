/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import java.sql.Date;
/**
 *
 * @author TOAN
 */
public class DangKyPhongTroDTO {
    private String maPhong;
    private String maKhach;
    private String ngayVaoPhong;

    public String getMaPhong() {
        return this.maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaKhach() {
        return this.maKhach;
    }

    public void setMaKhach(String maKhach) {
        this.maKhach = maKhach;
    }

    public String getNgayVaoPhong() {
        return this.ngayVaoPhong;
    }

    public void setNgayVaoPhong(String ngayVaoPhong) {
        this.ngayVaoPhong = ngayVaoPhong;
    }
    
    
}
