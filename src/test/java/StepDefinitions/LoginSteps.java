package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    WebDriver driver;

    @Given("Browser is open")
    public void browser_is_open() {
        System.out.print("First step");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }
    @When("User enters correct username and password")
    public void user_enters_correct_username_and_password() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));


        username.sendKeys("student");
        password.sendKeys("Password123");
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.id("submit"));

        loginButton.click();
    }

    @Then("User is navigated to the homepage")
    public void user_is_navigated_to_the_homepage() {
        String currenturl = driver.getCurrentUrl();
        assertEquals("https://practicetestautomation.com/logged-in-successfully/", currenturl);
        driver.quit();
    }

}
