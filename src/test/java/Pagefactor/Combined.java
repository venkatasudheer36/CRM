package Pagefactor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Combined {
	public WebDriver driver;
	JavascriptExecutor js;
    @FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/fieldset/table/tbody/tr[3]/td[1]/table/tbody/tr[1]/td[2]/input")
    WebElement companyName;
    @FindBy(xpath="//*[@id=\"industry\"]")
    WebElement industry;
    @FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/fieldset/table/tbody/tr[3]/td[1]/table/tbody/tr[14]/td[2]/input")
    WebElement email;
    @FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[15]/td[2]/input")
    WebElement phone;
    @FindBy(xpath="//*[@id=\"combinedForm\"]/fieldset/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td/table/tbody/tr[4]/td[1]/strong")
    WebElement address;
    @FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/input")
    WebElement FirstName;
    @FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[4]/td[2]/input")
    WebElement LastName;
    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[2]/select/option[4]")
    WebElement title;
    @FindBy(xpath ="//*[@id=\"combinedForm\"]/fieldset/table/tbody/tr[1]/td/input")
    WebElement save;
    
    public void clickoncombine() {
    	js.executeScript("document.querySelector(\"#navmenu > ul > li:nth-child(4) > ul > li:nth-child(2) > a\").click()");   	
    }
    public void entercompanyname(String u1) {
    	companyName.sendKeys(u1);
    }
    public void enterindustry(String u2) {
    	industry.sendKeys(u2);
    }
    	
    public void enteremail(String u3) {
    	email.sendKeys(u3);
    }
    
    public void enterphone(String u4) {
    	phone.sendKeys(u4);
    }
    public void enteraddress(String u5) {
    	address.sendKeys(u5);
    }
    
    public void enterfirstname(String u6) {
    	FirstName.sendKeys(u6);
    	
    }
    
    public void enterlastname(String u7) {
    	LastName.sendKeys(u7);
    	
    }
    
    
    public void clickontitle(){
    	title.click();
    	
    }
    public void clickonsave(){
    	save.click();
    	
    }
    public Combined(WebDriver driver){
        this.driver=driver;
        js = (JavascriptExecutor)driver;
        PageFactory.initElements(driver,this);
    }
}

   