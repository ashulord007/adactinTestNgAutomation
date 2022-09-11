package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseClass {
	public static WebDriver driver;	
	long start = 0l;
	
	@BeforeSuite
	public void suiteBefore() {
		start = System.currentTimeMillis();
	}
	@AfterSuite
	public void suiteAfter() {
		long end = System.currentTimeMillis();
		System.out.println("Time Taken : "+(end-start)/1000l+"sec");
	}
	@BeforeTest
	public void testBefore() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muska\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		

	}
	@BeforeClass
	public void classBefore() throws InterruptedException {
		WebElement x = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		x.sendKeys("Lordanti");
		WebElement y = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		y.sendKeys("Q2AQsRUrCMWHC@");
		WebElement z = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		z.click();
	}
	
	@AfterTest
	public void testAfter() {
		driver.close();
	}
}
