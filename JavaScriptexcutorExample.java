import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptexcutorExample
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/index.php");
		
		driver.manage().window().maximize();
		
		//1.firstly we need to create reference variable of javascript executor interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//2.in javascript interface we have 2 method executeScript and executeAsyncScript
		driver.findElement(By.name("uid")).sendKeys("Paresh");
		driver.findElement(By.name("password")).sendKeys("paresh123");
		
		WebElement login = driver.findElement(By.name("btnLogin"));
		
		//we will use below javascript to click on login button.
		js.executeScript("arguments[0].click();", login);
		
		//we will use below javascript to handel the alert
		js.executeScript("alert('User or Password is not valid');");
		
		
		String title = js.executeScript("", args)
		 
		
		
		
		
		
	}

}
