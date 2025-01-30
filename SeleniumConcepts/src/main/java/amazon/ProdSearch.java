package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProdSearch {
	public static void main(String[] args) {
	
	 WebDriverManager.chromedriver().setup();
     
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
    
      //driver.findElement(By.id("nav-search-submit-button")).click();
     driver.findElement(By.xpath("//div[@id='sac-autocomplete-results-container']/div[1]/div[1]/div[3]")).click();
    //  driver.findElement(By.xpath("(//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"])[3]")).click();
      driver.close();

}
}
