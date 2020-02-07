package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
	    driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
	}
	public void selectDepartureDate() {
		driver.findElement(By.xpath("//input[@id='departure']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[4]")).click();
	}
	public void selectReturnDate() {
		driver.findElement(By.xpath("//input[@id='return']")).click();
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
	public String verifyFlightSearchPage() {
		return driver.findElement(By.xpath("//button[@id='bookbutton-RKEY:36c913e9-96f9-43df-9a29-a5388e612c26:52_0~~~RKEY:36c913e9-96f9-43df-9a29-a5388e612c26:125_0']")).getText();
	}
	public void selectDesiredFlight() {
		driver.findElement(By.xpath("//div[@class='fli-list splitVw-listing active']")).click();
	}
	public void clickBookNow() {
		driver.findElement(By.xpath("//button[@id='bookbutton-RKEY:1ecb8495-f384-4471-95d8-bbd0e9b01df7:1~~~RKEY:1ecb8495-f384-4471-95d8-bbd0e9b01df7:85']")).click();	
	}
	public void clickContinue() {
		driver.findElement(By.cssSelector("button.btn.fli_primary_btn")).click();
				
	}
	public String bookReview() {
		String Itenrary = driver.findElement(By.xpath("//p[@class='rvw-heading LatoBold']")).getText();
		return Itenrary;
	}
	public void acceptTerms() {
		driver.findElement(By.xpath("//*[@id=\"insurance-section\"]/div/div[3]/label[1]/input")).click();
	}
	public void clickOnContinue() {
		driver.findElement(By.xpath("//button[@id='review-continue']")).click();
	}
	public String AdOnsPage() {
		return driver.findElement(By.xpath("//div[class='make_flex alC']")).getText();
	}
	
	public void clickOnAddAdult() {
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
}
