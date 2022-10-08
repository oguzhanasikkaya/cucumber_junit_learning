package com.cydeo.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void read_from_excel_file() throws IOException {
        String path = "C:\\Users\\oguzh\\OneDrive\\Masaüstü\\SampleData.xlsx";

        //to read from excel we need to load it to FileInput Stream

        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook>sheet>row>sell


        //<1> Create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //<2> We need to get specific sheet from currently opened workbook

        XSSFSheet sheet = workbook.getSheet("Employees");

        //<3> Select row and cell
        //Print out fatma cell
        //ındex start form 0

        System.out.println(sheet.getRow(3).getCell(0));
        System.out.println(sheet.getRow(1).getCell(2));

        //Return the count of used cells only
        //Starts counting from 1
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);

        //Returns the number form top cell to bottom cell
        //It does not care if the cell is empty or not
        //Starts counting from zero

        int lastUsedRow = sheet.getLastRowNum();
        System.out.println(lastUsedRow);

        //TODO: Create a logic to print oguzhan' name
        for (int rowNum=0; rowNum<usedRows; rowNum++){

            if (sheet.getRow(rowNum).getCell(0).toString().equals("oguzhan")){
                System.out.println(sheet.getRow(rowNum).getCell(1));
            }
        }

        //TODO: create a logic to print out Fatma's jobTitle
        //check  if name is Fatma --> pritnt out Job title of Fatma
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("fatma")){
                System.out.println(sheet.getRow(rowNum).getCell(2));
            }
        }

        workbook.close();


    }

}
