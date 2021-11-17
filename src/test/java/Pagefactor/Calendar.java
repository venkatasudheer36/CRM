package Pagefactor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calendar {
	  @FindBy(xpath = "/html/body/div[2]/div/div[3]/form/div/input[1]")
	    WebElement username;
	    
	    @FindBy(xpath = "/html/body/div[2]/div/div[3]/form/div/input[2]")
	    WebElement password;
	    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div/input")
	    WebElement submit;
	    @FindBy(xpath = "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[2]/a")
	    WebElement calendar;
	    JavascriptExecutor js;
	    
	   
	    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[2]/input")
	    WebElement title;
	    @FindBy(xpath = "//*[@id=\"f_trigger_c_start\"]")
	    WebElement selectdate;
	    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/input")
	    WebElement Phone;
	    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[2]/table/tbody/tr[7]/td[2]/input")
	    WebElement Email;
	    @FindBy(xpath = "//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")
	    WebElement save;

}
