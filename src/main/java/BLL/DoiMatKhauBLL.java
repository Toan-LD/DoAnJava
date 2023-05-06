/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.DoiMatKhauDTO;
import java.sql.ResultSet;
import DAL.DoiMatKhauDAL;
/**
 *
 * @author TOAN
 */
public class DoiMatKhauBLL {
    DoiMatKhauDAL doiMatKhauDAL = new DoiMatKhauDAL();
    public ResultSet KiemTraTaiKhoan(DoiMatKhauDTO doiMatKhauDTO) throws Exception {
        return doiMatKhauDAL.KiemTraTaiKhoan(doiMatKhauDTO);
    }
    
    public int DoiMatKhauADMIN(DoiMatKhauDTO doiMatKhauDTO) 
    {
        return doiMatKhauDAL.DoiMatKhauADMIN(doiMatKhauDTO);
    }
}
