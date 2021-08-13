package Stepdefgluecode;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {
	WebDriver driver;
	
	
	@Given("User add four products into wishlist")
	public void user_add_four_products_into_wishlist() {
	    // Initiating Webdriver Chrome
		System.out.println("Launch Page");
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
				driver.manage().window().maximize();			
	       driver.get("https://testscriptdemo.com"); // Opening webpage
	       
	       WebDriverWait _wait = new WebDriverWait(driver, 10);
	       
	       //
	    

	       //_wait.Until(d => d.FindElement(By.Id("Id_Your_UIElement"));
	       
	       // adding four elements to wishlist
	       _wait = new WebDriverWait(driver, 20000);
	       driver.findElement(By.xpath(" //*[@id=\"cc-window\"]/div[5]/a[1]")).click();
	       
	       //Accept All cookies
	       driver.findElement(By.xpath("//*[@id='site-content']/div/div/div/div/section[4]/div/div/div/div/div/div/div/ul/li[2]/div/div[2]/div/div/a")).click();
	       System.out.println("Product1 added");
	       _wait = new WebDriverWait(driver, 20000);
	       driver.findElement(By.xpath("//*[@id='site-content']/div/div/div/div/section[4]/div/div/div/div/div/div/div/ul/li[1]/div/div[2]/div/div/a")).click();
	       System.out.println("Product2 added");
	        _wait = new WebDriverWait(driver, 100);
	        
	        //
	       driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/div/section[4]/div/div/div/div/div/div/div/ul/li[5]/div/div[2]/div/div/a")).click();
	      // System.out.println("Product3 added");
	       _wait = new WebDriverWait(driver, 100);
	      driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/div/section[4]/div/div/div/div/div/div/div/ul/li[3]/div/div[2]/div/div/a")).click();
	       //System.out.println("Product4 added");
	       _wait = new WebDriverWait(driver, 100);
	       System.out.println("Four items added to Wishlist");
	}

	@When("user view mywhishlist")
	public void user_view_mywhishlist() {
	    // Viewing Wishlist
		WebDriverWait _wait2 = new WebDriverWait(driver, 200);
		driver.findElement(By.xpath("//*[@id=\'blog\']/div[3]/div[1]/div/div/div[3]/div[3]/a")).click();
		System.out.println("Viewing Wishlist Table");
	}
	

	@Then("Find price of each wishlist item")
	public void find_price_of_each_wishlist_item() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Search lower price product in Relevance")
	public void search_lower_price_product_in_relevance() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Able to add in to cart")
	public void able_to_add_in_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify myCart")
	public void verify_my_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}

	
	////////////////////////////////
	