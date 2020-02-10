$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/BookingTicket.feature");
formatter.feature({
  "name": "Booking tickets for 2 persons",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Select Places and Date for Booking Ticket",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch MakeMyTrip URL",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingTicket.launch_MakeMyTrip_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Departure Place",
  "keyword": "When "
});
formatter.match({
  "location": "BookingTicket.enter_Departure_Place()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Destination Place",
  "keyword": "And "
});
formatter.match({
  "location": "BookingTicket.enter_Destination_Place()"
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
  "name": "Validate Search for Flights",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingTicket.validate_Search_for_Flights()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Book Desired Flight",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
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
  "name": "Validate BookingReview",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingTicket.validate_BookingReview()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:96)\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\n\tat org.testng.Assert.assertTrue(Assert.java:44)\n\tat org.testng.Assert.assertTrue(Assert.java:54)\n\tat PageObjects.BookingTicketPage.verifybookingReviewPage(BookingTicketPage.java:66)\n\tat StepD.BookingTicket.validate_BookingReview(BookingTicket.java:69)\n\tat ✽.Validate BookingReview(src/test/resources/Features/BookingTicket.feature:17)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "ReviewBooking",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@id\u003d\u0027review-continue\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Poojas-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:4:ba1e:6c88:2246%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/gv/mllqbt8534n...}, goog:chromeOptions: {debuggerAddress: localhost:51517}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: bdd875562fb41985700285014c929f12\n*** Element info: {Using\u003dxpath, value\u003d//button[@id\u003d\u0027review-continue\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat PageObjects.BookingTicketPage.scrollToparticularWebElement(BookingTicketPage.java:72)\n\tat StepD.BookingTicket.click_terms_condition(BookingTicket.java:74)\n\tat ✽.Click terms\u0026condition(src/test/resources/Features/BookingTicket.feature:20)\n",
  "status": "failed"
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
  "name": "Validate Traveller \u0026 AdOns Page",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingTicket.validate_Traveller_AdOns_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});