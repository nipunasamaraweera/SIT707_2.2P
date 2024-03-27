package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Nipuna Thathsara
 */
public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void officeworks_registration_page(String url) {
        // Step 1: Locate chrome driver folder in the local drive.
        System.setProperty("webdriver.chrome.driver", "/Users/nipunathathasara/Downloads/chromedriver-mac-x64/chromedriver");

        // Step 2: Use above chrome driver to open up a chromium browser.
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();

        System.out.println("Driver info: " + driver);

        sleep(10);

        // Load a webpage in chromium browser.
        driver.get(url);

        /*
         * How to identify a HTML input field - Step 1: Inspect the webpage, Step 2:
         * locate the input field, Step 3: Find out how to identify it, by id/name/...
         */

        // Find first input field which is firstname
       WebElement firstNameElement = driver.findElement(By.id("firstname"));
        System.out.println("Found element: " + firstNameElement);
        // Send first name
        firstNameElement.sendKeys("Nipuna");

        // Find following input fields and populate with values
        WebElement lastNameElement = driver.findElement(By.id("lastname"));
        lastNameElement.sendKeys("Thathsara");
        
        // Inserting the phone number field
        WebElement phoneNumberElement = driver.findElement(By.id("phoneNumber"));
        phoneNumberElement.sendKeys("0414646980");

        WebElement emailElement = driver.findElement(By.id("email"));
        emailElement.sendKeys("nipunathathsara@gmail.com");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Test@2930");
        
        // Inserting the confirm password field
        WebElement confirmPasswordElement = driver.findElement(By.id("confirmPassword"));
        confirmPasswordElement.sendKeys("Test@2930");

        // Identify button 'Create account' and click to submit using Selenium API.
        WebElement createAccountButton = driver.findElement(By.xpath("//button[contains(text(),'Create account')]"));
        createAccountButton.click();

        // Take screenshot using Selenium API and save the image file
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File("screenshot.png"));
            System.out.println("Screenshot captured and saved as screenshot.png");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sleep a while
        sleep(10);

        // close chrome driver
        driver.close();
    }
    
    public static void alternative_registration_page(String url) {
        // Step 1: Locate chrome driver folder in the local drive.
        System.setProperty("webdriver.chrome.driver", "/Users/nipunathathasara/Downloads/chromedriver-mac-x64/chromedriver");

        // Step 2: Use above chrome driver to open up a chromium browser.
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();

        System.out.println("Driver info: " + driver);

        sleep(10);

        // Load the alternative registration page.
        driver.get(url);
        
     // Find first input field which is firstname
        WebElement firstNameElement = driver.findElement(By.id("ap_customer_name"));
        System.out.println("Found element: " + firstNameElement);
        // Send first name
        firstNameElement.sendKeys("Nipuna Samaraweera1");

        
        WebElement emailElement = driver.findElement(By.id("ap_email"));
        emailElement.sendKeys("nipunathathsara99@gmail.com");
        
        WebElement passwordElement = driver.findElement(By.id("ap_password"));
        passwordElement.sendKeys("Test@2930");
        
        // Inserting the confirm password field
        WebElement confirmPasswordElement = driver.findElement(By.id("ap_password_check"));
        confirmPasswordElement.sendKeys("Test@2930");
        

        // Identify button 'Create account' and click to submit using Selenium API.
        WebElement createAccountButton = driver.findElement(By.id("continue"));
        createAccountButton.click();
        
        
     // Take screenshot using Selenium API and save the image file
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File("screenshot.png"));
            System.out.println("Screenshot captured and saved as screenshot.png");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sleep briefly to allow time for the screenshot to be captured.
        sleep(10);

        // Close the browser.
        driver.quit();
    }
    

    public static void main(String[] args) {
        officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
        alternative_registration_page("https://www.amazon.com.au/ap/register?showRememberMe=true&openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com.au%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&prevRID=W7WM53JCYJJPAGFR34X5&openid.assoc_handle=auflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&pageId=auflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    }
}
