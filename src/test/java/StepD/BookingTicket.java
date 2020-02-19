package StepD;

import org.openqa.selenium.By;
import org.testng.Assert;

import TestINIT.TestIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingTicket extends TestIn {

	@Given("Launch MakeMyTrip URL {string}")
	public void launch_MakeMyTrip_URL(String url) {
		bookingticketpage.launchUrl(url);
	}

	@When("Enter Departure Place {string}")
	public void enter_Departure_Place(String dep) {
		bookingticketpage.enterDeparturePlace(dep);
	}

	@When("Enter Destination Place {string}")
	public void enter_Destination_Place(String des) {
	bookingticketpage.enterDestinationPlace(des);
	}

	@When("Select Departure Date {string}")
	public void select_Departure_Date(String d1) {
		bookingticketpage.selectDepartureDate(d1);
	}

	@When("Select Return Date {string}")
	public void select_Return_Date(String d2) {
	    bookingticketpage.selectReturnDate(d2);
    }

	@When("Select No. of Travellers")
	public void select_No_of_Travellers() {
		bookingticketpage.selectNumberOfTravellers();
	}

	@When("Click Search Button")
	public void click_Search_Button() {
	    bookingticketpage.clickToSearchFlight();
	}

	@Then("Validate Search for Flights")
	public void validate_Search_for_Flights() {
		bookingticketpage.verifyFlightSearchPage();
	}

	@When("Select Flight")
	public void select_Flight() throws InterruptedException {
	    bookingticketpage.selectDesiredFlight();   
	}

	@When("Click BookNow")
	public void click_BookNow() throws InterruptedException {
	    
		bookingticketpage.clickBookNow();
		
		// bookingticketpage.clickContinue();
	   
	}

	@Then("Validate BookingReview")
	public void validate_BookingReview() {
		bookingticketpage.navigateToNewWindow();
		// bookingticketpage.verifybookingReviewPage();
		Assert.assertEquals(bookingticketpage.verifybookingReviewPage() , "Review your booking");
		
	}

	@When("Click terms&condition")
	public void click_terms_condition() throws InterruptedException {
		Thread.sleep(5000);
		bookingticketpage.navigateToNewWindow();
		bookingticketpage.scrollToWebElement();
		bookingticketpage.acceptTerms();
	}  

	@When("Click Continue Button")
	public void click_Continue_Button() throws InterruptedException {
	    bookingticketpage.clickOnContinue();
	    Thread.sleep(3000);
	    
	}
	
	@Then("Validate Traveller & AdOns Page")
	public void validate_Traveller_AdOns_Page() {
	    Assert.assertEquals(bookingticketpage.AdOnsPage(),"Traveller & Addons");
	 }	

	@When("Enter Passenger FirstName {string}")
	public void enter_Passenger_FirstName(String name1) {
		bookingticketpage.clickOnAddAdult();
		bookingticketpage.enterFirstName1(name1);
	 }

	@When("Enter Passenger LastName {string}")
	public void enter_Passenger_LastName(String name2) {
		bookingticketpage.enterLastName1(name2);
	 }

	@When("Click On Gender")
	public void click_On_Gender() {
		bookingticketpage.selectFemaleGender();
	 }
	@When("Enter SecondPassenger FirstName {string}")
	public void enter_SecondPassenger_FirstName(String name1) {
	    bookingticketpage.clickOnAddAdult();
	    bookingticketpage.enterFirstName2(name1);
	}

	@When("Enter SecondPassenger LastName {string}")
	public void enter_SecondPassenger_LastName(String name2) {
	    bookingticketpage.enterLastName2(name2);
	}
	@When("Click On SecondPassengerGender")
	public void click_On_SecondPassengerGender() {
		bookingticketpage.selectMaleGender();
	 }
	@When("Enter ContactNo {string}")
	public void enter_ContactNo(String num) {
	    bookingticketpage.enterContactNo(num);
	 }

	@When("Enter EmailId {string}")
	public void enter_EmailId(String e) {
	    bookingticketpage.enterEmailId(e);
	 }

	@When("Click Skip AdOns Button")
	public void click_Skip_AdOns_Button() {
	    bookingticketpage.clickSkip();
	 }

	@Then("Validate Payment Page")
	public void validate_Payment_Page() {
	  bookingticketpage.verifyPaymentPage().contains("m-securepay.makemytrip.com/common-payment");
	    
	 } 
	
}
