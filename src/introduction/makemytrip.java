package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/tohidur/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
	WebElement	FROM =driver.findElement(By.xpath("//input[@placeholder='From']"));
			FROM.sendKeys("MUM");
		Thread.sleep(3000);
		FROM.sendKeys(Keys.ARROW_DOWN);
		FROM.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("input[id='toCity']")).click();
	WebElement	destination=driver.findElement(By.cssSelector("input[autocomplete='off']"));
	destination.sendKeys("CHE");
	Thread.sleep(3000);
	destination.sendKeys(Keys.ARROW_DOWN);
	destination.sendKeys(Keys.ENTER);
		
		

		
		/*driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		    System.out.println(driver.getTitle());

		    Thread.sleep(3000);

		    driver.findElement(By.xpath("//input[@id='fromCity']")).click();

		    Thread.sleep(3000);

		    WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));

		    source.sendKeys("Mum");

		    Thread.sleep(2000);

		    source.sendKeys(Keys.ARROW_DOWN);

		    source.sendKeys(Keys.ENTER);*/

	}

}
