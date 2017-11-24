package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements AutoConstant
{
	public static void readData(String sheet,int n1,int n2) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File f=new File(PATH);
		Workbook wb=WorkbookFactory.create(f);
		Sheet s=wb.getSheet(sheet);
		Row r=s.getRow(n1);
		Cell c=r.getCell(n2);
		String v=c.getStringCellValue();
		System.out.println(v);
		
	}

}