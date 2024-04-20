import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotExample
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		driver.manage().window().maximize();
		
		//firstly we are creating refrence of Takescreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//calling getscreenshotas method to create image
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		//Move the file into new destination folder
		File destFile = new File("D:\\");
		
		//we will copy the statement into destination folder
		Files.copy(srcFile, destFile);
		
	}

}
