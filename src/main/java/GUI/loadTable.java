/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TOAN
 */
public class loadTable {
    public void loadJTable(ResultSet rs, JTable Tablename){
        try{
            DefaultTableModel tableModel = new DefaultTableModel();//tạo một model table
            ResultSet result = rs;
            ResultSetMetaData metaData = result.getMetaData();
            int colCount = metaData.getColumnCount();//Tạo biến để đếm số cột
            ArrayList<String> arrayCols = new ArrayList<String>();
            for(int i=1;i<=colCount;i++) 
                arrayCols.add(metaData.getColumnName(i));
            //Set title cho mỗi cột
            tableModel.setColumnIdentifiers(arrayCols.toArray());//Tạo một mảng kiểu object để lưu trữ từng dòng dữ liệu
            
            ArrayList<Object> arrayRow = new ArrayList<Object>();
            while(result.next()){
                for(int i = 1; i<=colCount;i++)
                    arrayRow.add((result.getObject(i)));// add dữ liệu vào ArrayList
                tableModel.addRow(arrayRow.toArray());// add 1 dòng dữ liệu vào dftablemodel
                arrayRow.clear();
            }
            Tablename.setModel(tableModel);
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(loadTable.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    //Hàm load dữ liệu vào cbb: gồm 3 giá trị: resultSet, tên ccbm tên cột cần lấy giá trị
    public void loadJcombobox(ResultSet _rs, JComboBox cbb, String tenCot) throws SQLException {
        ResultSet rs = _rs;
        cbb.removeAllItems();
        while(rs.next()){
            cbb.addItem(rs.getString(tenCot)); // add từng hàng vào cbb
        }
    }
}
