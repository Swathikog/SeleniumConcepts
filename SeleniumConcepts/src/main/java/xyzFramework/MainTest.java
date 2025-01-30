package xyzFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainTest extends TryCatchMethods{

	@Test(dataProvider = "Input", dataProviderClass = ExcelReader.class)
	public static void execute(String FirstName,String LastName,String PostCode) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Bank Manager Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add Customer')]")).click();
		Thread.sleep(5000);
		
		textField(prop.getProperty("FirstN"),FirstName);
		textField(prop.getProperty("LastN"),LastName);
		textField(prop.getProperty("PostC"),PostCode);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
