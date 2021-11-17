package pomcodes;


	import org.testng.annotations.Test;


	import Pagefactor.contacts;
	import Pagefactor.Combined;

	import org.testng.annotations.BeforeClass;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.AfterClass;
	public class PomCode {

		WebDriver driver;
		contacts adf;
		Combined cb;
		
	  @Test
	  public void f() throws InterruptedException {
		  driver.get("https://classic.freecrm.com/index.html");
		  driver.manage().window().maximize();
		  adf.enterUsername("sudheer36");
		  adf.enterPassword("Ssudheer36@");	
		  adf.clickonlogin();
		  driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
		   adf.clickoncontact();
		  //Thread.sleep(10);
		   
		   
		  adf.clickonnewcontact();
		  adf.enterfirstname("sudheer");
		  
		  adf.enterlastname("venkat");
		  adf.enterphone("91823049");
		  adf.entermail("sudheer33@gmail.com");
		  adf.save();
		  
		  //driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
		  cb.clickoncombine();
		  cb.entercompanyname("capgemini");
		  cb.enterlastname("sudheer");
		  cb.enterfirstname("jay");
		  cb.clickonsave();
		  
		  
		  
	  }
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\UMSUDHEE\\Documents\\selenium\\drives\\chromedriver_win32\\chromedriver.exe");
	  	driver=new ChromeDriver();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	adf=PageFactory.initElements(driver, contacts.class);
	  	cb=PageFactory.initElements(driver, Combined.class);
	  	
	  	}

	  @AfterClass
	  public void afterClass() {
		adf=null;
		driver.quit();
	  }

}
