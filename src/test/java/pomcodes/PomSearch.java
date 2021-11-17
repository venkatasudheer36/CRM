package pomcodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pagefactor.Combined;
import Pagefactor.contacts;
import Pagefactor.Search;
public class PomSearch {
	WebDriver driver;
	contacts adf;
	Combined cb;
	Search sc;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://classic.freecrm.com/index.html");
	  driver.manage().window().maximize();
	  sc.enterUsername("sudheer36");
	  sc.enterPassword("Ssudheer36@");
	  sc.clickonlogin();
	  driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
	  sc.clickoncontact();
	  sc.entername("sudheer");
	  sc.clickonsearch();
	  sc.clickonedit();
	  sc.saveedit();
	  sc.clickondelete();
	  
	  
	  }
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\UMSUDHEE\\Documents\\selenium\\drives\\chromedriver_win32\\chromedriver.exe");
	  	driver=new ChromeDriver();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	sc=PageFactory.initElements(driver, Search.class);
	  	}

	  @AfterClass
	  public void afterClass() {
		adf=null;
		driver.quit();
	  }


}
