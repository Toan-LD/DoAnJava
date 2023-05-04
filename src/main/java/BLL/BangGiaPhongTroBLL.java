/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.BangGiaPhongTroDAL;
import DTO.BangGiaPhongTroDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class BangGiaPhongTroBLL {
    BangGiaPhongTroDAL bangGiaPhongTroDAL = new BangGiaPhongTroDAL();
    
    public ResultSet LoadThongTinGiaThue() throws Exception {
        return bangGiaPhongTroDAL.LoadThongTinGiaThue();
    }
    
    public int ThemPhong(BangGiaPhongTroDTO bangGiaPhongTroDTO) {
        return bangGiaPhongTroDAL.ThemPhong(bangGiaPhongTroDTO);
    }
    
    public int SuaPhong(BangGiaPhongTroDTO bangGiaPhongTroDTO){
        return bangGiaPhongTroDAL.SuaPhong(bangGiaPhongTroDTO);
    }
    
    public int XoaPhong(BangGiaPhongTroDTO bangGiaPhongTroDTO) {
        return bangGiaPhongTroDAL.XoaPhong(bangGiaPhongTroDTO);
    }
}
