package Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;



public class annotation {
	
	WebDriver driver = null;
	
	@Given("^I am on Facebook login page$")
	public void goToFacebook() {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
	}
	
	@When("^I enter username as \"(.*)\"$")
	public void enterUsername(String arg1) {
		driver.findElement(By.name("email")).sendKeys(arg1);;
	}
	
	@When("^I enter password as \"(.*)\"$")
	public void enterPassword(String arg1) {
		driver.findElement(By.name("pass")).sendKeys(arg1);
		driver.findElement(By.id("u_0_b")).click();
	}
	
	@Then("^Login should fail$")
	public void checkFail() {
		// TODO wait until current url changes
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110")) {
			System.out.println("Test1 Pass");
		} else {
			System.out.println("Test1 Failed");
			System.out.println("Current URL: " + driver.getCurrentUrl());
		}
	}
	
	@Then("^Relogin option should be available$")
	public void checkRelogin() {
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110")) {
			System.out.println("Test2 Pass");
		} else {
			System.out.println("Test2 Failed");
			System.out.println("Current URL: " + driver.getCurrentUrl());
		}
		driver.close();
	}
	
	
}