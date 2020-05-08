package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	WebDriver driver = null;
	
	@Given("^User navigates to login page of the application$")
	public void navigateToLoginPage()  {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		
	}

	@When("^User enters Username (.*) and Password (.*) into the fields$")
	public void enterUsernameAndPassword(String username, String password)  {
	    
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		driver.findElement(By.id("input-password")).sendKeys(password);
		
	}

	@And("^Clicks on Login button$")
	public void clickOnLoginButton() {
	  
		driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();
		
	}

	@Then("^User should successfully login$")
	public void user_should_successfully_login(){
		
		WebElement element = null;
		
	   try {
		   
		   element = driver.findElement(By.linkText("Register for an affiliate account"));
		   
	   }catch(Exception exc) {
		   
		   System.out.println("User has not logged in");		
		   
	   }
	   
	   Assert.assertNotNull("User has not logged in", element);
		
	}

}