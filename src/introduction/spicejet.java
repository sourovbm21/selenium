package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/Users/tohidur/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
//static dropdown
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

          
//select location
	Thread.sleep(3000);
		driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='COK'])[1]")).click();
		//driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		

		
//calender
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

//checkboxes
Assert.assertFalse(driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
//System.out.println(driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());	
		driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
Assert.assertTrue(driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());		
//System.out.println(driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());	
int checkBoxCount=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
System.out.println(checkBoxCount);


//raidio button
 //.out.println((driver.findElement(By.id("custom_date_picker_id_2")).isEnabled()));
System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
  driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
  System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
 // System.out.println((driver.findElement(By.id("custom_date_picker_id_2")).isEnabled()));
if(driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1")) 
         {
	System.out.println("i am enable");
	Assert.assertTrue(true);
          }else {
        	  Assert.assertTrue(false);
          }

//select person		
		driver.findElement(By.cssSelector(".paxinfo")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@class='wMed1s required guests']")).click();
		Thread.sleep(3000);
		
		Select s2=new Select(driver.findElement(By.xpath("//select[@class='wMed1s required guests']")));
		s2.selectByIndex(3);
		driver.findElement(By.xpath("(//select[@class='wMed1s required guests'])[2]")).click();
		Thread.sleep(3000);
		Select s3=new Select(driver.findElement(By.xpath("(//select[@class='wMed1s required guests'])[2]")));
		s3.selectByIndex(3);

		
//select currency		
		Select s=new Select(driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']")));
			s.selectByIndex(3);
			s.selectByValue("AED");
//search button
			driver.findElement(By.cssSelector("input[class='bookbtn']")).click();

		driver.close();
	
	

	}
	

}
