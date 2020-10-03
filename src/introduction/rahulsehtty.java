package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rahulsehtty {
	//control+shift+F(code alignment)

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/tohidur/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*driver.findElement(By.id("name")).sendKeys("sourov");
		driver.findElement(By.id("alertbtn")).click();
		String alerttextt = (driver.switchTo().alert().getText());
		System.out.println(alerttextt);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().dismiss();*/
		driver.findElement(By.cssSelector("#checkBoxOption3")).isSelected();
		driver.findElement(By.cssSelector("#checkBoxOption3")).click();
		driver.findElement(By.cssSelector("#checkBoxOption3")).isSelected();
		String text=driver.findElement(By.xpath("//label[@for='benz']")).getText();
	System.out.println(text);
	
	Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
	s.selectByVisibleText(text);
	driver.findElement(By.id("name")).sendKeys("text");
	driver.findElement(By.cssSelector("#alertbtn")).click();
	String alertText=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	 
	if(alertText.contains(text)) {
		System.out.println("i am ok");
	}
	else {
		System.out.println("i am not ok");
	}
	
		

	}

}
