package org.example.part4.ch1;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelExample {
    // 1
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(new File("example.xlsx"));
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet){
            for (Cell cell : row){
                switch (cell.getCellType()){
                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)){
                            Date dateValue = cell.getDateCellValue();
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            String formattedDate = dateFormat.format(dateValue);
                            System.out.println(formattedDate+"\t");
                        }else {
                            double numbericValue = cell.getNumericCellValue();
                            if (numbericValue == Math.floor(numbericValue)){
                                int intValue = (int) numbericValue;
                                System.out.println(intValue+"\t");
                            }else {
                                System.out.println(numbericValue+"\t");
                            }
                        }
                        break;
                    case STRING:
                        String stringValue = cell.getStringCellValue();
                        System.out.println(stringValue+"\t");
                        break;
                    case BOOLEAN:
                        boolean booleanValue = cell.getBooleanCellValue();
                        System.out.println(booleanValue+"\t");
                        break;
                    case FORMULA:
                        String formulaValue = cell.getCellFormula();
                        System.out.println(formulaValue+"\t");
                        break;
                    case BLANK:
                        System.out.println("\t");
                        break;
                    default:
                        System.out.println("\t");
                        break;
                }
            }
            System.out.println();
        }
        file.close();
        System.out.println("엑셀에서 데이터 읽어오기 성공.");
    }
}
