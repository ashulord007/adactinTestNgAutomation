package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Base.baseClass;
import org.testng.annotations.Test;


public class TestCase extends baseClass {
	@Test
	public void tc1_login_success() {
		String actual_url = "Adactin.com - Search Hotel";
		String curr_url = driver.getTitle();
		Assert.assertEquals(actual_url, curr_url, "login failed");
		Reporter.log("login functionality works.");
		System.out.println("hello world");
	}
	@Test
	public void tc2_book_hotel() {
		WebElement locations = driver.findElement(By.xpath("//*[@id=\"location\"]"));
		locations.sendKeys("Los Angeles");
		WebElement hotel_name = driver.findElement(By.xpath("//*[@id=\"hotels\"]"));
		hotel_name.sendKeys("Hotel Sunshine");
		WebElement room_type = driver.findElement(By.xpath("//*[@id=\"room_type\"]"));
		room_type.sendKeys("Super Deluxe");
		WebElement rooms = driver.findElement(By.xpath("//*[@id=\"room_nos\"]"));
		rooms.sendKeys("1 - One");
		WebElement checkin = driver.findElement(By.xpath("//*[@id=\"datepick_in\"]"));
		checkin.sendKeys("14/02/2023");
		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"datepick_out\"]"));
		checkout.sendKeys("16/02/2023");
		WebElement adults = driver.findElement(By.xpath("//*[@id=\"adult_room\"]"));
		adults.sendKeys("2 - Two");
		WebElement child = driver.findElement(By.xpath("//*[@id=\"child_room\"]"));
		child.sendKeys("0 - None");
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		searchButton.click();
		
	}
	@Test
	public void tc3_select_hotel() throws InterruptedException {
		WebElement selectHotel = driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]"));
		selectHotel.click();
		WebElement continue_button = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		continue_button.click();
		Thread.sleep(2000);
	}
	@Test
	public void tc4_book_hotel() {
		WebElement f_name = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		f_name.sendKeys("Ashutosh");
		WebElement l_name = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		l_name.sendKeys("Choudhary");
		WebElement address = driver.findElement(By.xpath("//*[@id=\"address\"]"));
		address.sendKeys("8210952037@paytm");
		WebElement cardNo = driver.findElement(By.xpath("//*[@id=\"cc_num\"]"));
		cardNo.sendKeys("8210952037821095");
		WebElement cardType = driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
		cardType.sendKeys("Visa");
		WebElement cardExpMonth = driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
		cardExpMonth.sendKeys("October");
		WebElement cardExpYear = driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));
		cardExpYear.sendKeys("2022");
		WebElement cardCVV = driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]"));
		cardCVV.sendKeys("803");
		WebElement BookButton = driver.findElement(By.xpath("//*[@id=\"book_now\"]"));
		BookButton.click();
	}
	@Test
	public void booking_confirmation() {
		String orderNo=driver.findElement(By.xpath("//*[@id=\"order_no\"]")).getAttribute("value");
		System.out.println("Order Number is : "+orderNo);
	}

}
