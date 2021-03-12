package acquickacademic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class PositiveTesting {

	private WebDriver driver;
	@BeforeTest
	public void positivelogin() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String URL="https://the-internet.herokuapp.com/login";
		driver.get(URL);
	}
	@Test
	public void login()
	{
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("tomsmith");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector("button[class='radius']")).click();
		String expectedURL="https://the-internet.herokuapp.com/secure";
		String CurrentURL=driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, CurrentURL);
		WebElement loginbutton=driver.findElement(By.xpath("//i[contains(text(),'Logout')]"));
		Assert.assertTrue(loginbutton.isDisplayed());
	}
	@AfterMethod
	public void aftertest()
	{
	driver.close();
	}
	
	

}
