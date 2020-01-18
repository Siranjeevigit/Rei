package org.ecom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void exRead(String text ) throws IOException {
		
	
	File loc = new File("C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\Rei\\Excel\\ExcelRead\\ExcelWrite1.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet();
	Row r = s.createRow(2);
	Cell c = r.createCell(2);
	c.setCellValue(text);
	
	FileOutputStream st = new  FileOutputStream(loc);
	w.write(st);
	System.out.println("end");
	
	}

}
