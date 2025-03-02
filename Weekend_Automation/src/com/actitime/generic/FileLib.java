package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * It is a generic class containing generic methods to read and write data from property file and excel file
 * @author QSP
 */
public class FileLib {
	/**
	 * It is a generic method to read the data from property file
	 * @param key
	 * @return the value based on the mentioned key name
	 * @throws IOException
	 */
public String getPropertyData(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
/**
 * It is a generic method to read the data from excel file
 * @param sheetName
 * @param row
 * @param cell
 * @return The data fr
 * om the mentioned sheetName, row index, cell index
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	return wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
}
/**
 * It is a generic method to write the data into mentioned sheetName, row index, cell index and cell value
 * @param sheetName
 * @param row
 * @param cell
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void setExcelData(String sheetName,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
}
}
