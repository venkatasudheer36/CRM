package Pagefactor;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class contacts {
	


	    public WebDriver driver;
	    
	    @FindBy(xpath = "/html/body/div[2]/div/div[3]/form/div/input[1]")
	    WebElement username;
	    
	    @FindBy(xpath = "/html/body/div[2]/div/div[3]/form/div/input[2]")
	    WebElement password;
	    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div/input")
	    WebElement submit;

	    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[4]/a")
	    WebElement contact;
	    JavascriptExecutor js;

	   // @FindBy(xpath = "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/ul/li[1]/a")
	    //WebElement Newcontact;
	    
	   
	    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[2]/input")
	    WebElement LastName;
	    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/input")
	    WebElement FirstName;
	    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/input")
	    WebElement Phone;
	    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[2]/table/tbody/tr[7]/td[2]/input")
	    WebElement Email;
	    @FindBy(xpath = "//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")
	    WebElement save;
	    
	    public void enterUsername(String s6) {
	    	username.sendKeys(s6); 	
	    }
	    public void enterPassword(String s7) {
	    	password.sendKeys(s7); 	
	    }
	    public void clickonlogin() {
	    	submit.click(); 	
	    }
	    public void clickoncontact() {
	    	contact.click(); 	
	    
	    }
	    public void clickonnewcontact() {
	    	js.executeScript("document.querySelector(\"#navmenu > ul > li:nth-child(4) > ul > li:nth-child(1) > a\").click()");  
	    }
	    public void enterfirstname(String s1) {
	    	FirstName.sendKeys(s1);
	    	
	    }
	    public void enterlastname(String s2) {
	    	LastName.sendKeys(s2);
	    	
	    }
	    public void enterphone(String s3) {
	    	Phone.sendKeys(s3);
	    	
	    }
	    public void entermail(String s4) {
	    	Email.sendKeys(s4);
	    	
	    }
	    public void save() {
	    	save.click();
	    	
	    }
	    
	    public contacts(WebDriver driver){
	        this.driver=driver;
	        js = (JavascriptExecutor)driver;
	        PageFactory.initElements(driver,this);
	    }
	    
}
//	    public Boolean isCompanyPageVisible()
//	    {
//	        return this.contact.getText().equals("Create New Company");
//	   
//	    
//	    public void addcontact(String[] data)
//	    {
	 

	  