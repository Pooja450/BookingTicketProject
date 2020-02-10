package TestINIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import PageObjects.BookingTicketPage;


public class TestIn {
	
	public static WebDriver driver;
	public BookingTicketPage bookingticketpage;
	
	
	public TestIn(){
		System.out.println("calling init constructor");
		pageobjects();
	}
	
	//Driver launch + Create Object

	public static void init() {
		driver=WebManger.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	private void pageobjects() {
		bookingticketpage = new BookingTicketPage(driver);
	}
	
}
