package Pagefactor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Search {
	public WebDriver driver;
    @FindBy(xpath = "/html/body/div[2]/div/div[3]/form/div/input[1]")
    WebElement username;
    
    @FindBy(xpath = "/html/body/div[2]/div/div[3]/form/div/input[2]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div/input")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[4]/a")
    WebElement contact;
    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[1]/tbody/tr[2]/td/div/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/input")
    WebElement searchname;
   
    @FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[1]/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]/table/tbody/tr[7]/td[2]/input[2]")
    WebElement searchBtn;
    @FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[5]/td[8]/a[1]/i")
    WebElement editname;
    @FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[12]/td[1]/input")
    WebElement clickoncheck;
    @FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[3]/td[1]/input")
    WebElement clickonmultiplecheck;
    @FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[4]")
    WebElement clickoncontacttodelete;
    
    @FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")
    WebElement saveedit;
    
    @FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[9]")
    WebElement delete;
    public void enterUsername(String sc1) {
    	username.sendKeys(sc1); 	
    }
    public void enterPassword(String sc2) {
    	password.sendKeys(sc2); 	
    }
    public void clickonlogin() {
    	submit.click();
    }

    public void clickoncontact() {
    	contact.click();
    }

    
    public void entername(String d1) {
    	searchname.sendKeys(d1);
    }
    
    public void clickonsearch() {
    	searchBtn.click();
    }
    public void clickcheckbox() {
    	clickoncheck.click();
    }
    
    public void clickonedit() {
    	editname.click();
    }
    public void saveedit() {
    	saveedit.click();
    }
    public void clicknametodelete() {
    	clickoncontacttodelete.click();
    }
    
    public void clickondelete() {
    	delete.click();
    	driver.switchTo().alert().accept();
    }
    public Search(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}