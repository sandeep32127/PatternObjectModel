package utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.Test;

public class Exel {
	
	
	public static void getTestData(String sheetName , String fileName) throws IOException, BiffException{
		String basePath = new File(".").getCanonicalPath() + File.separator + "src"+ File.separator + "main" + File.separator + "resources" + File.separator +"datafiles" + File.separator ;
		String dataFilePath = basePath+fileName;
		File fis = new File(dataFilePath);
		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(fis);
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet(sheetName);
		
		int rows = sheet.getRows();
		int columns = sheet.getColumns();//HashMap<String, HashMap<String, String>>
		
		HashMap<String, HashMap<String, String>> result = new HashMap<String, HashMap<String, String>>(rows-1);
		
		for (int i = 1; i < rows; i++) {
			HashMap<String, String> testData = new HashMap<String, String>();
			for (int j = 0; j < columns; j++) {
				testData.put(sheet.getCell(j, 0).getContents(), sheet.getCell(j, i).getContents());
			}
			result.put(sheet.getCell(0, i).getContents(), testData);
		}
		
		//return result;
		
		
	}

}
