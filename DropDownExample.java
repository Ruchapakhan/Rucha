import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		 Select select = new Select(country);
		 
		 //.select by visible text
//		 select.deselectByVisibleText("CHINA");
		 
		 //2.select by value
//		 select.selectByValue("BERMUDA");
		 
		 //3.select by index
		 select.selectByIndex(6);
	}

}
