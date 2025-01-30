package concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//video v1-cssselectors

public class TotalLinks {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kogan\\OneDrive\\Desktop\\jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.mycontactform.com/");
			driver.manage().window().maximize();
//To get total links			
			List<WebElement> lst = driver.findElements(By.xpath("//*"));
			List<WebElement> lst1 = driver.findElements(By.xpath("//*"));
			System.out.println("Total elements size "+lst1.size());
//To get total images
			List<WebElement> images = driver.findElements(By.xpath("img"));
			System.out.println("Total images  are "+images.size());
			driver.quit();
	}

}
