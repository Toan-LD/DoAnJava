/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import DTO.PhongTroDTO;
import java.sql.*;
/**
 *
 * @author TOAN
 */
public class PhongTroDAL {
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    //load thông tin các phòng
    public ResultSet LoadThongTinPhong() throws Exception {
        String sql = "select MaPhong, (case when TrangThai = '1' then N'Phòng đã thuê' else N'Phòng còn trống' end) as TrangThai, ThongTinPhong, (case when SoNguoi is null then 0 else SoNguoi end) as SoNguoi from PHONG_TRO";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    public ResultSet LoadChiTietThuePhong(PhongTroDTO phongTro) throws Exception {
        String sql = "select PHONG_TRO.MaPhong, CT_KHACH_THUE.MaKhach, TenKhach, Phai, NgheNghiep, NgayVaoPhong from PHONG_TRO, CT_KHACH_THUE, KHACH_THUE where PHONG_TRO.MaPhong = CT_KHACH_THUE.MaPhong and	CT_KHACH_THUE.MaKhach = KHACH_THUE.MaKhach and PHONG_TRO.MaPhong = '"+phongTro.getMaPhong()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    public ResultSet LoadTienPhong(PhongTroDTO phongTro) throws Exception{
        String sql = "select PHONG_TRO.MaPhong, PARSENAME(convert(varchar, convert(money, GiaTien),1),2) as GiaTien from GIA_THUE left join PHONG_TRO on PHONG_TRO.SoNguoi = GIA_THUE.SoNguoi  where PHONG_TRO.SoNguoi = "+ phongTro.getSoNguoi() +"	and MaPhong = '" +phongTro.getMaPhong()+ "'";
        return rs = data.executeQuery(sql);
    }
}
