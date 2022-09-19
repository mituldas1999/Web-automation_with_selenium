# Web-automation_with_selenium
Steps for Login Automation using Selenium WebDriver
Before performing automation testing for the login functionality, there are a couple of basic steps that need to be followed for the test case to be written:

1.Create a Selenium WebDriver instance
2.Configure browser if required
3.Navigate to the required web page
4.Locate the relevant web element
5.Perform action on the web element
6.Verify and validate the action
# Now let’s walk through each of these steps in detail.

1. Create a Selenium WebDriver instance
To launch the website in the desired browser, set the system properties to the path of the driver for the required browser. This example will use ChromeDriver for Login Automation using Selenium Webdriver. The syntax for the same will be:

# Webdriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "Path of the chrome driver");
2. Configure the Web browser
Usually, the web page will be in a minimized format when the test case is run. Maximize the browser for a clear picture of the test cases executed. Use the command below to do the same:

# driver.manage.window.maximize();
3. Navigate to the web URL
Open the browser with the desired URL. Use the command below to open the URL in the desired instantiated browser:

driver.get("https://www.browserstack.com/users/sign_in");
4. Locating the Web Element
Locators are an essential part of every Selenium script as they identify the elements that the test script will interact with to replicate user actions.

For example, let’s try to locate the email and password field of the login form of Browserstack sign in page.

<p><img align="left" src="https://static.javatpoint.com/tutorial/selenium/images/selenium-tool-suite.png" /></p>
