 Feature: Booking tickets for 2 persons


Scenario: Select Places and Date for Booking Ticket
Given Launch MakeMyTrip URL "https://www.makemytrip.com/"
When Enter Departure Place "Mumbai"
And Enter Destination Place "Goa"
And Select Departure Date
And Select Return Date
And Select No. of Travellers
And Click Search Button
Then Validate Search for Flights

Scenario: Book Desired Flight
When Select Flight
And Click BookNow
Then Validate BookingReview

Scenario: ReviewBooking
When Click terms&condition
And Click Continue Button
Then Validate Traveller & AdOns Page

