package parametarization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pagefactor.*;

public class ParameConacts {
	 public static WebDriver driver;
	 
	    JavascriptExecutor js;
	    Homepage lp;contacts cs ;
	    Combined hp;Login lg;

	@Test
    public void para() throws IOException {
		
        FileInputStream fs = new FileInputStream(new File("C:\\Users\\UMSUDHEE\\Documents\\pagefactor\\Book1.xlsx"));
        //create workbook
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        //access worksheet
        XSSFSheet sh = wb.getSheetAt(0);
        int lastrow = sh.getLastRowNum();
        System.out.println("last row used is :" + lastrow);
        for (int i = 1; i <= lastrow; i++) {

            String un = sh.getRow(i).getCell(0).toString();
            driver.get("https://classic.freecrm.com/index.html");

            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/input[1]")).sendKeys();
            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/input[2]")).sendKeys();

            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).click();

            }
        }

    


    @BeforeClass
    public static void beforetest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UMSUDHEE\\Documents\\selenium\\drives\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @BeforeClass


    @AfterClass
    public static void aftertest() {
        driver.quit();
    }
}


