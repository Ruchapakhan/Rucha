import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathExample 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1.using simple Xpath method by using tag and attributes
		
//		WebElement username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
//		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
//		WebElement login = driver.findElement(By.xpath("//input[@value=\"Log In\"]"));
     
		//2. using and condition
		
//		WebElement username = driver.findElement(By.xpath("//input[@id='email' and @class='inputtext']"));
//		WebElement password = driver.findElement(By.xpath("//input[@id='pass' and @tabindex='2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
//		
		//3. using or condition
		
//		WebElement username = driver.findElement(By.xpath("//input[@id='email' or @class='inttext']"));
//		WebElement password = driver.findElement(By.xpath("//input[@id='pass' or @tabindex='33']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' or @type='subt']"));
		
		//4. using contains
		
//		WebElement username = driver.findElement(By.xpath("//input[contains(@name,'ma')]"));
//		WebElement password = driver.findElement(By.xpath("//input[contains(@type,'wo')]"));
//		WebElement login = driver.findElement(By.xpath("//input[contains(@type,'sub')]"));
		
		//5. using starts-with
		
//		WebElement username = driver.findElement(By.xpath("//input[starts-with(@name,'em')]"));
//		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pa')]"));
//		WebElement login = driver.findElement(By.xpath("//input[starts-with(@value,'Log')]"));
//		
//		username.sendKeys("Rucha");
//		password.sendKeys("rucha123");
//		login.click();
		
		//6.using text method---used for to click on text and * for full html page
		
		WebElement link = driver.findElement(By.xpath("//*[text()='Agile Project']"));
		link.click();
	}

}
