/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DoiMatKhauDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class DoiMatKhauDAL {
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    public ResultSet KiemTraTaiKhoan(DoiMatKhauDTO doiMatKhauDTO) throws Exception {
        String sql = "select * from USER_KHACH_THUE where Username = '"+ doiMatKhauDTO.getTaiKhoan() + "' and pwd = '" +doiMatKhauDTO.getMatKhau()+ "'";
        return rs = data.executeQuery(sql);
    }
    
    public int DoiMatKhauADMIN(DoiMatKhauDTO doiMatKhauDTO) 
    {
        int thamso = 2;
        Object[] giatri = new Object[thamso];
        giatri[0] = doiMatKhauDTO.getTaiKhoan();
        giatri[1] = doiMatKhauDTO.getMatKhauMoi();
        
        return data.Update("{call DoiMatKhauADMIN(?,?)}", giatri, thamso);
    }
}
