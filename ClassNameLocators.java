import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocators 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\software\\chrome\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/facebook.html");
			
			WebElement username=driver.findElement(By.className("inputtext"));
			WebElement password=driver.findElement(By.className("inputtext"));
			
			username.sendKeys("rucha");
			password.sendKeys("rucha123");
	}
	

}
