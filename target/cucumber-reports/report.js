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
  "name": "Select Departure Date \"Feb-25-2020\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.select_Departure_Date(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Return Date \"Mar-02-2020\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.select_Return_Date(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cdiv class\u003d\"fsw_inputBox dates reDates inactiveWidget \"\u003e...\u003c/div\u003e is not clickable at point (993, 251). Other element would receive the click: \u003ciframe title\u003d\"notification-frame-31756199\" name\u003d\"notification-frame-31756199\" id\u003d\"webklipper-publisher-widget-container-notification-frame\" frameborder\u003d\"0\" marginheight\u003d\"0\" marginwidth\u003d\"0\" style\u003d\"display: block; z-index: 16776272; position: fixed; visibility: visible; height: 100%; width: 100%; top: 0px; left: 0px; right: auto;\" data-notification-layout-id\u003d\"~184fc0b7\" data-notification-layout-name\u003d\"modal\"\u003e\u003c/iframe\u003e\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Poojas-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1486:7fda:791c:8381%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/gv/mllqbt8534n...}, goog:chromeOptions: {debuggerAddress: localhost:62631}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 562d91b6d74281ab7491680c5cae5902\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat PageObjects.BookingTicketPage.selectReturnDate(BookingTicketPage.java:81)\n\tat StepD.BookingTicket.select_Return_Date(BookingTicket.java:35)\n\tat ✽.Select Return Date \"Mar-02-2020\"(src/test/resources/Features/BookingTicket.feature:48)\n",
  "status": "failed"
});
formatter.step({
  "name": "Select No. of Travellers",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.select_No_of_Travellers()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Flight",
  "keyword": "When "
});
formatter.match({
  "location": "BookingTicket.select_Flight()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click BookNow",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_BookNow()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click terms\u0026condition",
  "keyword": "When "
});
formatter.match({
  "location": "BookingTicket.click_terms_condition()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_Continue_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Passenger FirstName \"Pooja\"",
  "keyword": "When "
});
formatter.match({
  "location": "BookingTicket.enter_Passenger_FirstName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Passenger LastName \"Bhandari\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.enter_Passenger_LastName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click On Gender",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_On_Gender()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter SecondPassenger FirstName \"Manni\"",
  "keyword": "When "
});
formatter.match({
  "location": "BookingTicket.enter_SecondPassenger_FirstName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter SecondPassenger LastName \"Negi\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.enter_SecondPassenger_LastName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click On SecondPassengerGender",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_On_SecondPassengerGender()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter ContactNo \"8527326880\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.enter_ContactNo(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter EmailId \"pooja100389@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.enter_EmailId(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_Continue_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Skip AdOns Button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.click_Skip_AdOns_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate Payment Page",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingTicket.validate_Payment_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});