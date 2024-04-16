package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//create the object of FileInputStream class
		FileInputStream fis = new FileInputStream("./testData/Facebook.xlsx");
				
		//open the workbook in a readable  mode
		Workbook book = WorkbookFactory.create(fis);
				
		//get the sheet
		Sheet sheet = book.getSheet("CommonData");
				
		//get the row
		Row row = sheet.getRow(1);
				
		//get the cell
		Cell key = row.getCell(0);
		System.out.println(key);	
				
		//get the password
		Cell password = row.getCell(1);
		System.out.println(password);
				
		//convert into string
		String url = key.getStringCellValue();
		System.out.println(url);
			
				
	}

}
