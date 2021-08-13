package Stepdefgluecode;

import io.cucumber.java.en.Given;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
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
		 WebDriverWait _wait = new WebDriverWait(driver, 50000);
				driver.manage().window().maximize();			
				//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	       driver.get("https://testscriptdemo.com"); // Opening webpage
	       //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	       
	       Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       // findElement() will try to identify element till 5 secs
	       WebElement n=driver.findElement(By.xpath(" //*[@id=\"cc-window\"]/div[5]/a[1]"));
	       n.click();
	       
	       //driver.findElement(By.xpath(" //*[@id=\"cc-window\"]/div[5]/a[1]")).click();
	     	       
	       // adding four elements to wishlist
	       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	       //Accept All cookies
	       
	       _wait = new WebDriverWait(driver, 5000000);
	       
	       
	       
	       driver.findElement(By.xpath("//*[@id='site-content']/div/div/div/div/section[4]/div/div/div/div/div/div/div/ul/li[2]/div/div[2]/div/div/a")).click();
	       System.out.println("Product1 added");
	       _wait = new WebDriverWait(driver, 2000000);
	       Timeouts implicitlyWait2 = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//*[@id='site-content']/div/div/div/div/section[4]/div/div/div/div/div/div/div/ul/li[1]/div/div[2]/div/div/a")).click();
	       System.out.println("Product2 added");
	        _wait = new WebDriverWait(driver, 2000000);
	        Timeouts implicitlyWait21 = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        //
	       driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/div/section[4]/div/div/div/div/div/div/div/ul/li[5]/div/div[2]/div/div/a")).click();
	      System.out.println("Product3 added");
	       _wait = new WebDriverWait(driver, 2000000);
	       Timeouts implicitlyWait3 = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/div/section[4]/div/div/div/div/div/div/div/ul/li[3]/div/div[2]/div/div/a")).click();
	       System.out.println("Product4 added");
	       _wait = new WebDriverWait(driver, 2000000);
	       Timeouts implicitlyWait4 = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       System.out.println("Four items added to Wishlist");
	       _wait = new WebDriverWait(driver, 2000000);
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("user view mywhishlist")
	public void user_view_mywhishlist() {
	    // Viewing Wishlist
		WebDriverWait _wait2 = new WebDriverWait(driver, 50000);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'blog\']/div[3]/div[1]/div/div/div[3]/div[3]/a")).click();
		System.out.println("Viewing Wishlist Table");
	}
	

	@Then("Find price of each wishlist item")
	public void find_price_of_each_wishlist_item() {
		String price1= null;
	    // Getting and displaying the price of each item in Wishlist
		Timeouts implicitlyWait22 = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     price1 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/article/div/div/div[1]/form/table/tbody/tr[1]/td[4]")).getText();
	     System.out.println("Price for wish list Product1" +price1);
	     price1 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/article/div/div/div[1]/form/table/tbody/tr[2]/td[4]")).getText();
	     System.out.println("Price for wish list Product2" +price1);
	     price1 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/article/div/div/div[1]/form/table/tbody/tr[3]/td[4]")).getText();
	     System.out.println("Price for wish list Product3" +price1);
	     price1 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/article/div/div/div[1]/form/table/tbody/tr[4]/td[4]")).getText();
	     System.out.println("Price for wish list Product4" +price1);
	   
	   
	  
	}

	@When("Search lower price product in Relevance")
	public void search_lower_price_product_in_relevance() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebDriverWait _wait = new WebDriverWait(driver, 200000);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"site-navigation\"]/div/ul/li/a")).click();
		System.out.println("Category click");
		////home page category/////html/body/div[3]/div[2]/nav/div/ul/li
		driver.findElement(By.xpath("//*[@id=\"menu-item-302\"]/a")).click();
		Timeouts implicitlyWait1 = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/form/select")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/form/select")).sendKeys("Sort by price: low to high");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/form/select")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/form/select")).sendKeys("Default sorting");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/form/select")).click();
		
				
		
        //Thread.sleep(4000);
       // menu2.selectByVisibleText("Knightsbridge");
        //Thread.sleep(4000);
		
	}

	@When("Able to add in to cart")
	public void able_to_add_in_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/ul/li[1]/a[2]")).click();
		System.out.println("Added to Cart");
		
	}

	@Then("Verify myCart")
	public void verify_my_cart() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/ul/li[1]/a[3]")).click();
		System.out.println("View Cart");
	}
}

	
	////////////////////////////////
	