package xyzFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.DataProvider;
public class ExcelReader {

	@DataProvider(name="Input")
//Import import org.testng.annotations.DataProvider; and then write @Dataprovider,Then it will work
	public static String[][] getData() throws IOException{
	String[][] testData=null;
	FileInputStream fis=new FileInputStream("C:/Users/kogan/eclipse-workspace/SeleniumConcepts/src/main/java/xyzFramework/Input.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	int rowcount=sheet.getLastRowNum();

	int colmcount=sheet.getRow(0).getLastCellNum();

	System.out.println(rowcount);
	System.out.println(colmcount);
	testData=new String[rowcount][colmcount];

	for(int i=1;i<=rowcount;i++) {//1<=4-T

	XSSFRow row=sheet.getRow(i);

	for(int j=0;j<colmcount;j++) {

	String cellData=row.getCell(j).getStringCellValue();

	testData[i-1][j]=cellData;
	}
	}
	return testData;
	}
}
