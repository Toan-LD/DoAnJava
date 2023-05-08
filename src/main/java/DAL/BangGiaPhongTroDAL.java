/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.BangGiaPhongTroDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class BangGiaPhongTroDAL {
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    public ResultSet LoadThongTinGiaThue() throws Exception {
        String sql = "select SoNguoi, PARSENAME(convert(varchar, convert(money, GiaTien),1),2) as GiaTien from GIA_THUE where SoNguoi != 0";
        return rs = data.executeQuery(sql);
    }
    
    public int ThemPhong(BangGiaPhongTroDTO bangGiaPhongTroDTO) {
        int thamSo = 2;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = bangGiaPhongTroDTO.getSoNguoi();
        giaTri[1] = bangGiaPhongTroDTO.getGiaTien();
        return data.Update("{call ThemPhong(?, ?)}", giaTri, thamSo);
    }
    
    public int SuaPhong(BangGiaPhongTroDTO bangGiaPhongTroDTO){
        int thamSo = 2;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = bangGiaPhongTroDTO.getSoNguoi();
        giaTri[1] = bangGiaPhongTroDTO.getGiaTien();
        return data.Update("{call SuaPhong(?, ?)}", giaTri, thamSo);
    }
    
    public int XoaPhong(BangGiaPhongTroDTO bangGiaPhongTroDTO) {
        int thamSo = 2;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = bangGiaPhongTroDTO.getSoNguoi();
        giaTri[1] = bangGiaPhongTroDTO.getGiaTien();
        return data.Update("{call XoaPhong(?, ?)}", giaTri, thamSo);
    }
}
