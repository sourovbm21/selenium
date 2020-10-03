package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/tohidur/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://m.rediff.com/");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.id("login1")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("hi");
		driver.findElement(By.className("signinbtn")).click();
		
		
		//driver.close();

	}

}
