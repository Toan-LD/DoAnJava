/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.BangGiaDichVuDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class BangGiaDichVuDAL {
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    public ResultSet LoadThongTinDichVu() throws Exception {
        String sql = "select MaDichVu, DichVu, Parsename(convert(varchar, convert(money, GiaDichVu),1), 2) as GIADICHVU, MaLoaiDichVu, QuyCach from DICH_VU";
        return rs = data.executeQuery(sql);
    }
    
    public ResultSet LoadMaLoaiDichVu() throws Exception {
        String sql = "select MaLoaiDichVu from LOAI_DICH_VU";
        rs = data.executeQuery(sql);
        return rs;
    }

    public int ThemDichVu(BangGiaDichVuDTO bangGiaDichVuDTO) {
        int thamSo = 5;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = bangGiaDichVuDTO.getMaDichVu();
        giaTri[1] = bangGiaDichVuDTO.getTenDichVu();
        giaTri[2] = bangGiaDichVuDTO.getGiaTien();
        giaTri[3] = bangGiaDichVuDTO.getMaLoaiDichVu();
        giaTri[4] = bangGiaDichVuDTO.getQuyCach();
        
        return data.Update("{call ThemDichVu(?, ?, ?, ?, ?)}", giaTri, thamSo);
    }
    
    public int SuaDichVu(BangGiaDichVuDTO bangGiaDichVuDTO) {
        int thamSo = 5;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = bangGiaDichVuDTO.getMaDichVu();
        giaTri[1] = bangGiaDichVuDTO.getTenDichVu();
        giaTri[2] = bangGiaDichVuDTO.getGiaTien();
        giaTri[3] = bangGiaDichVuDTO.getMaDichVu();
        giaTri[4] = bangGiaDichVuDTO.getQuyCach();
        
        return data.Update("{call SuaDichVu(?, ?, ?, ?, ?)}", giaTri, thamSo);
    }
    
    public int XoaDichVu(BangGiaDichVuDTO bangGiaDichVuDTO){
        int thamSo = 1;
        Object[] giaTri = new Object[thamSo];
        giaTri[0] = bangGiaDichVuDTO.getMaDichVu();
        return data.Update("{call XoaDichVu(?)}", giaTri, thamSo);
    }
}
 