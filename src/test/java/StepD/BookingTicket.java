package StepD;

import org.openqa.selenium.By;
import org.testng.Assert;

import TestINIT.TestIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingTicket extends TestIn {

	@Given("Launch MakeMyTrip URL")
	public void launch_MakeMyTrip_URL() {
		bookingticketpage.launchUrl();
	}

	@When("Enter Departure Place")
	public void enter_Departure_Place() {
		bookingticketpage.selectDeparturePlace();
	}

	@When("Enter Destination Place")
	public void enter_Destination_Place() {
	bookingticketpage.selectDestinationPlace();
	}

	@When("Select Departure Date")
	public void select_Departure_Date() {
		bookingticketpage.selectDepartureDate();
	}

	@When("Select Return Date")
	public void select_Return_Date() {
	    bookingticketpage.selectReturnDate();
    }

	@When("Select No. of Travellers")
	public void select_No_of_Travellers() {
		//. bookingticketpage.selectNumberOfTravellers();
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
	public void select_Flight() {
	    bookingticketpage.selectDesiredFlight();   
	}

	@When("Click BookNow")
	public void click_BookNow() throws InterruptedException {
	    
		bookingticketpage.clickBookNow();
		Thread.sleep(8000);
		//bookingticketpage.clickContinue();
	   // Thread.sleep(4000);
	}

	@Then("Validate BookingReview")
	public void validate_BookingReview() {
		bookingticketpage.verifybookingReviewPage();
	}

	@When("Click terms&condition")
	public void click_terms_condition() {
		bookingticketpage.scrollToparticularWebElement();
		bookingticketpage.acceptTerms();
	}  

	@When("Click Continue Button")
	public void click_Continue_Button() {
	    bookingticketpage.clickOnContinue();
	    
	}
	
	@Then("Validate Traveller & AdOns Page")
	public void validate_Traveller_AdOns_Page() {
	    Assert.assertEquals(bookingticketpage.AdOnsPage(),"Traveller & Addons");
	 }	

	/* @When("Enter Passenger FirstName {string}")
	public void enter_Passenger_FirstName(String name1) {
		bookingticketpage.clickOnAddAdult();
		bookingticketpage.enterFirstName(name1);
	 }

	@When("Enter Passenger LastName {string}")
	public void enter_Passenger_LastName(String name2) {
		bookingticketpage.enterLastName(name2);
	 }

	@When("Click On Gender")
	public void click_On_Gender() {
		bookingticketpage.selectGender();
	 }

	@When("Enter ContactNo {string}")
	public void enter_ContactNo(String num) {
	    bookingticketpage.enterContactNo(num);
	 }

	@When("Enter EmailId {string}")
	public void enter_EmailId(String e) {
	    bookingticketpage.enterEmailId(e);
	 }

	@Given("Traveller & AdOns Page is Open")
	public void traveller_AdOns_Page_is_Open() {
	 }

	@When("Click Skip AdOns Button")
	public void click_Skip_AdOns_Button() {
	    bookingticketpage.clickSkip();
	 }

	@Then("Validate Payment Page")
	public void validate_Payment_Page() {
	    Assert.assertEquals(bookingticketpage.verifyPaymentPage(),"MakeMytrip Payment : Safe and Secure");
	 } 
	 */
}
