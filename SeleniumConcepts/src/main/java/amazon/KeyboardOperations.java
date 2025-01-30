package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperations {

	@Test
	public static void prime() throws InterruptedException {
	
		 
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.navigate().to("https://www.amazon.in/");
		Thread.sleep(9000);
		WebElement wb=cd.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		Actions act=new Actions(cd);
		act.moveToElement(wb).build().perform();
		
		cd.findElement(By.xpath("//a[@href='/gp/primecentral?ref_=nav_AccountFlyout_prime']")).click();
		
		cd.close();
		
	}	

}
