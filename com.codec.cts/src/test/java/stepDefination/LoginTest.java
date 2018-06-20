package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	WebDriver driver;

@Given("^Open firefox and start application$")
public void open_firefox_and_start_application() throws Throwable {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.newegg.com/");

}

@When("^I enter valid user id and valid password$")
public void i_enter_valid_user_id_and_valid_password() throws Throwable {
	//driver.findElement(By.name("q")).sendKeys("amex");
	Thread.sleep(5500);
	driver.findElement(By.cssSelector("a[href*='https://secure.newegg.com']")).click();
driver.findElement(By.id("UserName")).sendKeys("ctschallenge18@gmail.com");
driver.findElement(By.id("UserPwd")).sendKeys("Challenge18");
driver.findElement(By.cssSelector("recaptcha-checkbox-checkmark")).click();
driver.findElement(By.className("form-cell layout-third-one")).click();




			
	

}

@Then("^User should login successfully$")
public void user_should_login_successfully() throws Throwable {
	driver.findElement(By.name("btnK")).click();

}

	
}
