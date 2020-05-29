package Excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumericExcel {

	public static void main(String[] args) throws Exception {
		File file = new File("D:/ExcelData/TestNumeric.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell column = row.getCell(0);
		int data =(int)column.getNumericCellValue();
//		System.out.println("Data in the Excel is "+data);
		String Value=Integer.toString(data);
		System.out.println("Data in the String is "+Value);

	}

}
