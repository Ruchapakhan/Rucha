import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\software\\chrome\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
		
//			WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//			button.click();
//			
//			WebElement button1 = driver.findElement(By.xpath("//*[@id=\\\"CancelTab\\\"]/button"));
//			button1.click();
//			
//			//3.to dismiss the alert we can use dismiss method
//			driver.switchTo().alert().dismiss();
			
	       WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
	       button.click();
	       
	       WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
			button1.click();
			Thread.sleep(3000);
			
			//4. to enter the value in alert we can use sendkeys method
			driver.switchTo().alert().sendKeys("Rucha");
			driver.switchTo().alert().accept();
	}

}
