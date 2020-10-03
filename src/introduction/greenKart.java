package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class greenKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/tohidur/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();	
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();	
		List<WebElement> firstColist=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
	/*	ArrayList<String> originalList=new ArrayList<String>();
		for(int i=0;i<firstColist.size();i++)
		{
		originalList.add(firstColist.get(i).getText());
		
			
		}
		System.out.println("originalList : "+originalList);
		ArrayList<String>copiedList=new ArrayList<>();
	     
		for(int i=0;i<originalList.size();i++) {
			copiedList.add(originalList.get(i));
		}
		
	
		System.out.println("copiedList : "+copiedList);
	//Assert.assertTrue(originalList.equals(copiedList));
		
	if(originalList.equals(copiedList)) {
		System.out.println("i am in Ascending by default");
	} else {
		System.out.println("i am not in Ascending by default");
	}*/

ArrayList<String>originalList=new ArrayList<>();
		for(int i=0;i<firstColist.size();i++) {
			originalList.add(firstColist.get(i).getText());
		}
ArrayList<String>copiedList=new ArrayList<>();

		for(int i=0;i<originalList.size();i++) {
			copiedList.add(originalList.get(i));
			
		}
		
		Collections.sort(copiedList);
		Assert.assertTrue(originalList.equals(copiedList));
		
		
	}

}
