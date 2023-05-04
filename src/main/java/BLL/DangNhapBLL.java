/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.DangNhapDAL;
import DTO.DangNhapDTO;
import java.sql.ResultSet;
/**
 *
 * @author TOAN
 */
public class DangNhapBLL {
    DangNhapDAL dangnhap = new DangNhapDAL();
    
    public ResultSet KiemTraTaiKhoan(DangNhapDTO dangnhapModel) throws Exception{
        return dangnhap.KiemTraTaiKhoan(dangnhapModel);
    }
}
