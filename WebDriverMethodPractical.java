import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPractical
{
  
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         
		//This method will help you to set the browser path which we need to use to run the automation script
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\software\\chrome\\chromedriver.exe");
		
		//to create chromedriver object we need to create webdriver interface reference and need to create object for browser
		WebDriver driver = new ChromeDriver();
		
		//1.get()-this method will help you to open the any URL
		 
		driver.get("https://www.amazon.in/");
		
		//3. to get the title of current opened URL we can use get title method
		String title = driver.getTitle();
		System.out.println(title);
		
		//4.to get the currently opened url we can use get current url method
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//5. to get the source code of opened the url we can use this method getPage source
		String source = driver.getPageSource();
		System.out.println(source);
		
		//2. to close the current opened URl we need to use close method
		driver.close();
		
		//6. to close the all the opened url we need to use quit method 
//		driver.quit();
	}

}
