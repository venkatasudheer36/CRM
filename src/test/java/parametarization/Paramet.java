package parametarization;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pagefactor.Homepage;
import Pagefactor.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Paramet {
	 public static WebDriver driver;
	Login lo;
	Homepage ho;

	
		
		
		@Test
		public void excel() throws IOException {
		//define path of excel
	    FileInputStream fs=new FileInputStream(new File("C:\\Users\\UMSUDHEE\\eclipse-workspace\\FreeCRM\\src\\main\\resources\\paramet\\Book1.xlsx"));
	    //create workbook
	    XSSFWorkbook wb=new XSSFWorkbook(fs);
	    //access worksheet
	    XSSFSheet sh=wb.getSheetAt(0); //0 means referring to 1st sheet
	
	    int lastrow=sh.getLastRowNum();
	    
	    System.out.println("last row used is :"+lastrow);
	   
	    for(int i=1;i<=lastrow;i++){
	        System.out.println(sh.getRow(i).getCell(0)+"-----"+sh.getRow(i).getCell(1));
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UMSUDHEE\\Documents\\selenium\\drives\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://classic.crmpro.com/index.html");
	        String un = sh.getRow(i).getCell(0).toString();
	        //String mn = sh.getRow(i).getCell(1).toString();
	        driver.findElement(By.name("username")).sendKeys(un);
	        String mn=sh.getRow(i).getCell(1).toString();
	        driver.findElement(By.name("password")).sendKeys(mn);
	        driver.findElement(By.cssSelector("input[value='Login']")).click();

	        if(driver.getTitle().contains("CRMPRO")){        //driver.findElement(By.xpath("//*[@align='left']")).getText().contains("t log")          
	            System.out.println("Valid login credentials");                                                  
	            //write to cell
	            sh.getRow(i).createCell(2).setCellValue("Valid credentials");                   
	            driver.close();
	            
	        }else{
	            System.out.println("invalid login credentials");
	            sh.getRow(i).createCell(2).setCellValue("Invalid Credentials");
	            driver.close();

	        } 
	        
	    }
	    
	    FileOutputStream fos=new FileOutputStream(new File("‪C:\\Users\\UMSUDHEE\\eclipse-workspace\\FreeCRM\\src\\main\\resources\\paramet\\Book1.xlsx"));
	    wb.write(fos);
	    fos.close();
	             
	    }

		
@BeforeClass
public static void beforetest() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\UMSUDHEE\\Documents\\selenium\\drives\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    
    
    WebDriverManager.chromedriver().setup();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    

}

@AfterClass
public static void aftertest() {
    driver.quit();
}



public void Caseslinks(WebDriver driver){
this.driver=driver;
JavascriptExecutor js = (JavascriptExecutor)driver;
PageFactory.initElements(driver,this);



}
}



