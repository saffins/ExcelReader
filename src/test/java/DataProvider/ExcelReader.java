package DataProvider;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	
	public ExcelReader(String path) throws IOException, InvalidFormatException{
		
		File fileName = new File(path);
		workbook = new XSSFWorkbook(fileName);
		
	}
	
	public String getTestData(String sheet, int row, int column){
		
		sheet = workbook.getSheet(sheet);
		
		
	}

}
