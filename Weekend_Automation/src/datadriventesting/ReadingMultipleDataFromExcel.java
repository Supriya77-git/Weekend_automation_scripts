package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadingMultipleDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
//getLastRowNum() is used to get the index of last row which is having data in a sheet
//	int lastRow = wb.getSheet("multipleData").getLastRowNum();
//	System.out.println(lastRow);
//	for(int i=0;i<=lastRow;i++) {
//		String data = wb.getSheet("multipleData").getRow(i).getCell(0).getStringCellValue();
//		System.out.println(data);
//	}
//getLastCellNum() is used to get the count of last cell which is having data in a row
//	short lastCell = wb.getSheet("multipleData").getRow(0).getLastCellNum();
//	System.out.println(lastCell);
//	for(int i=0;i<lastCell;i++) {
//		String data = wb.getSheet("multipleData").getRow(0).getCell(i).getStringCellValue();
//		System.out.println(data);
//	}
int lastRow = wb.getSheet("multipleData").getLastRowNum();
for(int i=0;i<=lastRow;i++) {
short lastCell = wb.getSheet("multipleData").getRow(i).getLastCellNum();
	for(int j=0;j<lastCell;j++) {
String data = wb.getSheet("multipleData").getRow(i).getCell(j).getStringCellValue();
System.out.print(data+" ");
	}
	System.out.println();
}
}
}
