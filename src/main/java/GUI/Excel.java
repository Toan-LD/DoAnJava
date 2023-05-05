package GUI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;

public class Excel {
    public void writeExcel(JTable table, String header, String sheetName) {
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(table.getParent());
            File savefile = jFileChooser.getSelectedFile();
            if (savefile != null) {
                savefile = new File(savefile.toString() + ".xlsx");
                XSSFWorkbook wb = new XSSFWorkbook();
                XSSFSheet sheet = wb.createSheet(sheetName);
                //tạo hàng đầu tiên để đặt tiêu đề cho bảng
                Row rowCol = sheet.createRow(0);

                // Set title
                CellStyle titleStyle = wb.createCellStyle();
                titleStyle.setAlignment(HorizontalAlignment.CENTER);
                XSSFFont font = wb.createFont();
                font.setBold(true);
                font.setFontHeightInPoints((short) 16);
                titleStyle.setFont(font);
                Cell titleCell = rowCol.createCell(0);
                titleCell.setCellValue(header);
                titleCell.setCellStyle(titleStyle);
                sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, table.getColumnCount() - 1));

                // Set header
                CellStyle headerStyle = wb.createCellStyle();
                headerStyle.setAlignment(HorizontalAlignment.CENTER);
                Row rowHeader = sheet.createRow(1);
                for (int i = 0; i < table.getColumnCount(); i++) {
                    Cell cell = rowHeader.createCell(i);
                    cell.setCellValue(table.getColumnName(i));
                    cell.setCellStyle(headerStyle);
                }

                // Set data
                CellStyle dataStyle = wb.createCellStyle();
                dataStyle.setAlignment(HorizontalAlignment.CENTER);
                for (int j = 0; j < table.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 2);
                    for (int k = 0; k < table.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (table.getValueAt(j, k) != null) {
                            cell.setCellValue(table.getValueAt(j, k).toString());
                        }
                        cell.setCellStyle(dataStyle);
                    }
                }

                // Set column widths for data rows
                for (int i = 0; i < table.getColumnCount(); i++) {
                    sheet.autoSizeColumn(i);
                }
                try (FileOutputStream out = new FileOutputStream(new File(savefile.toString()))) {
                    wb.write(out);
                }
                JOptionPane.showMessageDialog(null, "Xuất File Excel thành công");

            } else {
                JOptionPane.showMessageDialog(null, "Xuất File Excel thất bại");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
        }
    }
}
