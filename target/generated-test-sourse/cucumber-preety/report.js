$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Newsletter.feature");
formatter.feature({
  "line": 1,
  "name": "Newsletter subscription",
  "description": "",
  "id": "newsletter-subscription",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4162460499,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "When valid email ID entered and signup button clicked",
  "description": "",
  "id": "newsletter-subscription;when-valid-email-id-entered-and-signup-button-clicked",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "When User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Valid email id is entered and signUp button clicked",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Successful message should appear and user should get Email",
  "keyword": "Then "
});
formatter.match({
  "location": "Newsletter.whenUserIsOnHomePage()"
});
formatter.result({
  "duration": 43873162500,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: net::ERR_CONNECTION_TIMED_OUT\n  (Session info: chrome\u003d94.0.4606.54)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027DLLT-7592\u0027, ip: \u0027192.168.215.20\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.54, chrome: {chromedriverVersion: 94.0.4606.41 (333e85df3c9b6..., userDataDir: C:\\Users\\ABHISH~1.BHA\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:49163}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 55e8ec92791891211a8bdc73ffc6fa32\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat singup.Product.automationWorld.StepDefs.Newsletter.whenUserIsOnHomePage(Newsletter.java:38)\r\n\tat ✽.Given When User is on home page(Newsletter.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Newsletter.validEmailIdIsEnteredAndSignUpButtonClicked()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Newsletter.successfulMessageShouldAppearAndUserShouldGetEmail()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 740790600,
  "status": "passed"
});
});