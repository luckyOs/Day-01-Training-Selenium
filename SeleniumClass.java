package OshaniPackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class SeleniumClass {

	@Test
	
	public void test()
	{

		
		System.setProperty("webdriver.chrome.driver","D:\\OSHI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/insurance/v1/index.php";
     


        driver.get(baseUrl);
        
        driver.findElement(By.xpath("//a[@href='register.php']")).click();
        
        
       Select drpTitle=new Select(driver.findElement(By.name("title")));
       drpTitle.selectByVisibleText("Mr");
       
       driver.findElement(By.name("firstname")).sendKeys("Oshani");
       driver.findElement(By.name("lastname")).sendKeys("Lakchani");
       driver.findElement(By.name("phone")).sendKeys("0779963258");
       
       
      
       
       Select drpYear=new Select(driver.findElement(By.name("year")));
       drpYear.selectByVisibleText("1991");
       
       
       Select drpMonth=new Select(driver.findElement(By.name("month")));
       drpMonth.selectByVisibleText("June");
       
       Select drpDate=new Select(driver.findElement(By.name("date")));
       drpDate.selectByVisibleText("10");
       
       WebElement  radio1=driver.findElement(By.name("licencetype"));
       radio1.click();
       
     
       
       Select drplicence=new Select(driver.findElement(By.name("licenceperiod")));
       drplicence.selectByVisibleText("1");
       
       Select drpOccu=new Select(driver.findElement(By.name("occupation")));
       drpOccu.selectByVisibleText("Academic");
       
       
       driver.findElement(By.id("user_address_attributes_street")).sendKeys("Panadura");
      
       driver.findElement(By.id("user_address_attributes_city")).sendKeys("colombo");
       
       driver.findElement(By.id("user_address_attributes_county")).sendKeys("Sri Lanka");
       driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("1111");
       driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("oshanilakchani@gmail.com");
       driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("1222");
       driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("1222");
       
       
       driver.findElement(By.name("submit")).submit();

       
       
  
       
       
       
       
      
     
        driver.close();
	}
    
	
	
	
}

