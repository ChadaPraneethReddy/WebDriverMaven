import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\ManualTesting\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	@Test
	public void doLogin() throws InterruptedException {
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("sdfdsf");
		System.out.println("Hello Praneeth how r u");
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	

}
