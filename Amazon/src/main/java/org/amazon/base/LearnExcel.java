package org.amazon.base;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class LearnExcel {
	@DataProvider
	public String[][] getExcelData(String excelFileName) throws IOException
	{
		XSSFWorkbook book = new XSSFWorkbook("./Data/"+excelFileName+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		int lastcolumn = sheet.getRow(0).getLastCellNum();
		
		String [][] data = new String[lastrow][lastcolumn];
		for (int i = 1; i <= lastrow; i++) {
			for (int j = 0; j < lastcolumn; j++) {
				data[i-1][j]= sheet.getRow(i).getCell(j).getStringCellValue();
				
			} 
		}
		
		return data;
		
	}
}
