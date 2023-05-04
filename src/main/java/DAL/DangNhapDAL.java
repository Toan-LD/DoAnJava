/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.ResultSet;
import DTO.DangNhapDTO;
/**
 *
 * @author TOAN
 */
public class DangNhapDAL {
    ResultSet rs=null;
    DBAccess data = new DBAccess();
    
    public ResultSet KiemTraTaiKhoan(DangNhapDTO dangnhapModel) throws Exception{
        String sql = "select * from USER_KHACHTHUE where Username = '"+dangnhapModel.getUsername()+"'and pwd = '" +dangnhapModel.getPwd()+"' and IsAdmin = 1";
        rs = data.executeQuery(sql);
        return rs;
    }
}
