package com.cydeo.test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {


    @Test
    public void excel_write() throws IOException {

        String path = "C:\\Users\\oguzh\\OneDrive\\Masaüstü\\SampleData.xlsx";

        //to read from excel we need to load it to FileInput Stream

        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook>sheet>row>sell


        //<1> Create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //<2> We need to get specific sheet from currently opened workbook

        XSSFSheet sheet = workbook.getSheet("Employees");

        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(20000);
        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(25000);
        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue(27000);
        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary4.setCellValue(22000);
        
        // TODO: changes oguzhan' last name to aşıkkya

        int usedRows = sheet.getPhysicalNumberOfRows();
        int lastUsedRow = sheet.getLastRowNum();

        for (usedRows = 0; usedRows  <sheet.getLastRowNum() ; usedRows++) {
            if (sheet.getRow(usedRows).getCell(0).toString().equals("oguzhan")){
                sheet.getRow(usedRows).getCell(1).setCellValue("aşıkkaya");
            }
        }


        //open to write to the file: FileInputStream --> reading
        //save changes             : FileOutputStream--> writing

        FileOutputStream outputStream = new FileOutputStream(path);

        //save/write changes to the workbook

        workbook.write(outputStream);
        //close all
        outputStream.close();
        workbook.close();
        fileInputStream.close();



    }
}
