package w1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Title {

	static WebDriver driver;
	
	public static void main(String[] args) {
//For WebDriverManager,ExecuteScript is not working even we use JavaScriptExecutor Upcasting statement.
//So we are use System.setProperty()
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kogan\\OneDrive\\Desktop\\jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
//title and URL		
		
		System.out.println( driver.executeScript("return.document.title"));
		
		System.out.println(driver.executeScript("return.document.URL"));
//Zoom in and out
		driver.executeScript("document.body.style.zoom='200%'");
		driver.executeScript("document.body.style.zoom='100%'");
		driver.executeScript("document.body.style.zoom='20%'");
//scroll down
		driver.executeScript("window.scrollBy(0,300)");
//small amount of scrolling
		driver.executeScript("window.scrollBy(0,-300)");
//start scrolling. stop once element is identified
		WebElement ele=driver.findElement(By.cssSelector("#mousehover"));
		driver.executeScript("arguments[0].scrollIntoView(true);",ele);
//Find an element using executescript
/*getElementById
 *getElementByName 
 * getElementByClassName
 */
		driver.executeScript("document.getElementById('user').value='hi'");
		driver.executeScript("document.getElementsByName('btnSubmit')[0].click()");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
