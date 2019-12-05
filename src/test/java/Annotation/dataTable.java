package Annotation;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataTable {
	WebDriver driver = null;
	
	
	@Given("^I am on the new user registration page$")
	public void goToFacebook() {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
	}
	
	@When("^I enter invalid data on the page")
	public void enterData(DataTable table) {
		List<String> data = table.column(1);
		
		System.out.println(data);
		
		driver.findElement(By.name("firstname")).sendKeys(data.get(1));
		driver.findElement(By.name("lastname")).sendKeys(data.get(2));
		driver.findElement(By.name("reg_email__")).sendKeys(data.get(3));
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys(data.get(4));
	    driver.findElement(By.name("reg_passwd__")).sendKeys(data.get(5));
	    
	    Select dropDownB = new Select(driver.findElement(By.name("birthday_day")));
	    dropDownB.selectByValue("15");
	    Select dropdownM = new Select(driver.findElement(By.name("birthday_month")));
	    dropdownM.selectByValue("6");
	    Select dropdownY = new Select(driver.findElement(By.name("birthday_year")));
	    dropdownY.selectByValue("1990");
	    
	    driver.findElement(By.className("_58mt")).click();
	    
	    driver.findElement(By.name("websubmit")).click();
	    
	    
	}
	
	@Then("^User registration should be unsucessful$") @Test
	public void userRegistrationUnsucessful() {
		
		String warnMsgExpected = "Please choose a more secure password. It should be longer than 6 characters, unique to you, and difficult for others to guess.";
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("reg_error_inner"))));
		
		String warnMsgActual = driver.findElement(By.id("reg_error_inner")).getText();
		
		assertEquals("FAILURE - Actual URL is not the expected!", "https://www.facebook.com/", driver.getCurrentUrl());
		assertEquals("FAILURE - Warning message is not showed properly.", warnMsgExpected, warnMsgActual);
		
		driver.close();
	}
	
}
