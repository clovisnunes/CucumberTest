package Annotation;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		WebElement lgnbutton = null;
		try {
			lgnbutton = driver.findElement(By.id("loginbutton"));
		} catch (NoSuchElementException exception) {
			lgnbutton = driver.findElement(By.name("login"));
		}
		
		lgnbutton.click();
	}
	
	@Then("^Login should fail$")
	public void checkFail() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Log into"));
		
		assertEquals("FAILURE - Actual URL is not the expected!", "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110", driver.getCurrentUrl());
	
	}
	
	// TODO: Remove piece of code (repeated code)
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
	
	@When("^I click on Forgot Account option$")
	public void clickForgot() {
		driver.findElement(By.linkText("Forgot account?")).click();
	}
	
	@Then("^I go to Find your account page$") @Test
	public void checkForgotPage() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Forgot"));
		
		assertEquals("FAILURE - Actual URL is not the expected!", "https://www.facebook.com/login/identify/?ctx=recover&ars=royal_blue_bar", driver.getCurrentUrl());

		driver.close();
		
	}
	
}