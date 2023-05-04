/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.ThongKeDAL;
import DTO.ThongKeDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class ThongKeBLL {
    ThongKeDAL thongKeDAL = new ThongKeDAL();
    public ResultSet LoadThang() throws Exception {
        return thongKeDAL.LoadThang();
    }
    
    public ResultSet LoadHDTheoThang(ThongKeDTO thongKeDTO) throws Exception {
        return thongKeDAL.LoadHDTheoThang(thongKeDTO);
    }
    
    public ResultSet LoadTienPhongTheoMa(ThongKeDTO thongKeDTO) throws Exception
    {        
        return thongKeDAL.LoadTienPhongTheoMa(thongKeDTO);
    }
    
    public ResultSet LoadTienDichVuTheoMa(ThongKeDTO thongKeDTO) throws Exception {
        return thongKeDAL.LoadTienDichVuTheoMa(thongKeDTO);
    }
    
    public ResultSet TongTien() {
        return thongKeDAL.TongTien();
    }
    
    public ResultSet TongTienTheoThang(ThongKeDTO thongKeDTO) throws Exception {
        return thongKeDAL.TongTienTheoThang(thongKeDTO);
    }
    
    public ResultSet TongTienTheoThangCuaPhong(ThongKeDTO thongKeDTO) throws Exception
    {        
        return thongKeDAL.TongTienTheoThangCuaPhong(thongKeDTO);
    }
}
