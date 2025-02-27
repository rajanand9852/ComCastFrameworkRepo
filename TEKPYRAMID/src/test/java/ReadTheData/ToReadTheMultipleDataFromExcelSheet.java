package ReadTheData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadTheMultipleDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis1=new FileInputStream("./src/test/resources/VtigerTestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);

		Sheet sh = wb.getSheet("Product");
		int rowCount = sh.getLastRowNum();
		for(int i=1;i<=rowCount;i++) {
			Row row = sh.getRow(i);
			String colData1 = row.getCell(0).toString();
			String colData2 = row.getCell(1).toString();
			System.out.println(colData1 +"\t"+colData2);
		}
	}

}
