package acquickacademic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeTesting {
private WebDriver driver;
@BeforeMethod
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		String URL="https://the-internet.herokuapp.com/login";
		driver.get(URL);
		
	}
@Test
	public void negativelogin() {
	System.out.println("hello");
driver.findElement(By.cssSelector("input[id='username']")).sendKeys("manu");
driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234");
driver.findElement(By.cssSelector("button[class='radius']")).click();
}
@AfterMethod
	public void aftertest()
	{
	driver.close();
	}
	}


