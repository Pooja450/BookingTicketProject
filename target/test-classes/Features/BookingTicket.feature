 Feature: Booking tickets for 2 persons


Scenario: Select Places and Date for Booking Ticket
Given Launch MakeMyTrip URL "https://www.makemytrip.com/"
When Enter Departure Place "Mumbai"
And Enter Destination Place "Delhi"
And Select Departure Date
And Select Return Date
And Select No. of Travellers
And Click Search Button
Then Validate Search for Flights

@Test
Scenario: Book Desired Flight
Given Launch MakeMyTrip URL "https://www.makemytrip.com/"
When Enter Departure Place "Mumbai"
And Enter Destination Place "Delhi"
And Select Departure Date
And Select Return Date
And Select No. of Travellers
And Click Search Button
When Select Flight
And Click BookNow
Then Validate BookingReview

@Test1
Scenario: ReviewBooking
Given Launch MakeMyTrip URL "https://www.makemytrip.com/"
When Enter Departure Place "Mumbai"
And Enter Destination Place "Delhi"
And Select Departure Date
And Select Return Date
And Select No. of Travellers
And Click Search Button
When Select Flight
And Click BookNow
When Click terms&condition
And Click Continue Button
Then Validate Traveller & AdOns Page

@Test2
Scenario:Payment Page
Given Launch MakeMyTrip URL "https://www.makemytrip.com/"
When Enter Departure Place "Mumbai"
And Enter Destination Place "Delhi"
And Select Departure Date
And Select Return Date
And Select No. of Travellers
And Click Search Button
When Select Flight
And Click BookNow
When Click terms&condition
And Click Continue Button
When Enter Passenger FirstName "Pooja"
And Enter Passenger LastName "Bhandari"
And Click On Gender
When Enter SecondPassenger FirstName "Manni"
And Enter SecondPassenger LastName "Negi"
And Click On SecondPassengerGender
And Enter ContactNo "8527326880"
And Enter EmailId "pooja100389@gmail.com"
And Click Continue Button
And Click Skip AdOns Button
Then Validate Payment Page