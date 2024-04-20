import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWFaceBook 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\software\\chrome\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
//			WebElement username=driver.findElement(By.id("email"));
//			WebElement password=driver.findElement(By.id("pass"));
//			WebElement login=driver.findElement(By.name("login"));
//			
//			username.sendKeys("atharvpakhan13@gmail.com");
//			password.sendKeys("atharv 2005");
//			
//			login.click();
			
			WebElement username = driver.findElement(By.className(""));
			WebElement password = driver.findElement(By.className(""));
			
			username.sendKeys("Rucha");
			password.sendKeys("rucha123");
			
			
	}

}
