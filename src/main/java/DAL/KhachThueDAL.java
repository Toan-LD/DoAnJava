/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.KhachThueDTO;
import java.sql.ResultSet;

/**
 *
 * @author TOAN
 */
public class KhachThueDAL {
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    //Load tất cả các khách thuê
    public ResultSet LoadAll() throws Exception{
        String sql = "select KHACH_THUE.*, Username from KHACH_THUE left join USER_KHACHTHUE on KHACH_THUE.MaKhach = USER_KHACHTHUE.MaKhach";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Load khách thuê đặt phòng
    public ResultSet LoadKhachThueDatPhong() throws Exception {
        String sql = "select Username,MaKhach, TenKhach, Phai, CMND, NgheNghiep, QueQuan  from USER_KHACHTHUE where TinhTrang = 1";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Tìm kiếm khách theo tên
    public ResultSet TimKiemKhachTheoTen(KhachThueDTO khachthue) throws Exception {
        String sql = "select * from KHACH_THUE where TenKhach like N'%" + khachthue.getTenKhach() + "%'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Tìm kiếm khách theo mã
    public ResultSet TimKiemKhachTheoMa(KhachThueDTO khachthue) throws Exception {
        String sql = "select * from KHACH_THUE where MaKhach like N'%" + khachthue.getMaKhach() + "%'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Tìm kiếm khách theo quê
    public ResultSet TimKiemKhachTheoQueQuan(KhachThueDTO khachthue) throws Exception {
        String sql = "select * from KHACH_THUE where QueQuan like N'%" + khachthue.getQueQuan()+ "%'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Tìm kiếm khách theo nghề
    public ResultSet TimKiemKhachTheoNgheNghiep(KhachThueDTO khachthue) throws Exception {
        String sql = "select * from KHACH_THUE where NgheNghiep like N'%" + khachthue.getNgheNghiep()+ "%'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //thêm khách thuê không đặt phòng trước
    public int ThemKhachThueKhongDatPhong(KhachThueDTO khachthue){
        int thamso = 8;
        Object[] giatri = new Object[thamso];
        giatri[0] = khachthue.getMaKhach();
        giatri[1] = khachthue.getTenKhach();
        giatri[2] = khachthue.getPhai();
        giatri[3] = khachthue.getCmnd();
        giatri[4] = khachthue.getQueQuan();
        giatri[5] = khachthue.getNgheNghiep();
        giatri[6] = khachthue.getTaiKhoan();
        giatri[7] = khachthue.getMatKhau();
        return data.Update("{call ThemKhachThueDatPhong(?,?,?,?,?,?,?,?)}", giatri, thamso);
    }
    //thêm khách thuê có đặt phòng
    public int ThemKhachThueDatPhong(KhachThueDTO khachthue){
        int thamso = 8;
        Object[] giatri = new Object[thamso];
        giatri[0] = khachthue.getMaKhach();
        giatri[1] = khachthue.getTenKhach();
        giatri[2] = khachthue.getPhai();
        giatri[3] = khachthue.getCmnd();
        giatri[4] = khachthue.getQueQuan();
        giatri[5] = khachthue.getNgheNghiep();
        giatri[6] = khachthue.getTaiKhoan();
        giatri[7] = khachthue.getMatKhau();
        return data.Update("{call ThemKhachThueDatPhong(?,?,?,?,?,?,?,?)}", giatri, thamso);
    }
    
    //xóa khách thuê
    public int XoaKhachThue(KhachThueDTO khachthue) {
        int thamso = 2;
        Object[] giatri = new Object[thamso];
        giatri[0] = khachthue.getMaKhach();
        giatri[1] = khachthue.getTenKhach();
        return data.Update("{call XoaKhachThue(?,?)}", giatri, thamso);
    }
    
    //Sửa khách thuê
    public int SuaKhachThue(KhachThueDTO khachthue) {
        int thamso = 6;
        Object[] giatri = new Object[thamso];
        giatri[0] = khachthue.getMaKhach();
        giatri[1] = khachthue.getTenKhach();
        giatri[2] = khachthue.getPhai();
        giatri[3] = khachthue.getCmnd();
        giatri[4] = khachthue.getQueQuan();
        giatri[5] = khachthue.getNgheNghiep();
        return data.Update("{call SuaKhachThue(?,?,?,?,?,?)}", giatri, thamso);
    }
}
