package selenium.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) 
	{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flexiquiz.com/");
			driver.manage().window().maximize();
			
	}

}
