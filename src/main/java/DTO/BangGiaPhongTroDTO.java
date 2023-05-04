/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author TOAN
 */
public class BangGiaPhongTroDTO {
    private int songuoi;
    private int giatien;
    
    public BangGiaPhongTroDTO()
    {
        songuoi = giatien = 0;
    }
    
    public BangGiaPhongTroDTO(int _songuoi, int _giatien)
    {
        giatien = _giatien;
        songuoi = _songuoi;
    }
    
    //Giá tiền
    public int getGiaTien()
    {
        return giatien;
    }
    
    public void setGiaTien(int _giatien)
    {
        giatien = _giatien;
    }
    
    //Số người
    public int getSoNguoi()
    {
        return songuoi;
    }
    
    public void setSoNguoi(int _songuoi)
    {
        songuoi = _songuoi;
    }
}
