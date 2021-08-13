package Stepdefgluecode;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.*;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginsteps {
	WebDriver driver;
	 
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Testing");
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
				driver.manage().window().maximize();			
	       driver.get("http://demo.guru99.com/v4/");
	       
	    	}

	@When("user enters username and password")
	public void user_enters_username_and_password(String username,String password) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("uid")).sendKeys(username);					
	       driver.findElement(By.name("password")).sendKeys(password);	
	
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("btnLogin")).click();
		//driver.findElement(By.tagName("Password must not be blank"));
		//driver.close();
	}

	@Then("user navigating to landing page")
	public void user_navigating_to_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Testing");
	}

	@When("user enters user1 and pass2")
	public void user_enters_user1_and_pass2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Testing");
	}

	@When("user enters user2 and pass1")
	public void user_enters_user2_and_pass1() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	

}
