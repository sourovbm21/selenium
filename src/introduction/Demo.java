package introduction;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
	
  System.out.println("hello i am in");
  System.setProperty("webdriver.chrome.driver","/Users/tohidur/Downloads/chromedriver");
  WebDriver driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
  driver.manage().window().maximize();
  /*
  //driver.findElement(By.cssSelector(".search-keyword")).sendKeys("be");
  String[] itemsNeeded= {"Cucumber","Brocolli"};
  additem(driver, itemsNeeded);
  driver.findElement(By.xpath("//a[@class='cart-icon'] ")).click();
  driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
  driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector(".promoBtn")).click();
System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
//explicit wait 


  
 }
public static void additem( WebDriver driver,  String[] itemsNeeded) {
	
	List<WebElement> products=driver.findElements(By.cssSelector(".product-name"));
	 int j=0;
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 for(int i=0;i<products.size();i++) 
	 {
		String[] name= products.get(i).getText().split("-");
		String formatedName=name[0].trim();
		List itemNeededList=Arrays.asList(itemsNeeded);
		
		if(itemNeededList.contains(formatedName)) 
		{ 
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			if(j==3)
			{
				break;
			}
		}
	 }*/
 //autosuggestive dropdown
  
	 driver.get("https://ksrtc.in/oprs-web/");
	 driver.findElement(By.id("fromPlaceName")).clear();
	 driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
	 Thread.sleep(3l);
	 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
	 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
	// driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
	System.out.println( driver.findElement(By.id("fromPlaceName")).getText());
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String script="return document.getElementById(\"fromPlaceName\").value;";
	String text=(String) js.executeScript(script);
	System.out.println(text);
	int i=0;
	
	while(!text.equalsIgnoreCase("BENGALURU AIRPORT"))//BENGALURU AIRPORT
	{  
		i++;
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		text= (String) js.executeScript(script);
		 System.out.println(text);
		 if(i>3)
		 {
			 break;
		 }
	}
	if(i>3) {
		System.out.println("element not found");
	}
	else {
		System.out.println("element found");
	}
	 
	 
}

}
