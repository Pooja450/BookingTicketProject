 Feature: Booking tickets for 2 persons


Scenario: Select Places and Date for Booking Ticket
Given Launch MakeMyTrip URL 
When Enter Departure Place
And Enter Destination Place
And Select Departure Date
And Select Return Date
And Select No. of Travellers
And Click Search Button
Then Validate Search for Flights

Scenario: Book Desired Flight
When Select Flight
And Click BookNow
And Click Continue Button
Then Validate BookingReview

Scenario: ReviewBooking
When Click terms&condition
And Click Continue Button
Then Validate Traveller & AdOns Page

Scenario: Entering Traveller Details
When Enter Passenger FirstName "Pooja"
And Enter Passenger LastName "Bhandari"
And Click On Gender
And Enter ContactNo "8527326880"
And Enter EmailId "pooja100389@gmail.com"
And Click Continue Button

Scenario: AddOns
Given Traveller & AdOns Page is Open
When Click Skip AdOns Button
Then Validate Payment Page