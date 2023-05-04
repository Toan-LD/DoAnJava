/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author TOAN
 */
public class KhachThueDTO {
    private String maKhach;
    private String tenKhach;
    private String phai;
    private String cmnd;
    private String queQuan;
    private String ngheNghiep;
    private String taiKhoan;
    private String matKhau;

    public String getTaiKhoan() {
        return this.taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return this.matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    
    
    public KhachThueDTO(){
        cmnd = maKhach  = ngheNghiep = phai = queQuan = tenKhach = matKhau = taiKhoan = "";
    }
    
    public KhachThueDTO(String maKhach, String tenKhach, String phai, String cmnd, String queQuan, String ngheNghiep, String taiKhoan, String matKhau) {
        this.maKhach = maKhach;
        this.tenKhach = tenKhach;
        this.phai = phai;
        this.cmnd = cmnd;
        this.queQuan = queQuan;
        this.ngheNghiep = ngheNghiep;
    }
    public String getMaKhach() {
        return this.maKhach;
    }
    
    public void setMaKhach(String maKhach) {
        this.maKhach = maKhach;
    }
    
    public String getTenKhach() {
        return this.tenKhach;
    }
    
    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }
    
    public String getPhai() {
        return this.phai;
    }
    
    public void setPhai(String phai) {
        this.phai = phai;
    }
    
    public String getCmnd() {
        return this.cmnd;
    }
    
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    public String getQueQuan() {
        return this.queQuan;
    }
    
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    public String getNgheNghiep() {
        return this.ngheNghiep;
    }
    
    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
}
