package Annotation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
		List<String> data = table.row(1);
		
		// TODO: Map inputs
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
	
	@Then("^User registration should be unsucessful$")
	public void userRegistrationUnsucessful() {
		// TODO: Trade for assert
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
		driver.close();
	}
	
}
