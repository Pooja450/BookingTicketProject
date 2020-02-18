$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/BookingTicket.feature");
formatter.feature({
  "name": "Booking tickets for 2 persons",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Payment Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch MakeMyTrip URL \"https://www.makemytrip.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingTicket.launch_MakeMyTrip_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Departure Place \"Mumbai\"",
  "keyword": "When "
});
formatter.match({
  "location": "BookingTicket.enter_Departure_Place(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Destination Place \"Delhi\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.enter_Destination_Place(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Departure Date",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.select_Departure_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Return Date",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.select_Return_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select No. of Travellers",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.select_No_of_Travellers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Flight",
  "keyword": "When "
});
formatter.match({
  "location": "BookingTicket.select_Flight()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click BookNow",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_BookNow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click terms\u0026condition",
  "keyword": "When "
});
formatter.match({
  "location": "BookingTicket.click_terms_condition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_Continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Passenger FirstName \"Pooja\"",
  "keyword": "When "
});
formatter.match({
  "location": "BookingTicket.enter_Passenger_FirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Passenger LastName \"Bhandari\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.enter_Passenger_LastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Gender",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_On_Gender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter SecondPassenger FirstName \"Manni\"",
  "keyword": "When "
});
formatter.match({
  "location": "BookingTicket.enter_SecondPassenger_FirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter SecondPassenger LastName \"Negi\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.enter_SecondPassenger_LastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On SecondPassengerGender",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_On_SecondPassengerGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter ContactNo \"8527326880\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.enter_ContactNo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter EmailId \"pooja100389@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.enter_EmailId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_Continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Skip AdOns Button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_Skip_AdOns_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Payment Page",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingTicket.validate_Payment_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});