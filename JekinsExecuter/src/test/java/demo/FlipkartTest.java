package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlipkartTest {
	@Test
	public void loginTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://wwwflipkart.com/");
		Reporter.log("Flipkart is launch Sucessfully",true);
	}


}
