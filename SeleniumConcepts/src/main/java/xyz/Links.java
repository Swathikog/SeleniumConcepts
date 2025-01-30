package xyz;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	@Test(priority=0)
	public static void CustomerLogin() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[contains(text(),'Customer Login')]")).click();
		driver.findElement(By.xpath("//button[text()='Customer Login']")).click();
		Thread.sleep(5000);
		WebElement wbe=driver.findElement(By.id("userSelect"));
		Select sel=new Select(wbe);
		sel.selectByVisibleText("Harry Potter");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[ @ng-click='deposit()' ]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("2000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@ng-class='btnClass3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("200");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		String text=driver.findElement(By.xpath("//span[@class='error ng-binding']")).getText();
		Thread.sleep(5000);		
		Assert.assertEquals(text, "Transaction successful","Transaction success");	
		driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//table"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Logout']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Home']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
		@Test(priority=-1)
		public static void BankManagerLogin() throws InterruptedException {
			
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
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Amana");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Cooper");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("88765");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Open Account')]")).click();
		Thread.sleep(3000);
		WebElement wb1=driver.findElement(By.id("userSelect"));
		Select sel1=new Select(wb1);
		sel1.selectByIndex(3);
		Thread.sleep(3000);
		WebElement wb2=driver.findElement(By.id("currency"));
		Select sel2=new Select(wb2);
		sel2.selectByValue("Pound");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		Alert all=driver.switchTo().alert();
		all.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Customers')]")).click();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//table/tbody/tr[6]/td[5]")).click();
		driver.findElement(By.xpath("//table/tbody//tr/td[contains(text(),'Harry')]/following-sibling::td/button")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
