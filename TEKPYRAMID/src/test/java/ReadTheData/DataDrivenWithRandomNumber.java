package ReadTheData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenWithRandomNumber {

	public static void main(String[] args) throws IOException {
		Random random=new Random();
		int randomInt = random.nextInt(1000);
		
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
	    String BROWSER = pro.getProperty("browser");
	    
//	    FileInputStream fis1=new FileInputStream("./src/test/resources/VtigerTestData.xlsx");
//		Workbook wb=WorkbookFactory.create(fis1);
//		String orgName = wb.getSheet("VTIGER").getRow(1).getCell(2).toString() + randomInt;
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();
//		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgName);
//		

	}

}
