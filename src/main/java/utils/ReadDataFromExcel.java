package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadDataFromExcel {

	@DataProvider(name = "IRCTCTC001")
	public static String[][] dataProviderTC001() {
		
		
		String[][] testdata = null;
		try {
			FileInputStream fis = new FileInputStream("./TestData/TC001.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("TC001");
			int rc = sheet.getLastRowNum();
			System.out.println("row count :" + rc);
			int cc = sheet.getRow(0).getLastCellNum();
			System.out.println("column count :" + cc);
			testdata = new String[rc][cc];

			for (int i = 1; i <= rc; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < cc; j++) {
					String data = row.getCell(j).getStringCellValue();
					testdata[i - 1][j] = data;
					System.out.println("Row "+(i-1)+" and column "+j+" data is "+data);
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdata;

	}

}
