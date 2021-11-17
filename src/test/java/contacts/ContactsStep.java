package contacts;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import Pagefactor.*;
public class ContactsStep {
	  WebDriver driver;
	  JavascriptExecutor js;
	    contacts su;
	    Combined co;


	@Given("^Open chrome and navigate to login page$")
	public void open_chrome_and_navigate_to_login_page() {
		//System.out.println("2");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\UMSUDHEE\\Documents\\selenium\\drives\\chromedriver_win32\\chromedriver.exe");
	     su= new contacts(driver);
	    co= new Combined(driver);

	     WebDriverManager.chromedriver().setup();

	      driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://classic.freecrm.com/index.html");
		
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^User enter detsails and click on login$")
	public void user_enter_detsails_and_click_on_login()  {
		System.out.println("3");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/input[1]")).sendKeys("sudheer36");
	        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/input[2]")).sendKeys("Ssudheer36@");
	        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).click();
	    

	    // Write code here that turns the phrase above into concrete actions
	    	}

	@Then("^home page should open$")
	public void home_page_should_open()  {
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
		 String expected = "sudheer venkata";
	        String actual = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")).getAttribute("innerHTML");
	       // Assert.assertEquals(expected, actual);
	        //driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	        Assert.assertTrue(actual.contains(expected));
	        su= new contacts(driver);
	        co= new Combined(driver);
	}

	@Given("^After home page appears user go to contacts$")
	public void after_home_page_appears_user_go_to_contacts()  {
		
		 js = (JavascriptExecutor)driver;
		su.clickoncontact();
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\UMSUDHEE\\Documents\\selenium\\drives\\chromedriver_win32\\chromedriver.exe");
//	     su= new contacts(driver);
//	     co= new Combined(driver);
//
//	     //WebDriverManager.chromedriver().setup();
//
//	      driver = new ChromeDriver();
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	    // Write code here that turns the phrase above into concrete actions
	  
	}
//	@Before
//	public void before(){
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\UMSUDHEE\\Documents\\selenium\\drives\\chromedriver_win32\\chromedriver.exe");
//		 su= new contacts(driver);
//	     co= new Combined(driver);
//
//	     //WebDriverManager.chromedriver().setup();
//
//	      driver = new ChromeDriver();
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    
	//}

	@When("^click on new contacts in contacts field$")
	public void click_on_new_contacts_in_contacts_field() {
		
		su.clickonnewcontact();
	}

	@When("^enter mandatory validsudheer sudheer jay detalis and click on save$")
	public void enter_mandatory_validsudheer_sudheer_jay_detalis_and_click_on_save() {
		su.enterfirstname("sudheer");
		su.enterlastname("sudh");
		su.save();
		
	}

	@Then("^saved details will appearpass$")
	public void saved_details_will_appearpass() {
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/div[1]/table"));
	}

	@When("^enter mandatory validjaya venkat detalis and click on save$")
	public void enter_mandatory_validjaya_venkat_detalis_and_click_on_save() {
		su.clickonnewcontact();
		su.enterfirstname("Jaya");
		su.enterlastname("venkat");
		su.save();
	}

	@When("^click on new contacts$")
	public void click_on_new_contacts() {
		su.clickonnewcontact();
	}

	@When("^enter user entries sudheer@gmail\\.com and (\\d+) <values> and click on save$")
	public void enter_user_entries_sudheer_gmail_com_and_values_and_click_on_save(int arg1) {
		su.enterfirstname("jay");
		su.enterlastname("venk");
		su.enterphone("918230");
		su.entermail("sudheer@gmail");
		su.save();
	}

	@Then("^user saved details will appear pass$")
	public void user_saved_details_will_appear_pass() {
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/div[1]/table"));
	}

	@When("^enter user entries sudheer(\\d+)@gmail\\.com and (\\d+) <values> and click on save$")
	public void enter_user_entries_sudheer_gmail_com_and_values_and_click_on_save(int arg1, int arg2) {
		su.enterphone("2345");
		su.entermail("sudhe");
		su.save();
	}

	@When("^enter mandataory details with blank$")
	public void enter_mandataory_details_with_blank() {
		su.clickonnewcontact();
	
		
		
	}

	@When("^click on save button in contact$")
	public void click_on_save_button_in_contact(){
		su.save();
	}

	@Then("^user will be displayed with alert box$")
	public void user_will_be_displayed_with_alert_box() {
		driver.switchTo().alert().accept();
		
		
	}

	@When("^use go to company enter mandataory details with blank$")
	public void use_go_to_company_enter_mandataory_details_with_blank() {
		//co.clickoncombine();
		 
		js.executeScript("document.querySelector(\"#navmenu > ul > li:nth-child(4) > ul > li:nth-child(2) > a\").click()");
		co.clickonsave();
	}

	@Then("^click ok on alert box$")
	public void click_ok_on_alert_box() {
		driver.switchTo().alert().accept();
		
		
	}

	@When("^click on new contacts fill details$")
	public void click_on_new_contacts_fill_details() {
		su.clickoncontact();
	}

	@When("^enter invalid details in fields and click save$")
	public void enter_invalid_details_in_fields_and_click_save() {
		su.clickonnewcontact();
		su.enterfirstname("123");
		su.enterlastname("3267");
		su.entermail("se");
		su.save();
	}

	@Then("^details should not accept$")
	public void details_should_not_accept() {
		driver.switchTo().alert().accept();
	}

	@When("^click on combined form$")
	public void click_on_combined_form() {
		//co.clickoncombine();
		js.executeScript("document.querySelector(\"#navmenu > ul > li:nth-child(4) > ul > li:nth-child(2) > a\").click()");
		
	}

	@When("^enter mandatory valid detalis of comapany first and last name and click on save$")
	public void enter_mandatory_valid_detalis_of_comapany_first_and_last_name_and_click_on_save() {
		System.out.println("2");
		//co.clickoncombine();
		//js.executeScript("document.querySelector(\"#navmenu > ul > li:nth-child(4) > ul > li:nth-child(2) > a\").click()");
		co.entercompanyname("capgemini");
		co.enterfirstname("sudheer");
		co.enterlastname("venkat");
		co.clickonsave();

	}

	@Then("^saved details will appear in combined form$")
	public void saved_details_will_appear_in_combined_form() {
		driver.findElement(By.xpath("/html/body"));
		//String expected = driver.findElement(By.xpath("/html/body;"));
        //String actual = driver.findElement(By.xpath("/html/body")).getAttribute("innerHTML");
		//Assert.assertTrue(actual.contains(expected));
	}

	@When("^enter valid detalis of user detail in combined form$")
	public void enter_valid_detalis_of_user_detail_in_combined_form() {
		//co.clickoncombine();
		js.executeScript("document.querySelector(\"#navmenu > ul > li:nth-child(4) > ul > li:nth-child(2) > a\").click()");
		co.entercompanyname("sudheer");
		
		co.enterfirstname("sudheer");
		co.enterlastname("sudheer");
		
	}

	@When("^add address details$")
	public void add_address_details() {
		co.enteraddress("42/2901");
	}

	@When("^click on save button$")
	public void click_on_save_button() {
		co.clickonsave();
	}

	@When("^user enters invalid information clicks save in combined form$")
	public void user_enters_invalid_information_clicks_save_in_combined_form() {
		//co.clickoncombine();
		js.executeScript("document.querySelector(\"#navmenu > ul > li:nth-child(4) > ul > li:nth-child(2) > a\").click()");
		co.entercompanyname("ca");
		co.enterfirstname("@#%^");
		co.enterlastname("@^%@");
		co.enterphone("@#^&");
		co.clickonsave();
	}

	@Then("^user is displayed an error message to enter valid$")
	public void user_is_displayed_an_error_message_to_enter_valid() {
		driver.switchTo().alert().accept();
	}
	

}
