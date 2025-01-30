package cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//video-- v1-cssSelectors
public class CssSelectors {

	public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kogan\\OneDrive\\Desktop\\jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		
//Total 7 ways and a shortcut
//1st way==tagname ,id---------Syntax: tagname#id
	//	driver.findElementBy.CssSelector("input#user").sendKeys("koganti"); //This is also different way of writing code depending on the driver
		driver.findElement(By.cssSelector("input#user")).sendKeys("koganti");
		driver.findElement(By.cssSelector("input#user")).clear();
//2nd way= tagname and classname---------Syntax: tagname.classname
		driver.findElement(By.cssSelector("input.txt_log")).sendKeys("koganti");
		driver.findElement(By.cssSelector("input.txt_log")).clear();
//3rd way=tagname and attribute------Syntax: tagname[attribute='value']
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("koganti");
		driver.findElement(By.cssSelector("input[type='text']")).clear();
//4th way: classname and attribute-------Syntax: tagname.classname[attribute='value']
		driver.findElement(By.cssSelector("input.txt_log[type='text']")).sendKeys("koganti");
		driver.findElement(By.cssSelector("input[type='text']")).clear();
//5th way:tagname and prefix of attribute------Syntax: tagname[attribute^='prefix value']
		driver.findElement(By.cssSelector("input[type^='te']")).sendKeys("koganti");
		driver.findElement(By.cssSelector("input[type='text']")).clear();
//6th way:tagname and suffix of attribute------Syntax: tagname[attribute$='suffix value']
		driver.findElement(By.cssSelector("input[type$='xt']")).sendKeys("koganti");
		driver.findElement(By.cssSelector("input[type='text']")).clear();		
//7th way:tagname and substring of attribute------Syntax: tagname[attribute*='substring value']
		driver.findElement(By.cssSelector("input[type*='tex']")).sendKeys("koganti");
		driver.findElement(By.cssSelector("input[type='text']")).clear();	
//shortcut: Right click on xpath,copy--->copy selector 
		driver.findElement(By.cssSelector("#user")).sendKeys("koganti");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
