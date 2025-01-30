package concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kogan\\OneDrive\\Desktop\\jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.mycontactform.com/");
			driver.manage().window().maximize();
			
			List<WebElement> lst1 = driver.findElements(By.xpath("//*"));
			for(WebElement x:lst1) {
				System.out.println(x.getAttribute("href"));
//output coming null values???				
			}
			driver.quit();
			
	}

}
