package searchform;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pagefactor.Combined;
import Pagefactor.Search;
import Pagefactor.contacts;



public class SearchFormStep {
	WebDriver driver;
	  JavascriptExecutor js;
	  Search sc;


@Given("^After home page appears user go to contacts$")
public void after_home_page_appears_user_go_to_contacts() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\UMSUDHEE\\Documents\\selenium\\drives\\chromedriver_win32\\chromedriver.exe");
   

    WebDriverManager.chromedriver().setup();
    sc = new Search(driver);
     driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://classic.freecrm.com/index.html");
    driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/input[1]")).sendKeys("sudheer36");
    driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/input[2]")).sendKeys("Ssudheer36@");
    driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).click();
    driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));


	
}

@When("^click on fullsearch form$")
public void click_on_fullsearch_form() {
	System.out.println("useris on home page");
	//sc.clickoncontact();
	driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
}

@Then("^user details displayed in full search form$")
public void user_details_displayed_in_full_search_form() {
	
	sc = new Search(driver);
	
}
 

@Given("^After home page appears user go to contact$")
public void after_home_page_appears_user_go_to_contact() {
	sc.clickoncontact();
	//driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
	
}

@When("^user clicks on contacts$")
public void user_clicks_on_contacts() {
	
}

@Then("^user is displayed companies page with search fields and options$")
public void user_is_displayed_companies_page_with_search_fields_and_options() {
	 String expected = "Contacts";
     String actual = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[1]/td/table/tbody/tr/td[1]")).getAttribute("innerHTML");
    // Assert.assertEquals(expected, actual);
     //driver.quit();
 // Write code here that turns the phrase above into concrete actions
     Assert.assertTrue(actual.contains(expected));

sc= new Search(driver);
}

@Given("^user is displayed the home page click on full search form$")
public void user_is_displayed_the_home_page_click_on_full_search_form(){
	driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
}

@When("^enter details and search for the details$")
public void enter_details_and_search_for_the_details() {
	sc.entername("sudheer");
	//driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[1]/tbody/tr[2]/td/div/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/input")).sendKeys("sudheer");
	sc.clickonsearch();
	//driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[1]/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]/table/tbody/tr[7]/td[2]/input[2]")).click();
}

@Then("^user is displayed with contact details$")
public void user_is_displayed_with_contact_details() {
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Given("^after the home page click on full search form$")
public void after_the_home_page_click_on_full_search_form() {
	
}

@When("^enter invalid details and search for the details$")
public void enter_invalid_details_and_search_for_the_details() {
	//driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[1]/tbody/tr[2]/td/div/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/input")).sendKeys("Animal");
	sc.entername("Animal");
	
	sc.clickonsearch();
}

@Then("^user details will not displayed with contact details$")
public void user_details_will_not_displayed_with_contact_details() {
	
}

@Given("^after the home page then click on contacts$")
public void after_the_home_page_then_click_on_contacts() {
	
}

@When("^click on edit icon from the given list of user details$")
public void click_on_edit_icon_from_the_given_list_of_user_details() {
	sc.entername("sudheer");
	sc.clickonedit();
	
}

@Then("^A form is desplaid to edit the form from selected list$")
public void a_form_is_desplaid_to_edit_the_form_from_selected_list() {
	sc.saveedit();
	driver.switchTo().alert().accept();
	
}

@When("^click on delete icon from the given list and click on ok$")
public void click_on_delete_icon_from_the_given_list_and_click_on_ok() {
	sc.entername("sudheer");
	sc.clickondelete();
}

@Then("^details of user contacts will be deleted$")
public void details_of_user_contacts_will_be_deleted() {
	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a"));
	
}



}
