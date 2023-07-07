package genericLibraries;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility implements IAutoConstants {
	
	
	public String readingSingleData(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		File file = new File(EXCELFILE);
		Workbook workbook = WorkbookFactory.create(file);
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(colNum).toString();
	}
	
	@DataProvider(name="testdata")
	
	public Object[][]readingMutipleData() throws EncryptedDocumentException, IOException{
		
		File file = new File(EXCELFILE);
		Workbook workbook = WorkbookFactory.create(file);
		
		Sheet sheet = workbook.getSheet("Sheet2");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data = new Object[rowCount][cellCount];
		Row actualRow;
		
		for(int row=0;row<rowCount;row++) {
			actualRow = sheet.getRow(row);
		
			for(int cell=0;cell<actualRow.getLastCellNum();cell++) {
			data[row][cell]=actualRow.getCell(cell).toString();
		}
		}
		return data;
		
	}

}
