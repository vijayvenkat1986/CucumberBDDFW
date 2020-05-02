package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class omayologin {
	
	WebDriver driver = new ChromeDriver();

	@Given("^I navigate to the omayo website$")
	public void i_navigate_to_the_omayo_website() {
	    // Write code here that turns the phrase above into concrete actions
	   // System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.omayo.blogspot.com");
	}
	
	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
	public void i_enter_Username_as_and_Password_as_into_the_fields(String username, String password){
	    driver.findElement(By.name("userid")).sendKeys(username);
	    driver.findElement(By.name("pswrd")).sendKeys(password);
	}
	
	@And("^I click on Login button$")
	public void i_click_on_Login_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[type='button'][value='Login']")).click();
		Thread.sleep(5000);
	}
	
	@Then("^User should login based on expected \"([^\"]*)\" status$")
	public void user_should_login_based_on_expected_status(String expectedstatus) {
		String expectedLoginStatus = expectedstatus;
		String actualLoginStatus=null;
		
	    try{
		Alert alert = driver.switchTo().alert();
	    String textOnTheAlert = alert.getText();
	    System.out.println(textOnTheAlert);
	    if(textOnTheAlert.equals("Error Password or Username"))
	    {
	    	actualLoginStatus = "failure";
	    }
	    }catch(Exception e)
	    {
	    	actualLoginStatus = "success";
	    }
	    
	    if(actualLoginStatus.equals(expectedLoginStatus))
	    {
	    	
	    }else {
	    	Assert.fail("OmayoLogin Failed");
	    }
	    
	    driver.quit();
	}

	
	
}
