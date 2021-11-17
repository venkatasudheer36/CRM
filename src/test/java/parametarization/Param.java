package parametarization;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import Pagefactor.*;
import util.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class Param {
	
	
	
	    WebDriver driver;
	    JavascriptExecutor js;
	    Homepage lp;contacts cs ;
	    Combined hp;Login lg;
	    @Test(priority = 1,dataProvider = "credential")
	    public void __1(Object[] data) {
	        lg.Login(data[0].toString(),data[1].toString());
	        driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
	    }
	    @Test(priority = 2)
	    public void __2(){
	        Assert.assertTrue(lp.verifyName("arjun d"));
	    }
	    @Test(priority = 3,dataProvider = "getData")
	    public void __3(Object[] data) {
	        js.executeScript("document.querySelector(\"#navmenu > ul > li:nth-child(3) > ul > li:nth-child(1) > a\").click()");
	        Assert.assertTrue(cs.clickoncontact());
	        String[] d = Arrays.copyOf(data,data.length,String[].class);
	        cs.addCompany(d);
	        Assert.assertTrue(ncp.isAddedCompanyDisplayed(d[0]));
	    }
//	    @Test(priority = 4)
//	    public void __4(){
//	        Assert.assertTrue(lg.isLogOutBtnVisible());
//	        lg.clickLogout();
//	    }
	    @BeforeClass
	    public void _(){
	        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	        WebDriverManager.chromedriver().setup();
	        driver= new ChromeDriver();
	        lp = new loginPage(driver);ncp=new newCompanyPage(driver);
	        hp = new homePage(driver);lg = new logout(driver);
	        js = (JavascriptExecutor)driver;
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://classic.freecrm.com/index.html");

	    }

	    @AfterClass
	    public void ___(){
	        driver.quit();
	    }

	    @DataProvider
	    public Object[][] getData() throws IOException {
	        return ExcelReader.readData("src/test/java/resources/companies.xlsx");
	    }
	    @DataProvider
	    public Object[][] credential() throws IOException{
	        return ExcelReader.readData("src/test/java/resources/credentials.xlsx");
	    }
	}


