package PageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BookingTicketPage {

WebDriver driver;

	public BookingTicketPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void enterDeparturePlace(String depart) {
	   driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	   List<WebElement> e = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
       for(WebElement place :e)
        {  
        	if(place.getText().contains(depart))
        	{
        		place.click();
        		break;
        	}
        }
	}
	public void enterDestinationPlace(String dest) {
		  List<WebElement> ee = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
	       for(WebElement place1 :ee)
	        {  
	        	if(place1.getText().contains(dest))
	        	{
	        		place1.click();
	        		break;
	        	}
	        }
	}
	
	public void selectDepartureDate() {
		driver.findElement(By.xpath("//div[contains(@class,'today')]")).click();
	}
	public void selectReturnDate() {
	   driver.findElement(By.xpath("//div[@class='fsw_inputBox dates reDates inactiveWidget ']")).click();
	   driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div")).click();
	    
	}
	public void selectNumberOfTravellers() {
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[5]")).click();
	    driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div/ul[1]/li[2]")).click();
	    driver.findElement(By.xpath("//button[@class='primaryBtn btnApply pushRight ']")).click();
	}
	public void clickToSearchFlight() {
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBlack widgetSearchBtn ']")).click();
	}
	public void verifyFlightSearchPage() {
		String flightsearchurl = driver.getCurrentUrl();
		Assert.assertTrue(flightsearchurl.contains("www.makemytrip.com/flight/search?itinerary"));
		
	}
	public void selectDesiredFlight() throws InterruptedException {
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"ow-domrt-jrny\"]/div/div[2]")).click();
	}
	
	public void clickContinue() {
		WebElement cont = driver.findElement(By.xpath("//button[@class='btn fli_primary_btn']"));
		if(cont.isDisplayed())
		{
			cont.click();
		}
		
		// For skip :   driver.findElement(By.xpath("//span[@class='font14 text-blue LatoBold cursor_pointer']")).click();
	}
	
	public void clickBookNow() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
	   
	}
	public String verifybookingReviewPage() {
		WebElement Text = driver.findElement(By.xpath("//div[@text='Review your booking']"));
		return Text.getText();
		
	} 
	
	public void scrollToWebElement() throws InterruptedException {
		System.out.println("Scrolling down to yes button");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		try {
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//input[@value='yes']")));
		}catch(Exception e) {
			System.out.println("Scroll doesn't work");
		}
		Thread.sleep(2000);
	}
	
	public void acceptTerms() throws InterruptedException {  
		
		try {
			
			driver.findElement(By.xpath("//input[@value='yes']")).click();
			System.out.println("Clicking on accept terms");
			}catch(Exception e) {   System.out.println("accept terms not found");
			}
			Thread.sleep(2000);	
	}
	
	public void clickOnContinue() throws InterruptedException {
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[text()='Continue']")).click();
		}
	public String AdOnsPage() {
		return driver.findElement(By.xpath("//div[class='make_flex alC']")).getText();
	}
	public void navigateToNewWindow() {
		String currentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String e: allWindows) {
			if(!e.equalsIgnoreCase(currentWindow)) {
			driver.switchTo().window(e);
			}
		}
	}
	
	public void clickOnAddAdult() {
		
		driver.findElement(By.xpath("//div[@id='wrapper_ADULT']//a[@class='font14 LatoBold text-uppercase paddLR15']")).click();
	}
	
	public void enterFirstName1(String fname) {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/input")).sendKeys(fname);
	}
	public void enterLastName1(String lname) {
		
		 driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/input")).sendKeys(lname);
	}
	public void selectFemaleGender() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div/label[2]")).click();
	}
	public void enterFirstName2(String fname) {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/input")).sendKeys(fname);
	}
	public void enterLastName2(String lname) {
		
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/input")).sendKeys(lname);
	}
	public void selectMaleGender() {
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div/label[1]")).click();	
	}
	public void enterContactNo(String n) {
		driver.findElement(By.xpath("//div[@id='contactDetailsCard']//div[@id='Mobile No']//input[@placeholder='Mobile No']")).sendKeys(n);
	}
	public void enterEmailId(String email) {
		driver.findElement(By.xpath("//*[@id=\"Email\"]/div/input")).sendKeys(email);
	}
	public void clickToContinuePayment() {
		driver.findElement(By.xpath("//button[@class='ack-cta btn fli_primary_btn text-uppercase']")).click();
	}
	public void clickSkip() {
		driver.findElement(By.xpath("//a[@class='pull-left skip-add-ons']")).click();
	}
	public String verifyPaymentPage() {
		return driver.getCurrentUrl();
	}
	
}
