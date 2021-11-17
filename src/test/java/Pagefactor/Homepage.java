package Pagefactor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;

    @FindBy(xpath = "/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
    WebElement name;
    public Homepage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public Boolean verifyName(String name){

        return this.name.getText().contains(name);
    }


}
