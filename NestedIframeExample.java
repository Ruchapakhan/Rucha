import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeExample 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		WebElement button = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		button.click();
		
		//Switching to the parent iframe by using the webelement method
		WebElement parentIframe = driver.findElement(By.xpath("//*[@id=\\\"Multiple\\\"]/iframe"));
		driver.switchTo().frame(parentIframe);
		
		WebElement text=driver.findElement(By.xpath("/html/body/section/div/div/h5"));
		String value=text.getText();
		System.out.println(value);
		
		//we need to switch to child iframe to perform the operation
		driver.switchTo().frame(0);
		WebElement un = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		un.sendKeys("Rucha");
		
	}

}
