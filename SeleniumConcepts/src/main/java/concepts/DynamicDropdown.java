package concepts;
import java.util.List;

//video v5
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kogan\\OneDrive\\Desktop\\jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			driver.findElement(By.id("justAnInputBox")).click();
			
			String[] value= {"choice 2 2","choice 2 3","choice 3"};
			List<WebElement> wbe=driver .findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
			
			if(!value[0].equals("All")) 
			{
				for(WebElement o:wbe) 
				{
					String txt=o.getText();
					for(String v:value) 
					{
						if(txt.equalsIgnoreCase(v)) 
						{
							o.click();
						}
					}
				}
			}

	}

}
