package com.qa.ticker.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilities {

	public static String TestData_file_path = "/home/praful/eclipse-workspace/Ticker"
			+ "/src/main/java/com/qa/ticker/testdata/TestGanpatiMandal.xlsx";
	static Workbook book;
	static Sheet sheet;

	public static Object[][] getdata(String Sheetname) throws InvalidFormatException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TestData_file_path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(Sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println(row + "," + cell);
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}

		}
		return data;

	}

}
