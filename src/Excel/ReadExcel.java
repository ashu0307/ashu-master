package Excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
	 
		
		File file = new File("D:/ExcelData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell column = row.getCell(0);
		String data =column.getStringCellValue();
		System.out.println("Data in the Excel is "+data);


	}

}
