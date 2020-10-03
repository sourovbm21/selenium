package updated;




import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		

		
		System.setProperty("webdriver.chrome.driver","/Users/tohidur/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement search_button=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		
		flash(search_button,driver);//this method changing search button colour 
		drawBorder(search_button,driver);//this method draw a box around search button 
		//generateAlert("there is an issur in login page ",driver);//creating allert on that button
		clickElementByJs(search_button,driver);
		refreshBrowser(driver);
		getTitleByJs(driver);
		
		//getting innerText of that page 	
		System.out.println("inner text is : "+getPageInnerText(driver));
		scrollPageDown(driver);
		
		
		WebElement into=driver.findElement(By.xpath("//a[contains(@title,'Women's Wallets')]"));
		scrollIntoView(into,driver);
	
		
		
		Thread.sleep(15000);
		driver.quit();
	}
	


	public static void flash(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolour=element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++) {
			changeColour("rgb(128,128,128)",element,driver);
			changeColour(bgcolour,element,driver);
		}
	}

	public static void changeColour(String colour,WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+colour+"'",element);
	}
	
	public static void drawBorder(WebElement element ,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	
	
	public static void generateAlert(String message,WebDriver driver ) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementByJs(WebElement element ,WebDriver driver) {
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowser(WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	

	private static String getTitleByJs(WebDriver driver) {
		    JavascriptExecutor js=((JavascriptExecutor)driver);
		    String title=js.executeScript("return document.title;").toString();
		   System.out.println("title is : "+title);
		   return title;
		
	}

	private static String  getPageInnerText(WebDriver driver) {
		
 JavascriptExecutor js=((JavascriptExecutor)driver);
 String inner_text=js.executeScript("return document.documentElement.innerText;").toString();
 return inner_text;
 
	}
	
	 public static void scrollPageDown(WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    }
	
	 public static void scrollIntoView(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeAsyncScript("arguments[0].scrollIntoView(true)d;",element);
	    	
	    }
	
}
