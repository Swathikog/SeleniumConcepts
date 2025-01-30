package xyzFramework;

import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TryCatchMethods {
	static WebDriver driver;
	public static Properties prop;
	
public void loadObjects(){
		
		try {
			 prop = new Properties();	
			prop.load(new FileInputStream("./src/main/java/xyzFramework/Prop.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void textField(String xpath,String Data) {
		
		try {
		driver.findElement(By.xpath(xpath)).sendKeys(Data);
		}
		catch(NoSuchElementException e) {
			//TakeScreenShot.captureScreenshot(driver, filename);
			System.out.println("No such element exception");
		}
		catch(ElementNotInteractableException e) {
				System.out.println("No such element exception");
			}
		catch(WebDriverException e) {
				System.out.println("No such element exception");
			}
		
	}

}
