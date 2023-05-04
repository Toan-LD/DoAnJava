/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author TOAN
 */
public class PhongTroDTO {
    private String maPhong;
    private String trangThai;
    private String thongTinPhong;
    private String ngayVaoPhong;
    private int soNguoi;
    
    public PhongTroDTO(){
        maPhong = trangThai = thongTinPhong = ngayVaoPhong = "";
        soNguoi = 0;
    }
    
    public PhongTroDTO(String maPhong, String trangThai, String thongTinPhong, int soNguoi, String ngayVaoPhong) {
        this.maPhong = maPhong;
        this.trangThai = trangThai;
        this.thongTinPhong = thongTinPhong;
        this.soNguoi = soNguoi;
        this.ngayVaoPhong = ngayVaoPhong;
    }

    public String getMaPhong() {
        return this.maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getThongTinPhong() {
        return this.thongTinPhong;
    }

    public void setThongTinPhong(String thongTinPhong) {
        this.thongTinPhong = thongTinPhong;
    }

    public String getNgayVaoPhong() {
        return this.ngayVaoPhong;
    }

    public void setNgayVaoPhong(String ngayVaoPhong) {
        this.ngayVaoPhong = ngayVaoPhong;
    }

    public int getSoNguoi() {
        return this.soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }
}
