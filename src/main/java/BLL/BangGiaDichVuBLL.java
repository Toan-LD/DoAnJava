/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.BangGiaDichVuDAL;
import DTO.BangGiaDichVuDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class BangGiaDichVuBLL {
    BangGiaDichVuDAL bangGiaDichVuDAL = new BangGiaDichVuDAL();
    public ResultSet LoadThongTinDichVu() throws Exception {
        return bangGiaDichVuDAL.LoadThongTinDichVu();
    }
    
    public ResultSet LoadMaLoaiDichVu() throws Exception {
        return bangGiaDichVuDAL.LoadMaLoaiDichVu();
    }

    public int ThemDichVu(BangGiaDichVuDTO bangGiaDichVuDTO) {
        return bangGiaDichVuDAL.ThemDichVu(bangGiaDichVuDTO);
    }
    
    public int SuaDichVu(BangGiaDichVuDTO bangGiaDichVuDTO) {
        return bangGiaDichVuDAL.SuaDichVu(bangGiaDichVuDTO);
    }
    
    public int XoaDichVu(BangGiaDichVuDTO bangGiaDichVuDTO){
        return bangGiaDichVuDAL.XoaDichVu(bangGiaDichVuDTO);
    }
}
