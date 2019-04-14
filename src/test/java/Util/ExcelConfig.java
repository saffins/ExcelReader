package Util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	XSSFWorkbook wb;

	XSSFSheet sheet;

	public ExcelConfig(String path) {

		try {

			File src = new File(path);

			FileInputStream fs = new FileInputStream(src);

			wb = new XSSFWorkbook(fs);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	public String getData(int sheetNum, int row, int column) {

		sheet = wb.getSheetAt(sheetNum);

		String data = sheet.getRow(row).getCell(column).getStringCellValue();

		return data;
	}

	public int getRowCount(int sheetIndex) {

		int row = wb.getSheetAt(sheetIndex).getLastRowNum();

		row = row + 1;

		return row;
	}

}
