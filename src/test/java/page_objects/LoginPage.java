package page_objects;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class LoginPage {
    private final AppiumDriver driver;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }


//    By usernameLocator = By.id("org.wordpress.android:id/nux_username");
//    By passwordLocator = By.id("org.wordpress.android:id/nux_password");
//    By loginButtonLocator = By.id("org.wordpress.android:id/nux_sign_in_button");



    public LoginPage enterCredentials() {
        driver.findElement(By.id("org.wordpress.android:id/nux_username")).sendKeys("calabash");
        driver.findElement(By.id("org.wordpress.android:id/nux_password")).sendKeys("password");
        driver.findElement(By.id("org.wordpress.android:id/nux_add_selfhosted_button")).click();
        driver.findElement(By.id("org.wordpress.android:id/nux_url")).sendKeys("ec2-54-82-18-238.compute-1.amazonaws.com/wordpress");
        driver.findElement(By.id("org.wordpress.android:id/nux_sign_in_button")).click();


        return this;
    }

    // The login page allows the user to submit the login form
//    public HomePage submitLogin() {
//        // This is the only place that submits the login form and expects the destination to be the home page.
//        // A seperate method should be created for the instance of clicking login whilst expecting a login failure.
//        driver.findElement(loginButtonLocator).submit();
//
//        // Return a new page object representing the destination. Should the login page ever
//        // go somewhere else (for example, a legal disclaimer) then changing the method signature
//        // for this method will mean that all tests that rely on this behaviour won't compile.
//        return new HomePage(driver);
//    }
//
//    // The login page allows the user to submit the login form knowing that an invalid username and / or password were entered
//    public LoginPage submitLoginExpectingFailure() {
//        // This is the only place that submits the login form and expects the destination to be the login page due to login failure.
//        driver.findElement(loginButtonLocator).submit();
//
//        // Return a new page object representing the destination. Should the user ever be navigated to the home page after submiting a login with credentials
//        // expected to fail login, the script will fail when it attempts to instantiate the LoginPage PageObject.
//        return new LoginPage(driver);
//    }
//
//    // Conceptually, the login page offers the user the service of being able to "log into"
//    // the application using a user name and password.
//    public HomePage loginAs(String username, String password) {
//        // The PageObject methods that enter username, password & submit login have already defined and should not be repeated here.
//        typeUsername(username);
//        typePassword(password);
//        return submitLogin();
//    }
}