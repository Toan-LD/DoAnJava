/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.PhongTroDAL;
import DTO.PhongTroDTO;
import java.sql.ResultSet;
/**
 *
 * @author TOAN
 */
public class PhongTroBLL {
    PhongTroDAL phongTro = new PhongTroDAL();
    
    public ResultSet LoadThongTinPhong() throws Exception {
        return phongTro.LoadThongTinPhong();
    }
    
    public ResultSet LoadChiTietThuePhong(PhongTroDTO phongTroDTO) throws Exception {
        return phongTro.LoadChiTietThuePhong(phongTroDTO);
    }
    
    public ResultSet LoadTienPhong(PhongTroDTO phongTroDTO) throws Exception {
        return phongTro.LoadTienPhong(phongTroDTO);
    }
}
