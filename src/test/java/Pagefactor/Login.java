package Pagefactor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	    public WebDriver driver;

	    @FindBy(xpath = "//*[@id=\\\"loginForm\\\"]/div/input[1]")
	    WebElement username;
	    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/input[2]")
	    WebElement password;
	    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div/input")
	    WebElement submit;
	    public Login(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }

	    public void Login(String uname,String passwd){
	        username.sendKeys("sudheer36");
	        password.sendKeys("Ssudheer36@");
	        submit.click();
	    }
	}
