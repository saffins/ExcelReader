package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {

	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet = null;
	
	public App(String path){
		
		try {
			workbook = new XSSFWorkbook(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = workbook.getSheetAt(0);

		
	}

	public static String getDataString(int row, int column) {

		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;

	}

	public static double getDataInteger(int row, int column) {

		double data = sheet.getRow(row).getCell(column).getNumericCellValue();

		return data;

	}
	
	public static int getRowCount(){
		
		int row =sheet.getPhysicalNumberOfRows();
		
		return row;
	}
	
	public static int getColumnCount(){
		
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		
		return column;
		
	}

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"C:\\JavaWorkspace\\DataDrivenFramework\\src\\test\\resources\\excel\\LoginTest.xlsx");
		
		String num = getDataString(0,1);
		//double data = getDataInteger(0,1);

		System.out.println(num);
		
		 * Iterator<Row> rows = sheet.iterator();
		 * 
		 * Row first = rows.next();
		 * 
		 * Iterator<Cell> cell = first.cellIterator(); int k = 0; int column =0;
		 * while(cell.hasNext()){
		 * 
		 * 
		 * Cell cell1 = cell.next();
		 * 
		 * if(cell1.getStringCellValue().equalsIgnoreCase("username")){
		 * 
		 * column=k;
		 * 
		 * }
		 * 
		 * k++;
		 * 
		 * 
		 * }
		 * 
		 * Object[][] data = new Object[4][2]; while(rows.hasNext()){
		 * 
		 * Row row = rows.next();
		 * System.out.println(row.getCell(column).getStringCellValue()); }
		 
	}
*/
}
