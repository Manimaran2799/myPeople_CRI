/*
 * Read the Data from excel 
 * steps:
 * Locate the file 
 * locate the workbook and sheet
 * locate the row and cell
 * print the value
 * 
 */

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_Read {

	public static void main(String[] args) throws IOException {
		
		//locate the path
		String filepath="./test_Data/Cricket.xlsx";
		
		//load the path
		Workbook wb=new XSSFWorkbook(filepath);
		
		//locate the sheet
		Sheet sheet = wb.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		int lastcell=sheet.getRow(0).getLastCellNum();
		
		
		for (int i = 1; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < lastcell; j++) {
				Cell cell = row.getCell(j);
				DataFormatter data=new DataFormatter();
				String value = data.formatCellValue(cell);
				System.out.println(value);
			} 
		}
		

	}

}
