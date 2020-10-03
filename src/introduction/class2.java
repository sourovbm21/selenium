package introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class class2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/tohidur/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		/*driver.get("http://google.com");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sourov");
		driver.findElement(By.id("pass")).sendKeys("touhid");
		driver.findElement(By.cssSelector("input[type='submit']")).click();*/
//salesforce
		/*8driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		String text=driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(text);*/
//calender ui
	driver.get("https://book.spicejet.com/");
	//.out.println((driver.findElement(By.id("custom_date_picker_id_2")).isEnabled()));
	System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
	  driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
	  System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
	 // System.out.println((driver.findElement(By.id("custom_date_picker_id_2")).isEnabled()));
	if(driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1")) 
	         {
		System.out.println("i am enable");
		Assert.assertTrue(true);
	          }
	           else 
	          {
	        	  Assert.assertTrue(false);
	          }
	//mounth 
	driver.findElement(By.id("custom_date_picker_id_1")).click();
	//String month=driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
	while(!driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText().contains("December"))
	{Thread.sleep(5l);
		driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
	}
	
	//date 
//	driver.findElement(By.id("custom_date_picker_id_1")).click();
Thread.sleep(5l);
	List<WebElement> date=driver.findElements(By.cssSelector(".ui-state-default"));
	int count=date.size();
	for (int i=0;i<count;i++)
	{
		String text =driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
		if(text.equalsIgnoreCase("14")) {
			driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
			break;
		}
	}
		

		
	
	}

}
