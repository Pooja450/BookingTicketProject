package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BookingTicketPage {

WebDriver driver;

	public BookingTicketPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	public void launchUrl() {
		driver.get("https://makemytrip.com/");
	}
	public void selectDeparturePlace() {
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	    driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li[@id='react-autowhatever-1-section-0-item-0']")).click();
	}
	public void selectDestinationPlace() {
		driver.findElement(By.xpath("//div[@id='react-autowhatever-1']//li[@id='react-autowhatever-1-section-0-item-1']")).click();
	}
	public void selectDepartureDate() {
		// driver.findElement(By.xpath("//input[@id='departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label ='Fri Feb 14 2020']")).click();
	    // driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]")).click();
	    // driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[5]")).click();	
	}
	public void selectReturnDate() {
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates reDates inactiveWidget ']")).click();
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div")).click();
	    
	}
	public void selectNumberOfTravellers() {
		driver.findElement(By.xpath("//input[@id='travellers']")).click();
	    driver.findElement(By.xpath("//ul[@class='guestCounter font12 darkText/li]")).click();
	    driver.findElement(By.xpath("//button[@class='primaryBtn btnApply pushRight ']")).click();
	}
	public void clickToSearchFlight() {
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBlack widgetSearchBtn ']")).click();
	}
	public boolean verifyFlightSearchPage() {
		String flightsearchurl = driver.getCurrentUrl();
		Assert.assertTrue(flightsearchurl.contains("www.makemytrip.com/flight/search?itinerary"));
		return true;
	}
	public void selectDesiredFlight() {
		driver.findElement(By.xpath("//*[@id=\"rt-domrt-jrny\"]/div/div[2]")).click();
		// driver.findElement(By.xpath("//*[@id=\"rt-domrt-jrny\"]/div/div[6]")).click();
	}
	
	public void clickContinue() {
		driver.findElement(By.xpath("//button[@id='review-continue']")).click();
		// For skip :   driver.findElement(By.xpath("//span[@class='font14 text-blue LatoBold cursor_pointer']")).click();
	}
	
	public void clickBookNow() {
		driver.findElement(By.xpath("//div[@class='splitVw-footer-total make_relative make_flex alC']//div[@class='pull-left make_flex alC']")).click();
		}
	public boolean verifybookingReviewPage() {
		String itineraryurl = driver.getCurrentUrl();
		Assert.assertTrue(itineraryurl.contains("www.makemytrip.com/flight/review/?itineraryId"));
		return true;
	} 
	
	public void scrollToparticularWebElement() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrolllnto?View();",driver.findElement(By.xpath("//button[@id='review-continue']")));
      // jse.executeScript("arguments[0].scrolllnto?View();",driver.findElement(By.xpath("//*[@id=\"insurance-section\"]/div/div[3]/label[1]/input"));
		
	}
	
	public void acceptTerms() {  
		driver.findElement(By.xpath("//*[@id=\"insurance-section\"]/div/div[3]/label[1]/input")).click();
		//driver.findElement(By.xpath("//label[@class='block radio append_bottom15']/input[value='yes']")).click();
	}
	public void clickOnContinue() {
		driver.findElement(By.xpath("//button[@id='review-continue']")).click();
		// For Skip :   driver.findElement(By.xpath("//span[@class='font14 text-blue LatoBold cursor_pointer']")).click();
	}
	public String AdOnsPage() {
		return driver.findElement(By.xpath("//div[class='make_flex alC']")).getText();
	}
	
	/* public void clickOnAddAdult() {
		driver.findElement(By.xpath("//a[@class='font14 LatoBold text-uppercase paddLR15']")).click();
	}
	
	public void enterFirstName(String fname) {
		driver.findElement(By.xpath("//input[@class='tvlrInput err-border']")).sendKeys(fname);
	}
	public void enterLastName(String lname) {
		driver.findElement(By.xpath("//input[@class='tvlrInput ']")).sendKeys(lname);
	}
	public void selectGender() {
		driver.findElement(By.xpath("//*[@id=\"MANUAL_fbb9f9be-b298-4c94-8d1e-c6766bf23187\"]/div[2]/div/div/div[3]/div/div/label[1]")).click();
	}
	public void enterContactNo(String n) {
		driver.findElement(By.xpath("//input[@class=''tvlrInput err-border]")).sendKeys(n);
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
		return driver.getTitle();
	}
	*/
}
