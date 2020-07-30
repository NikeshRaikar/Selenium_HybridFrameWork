package testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	static WebDriver driver;
	static FileInputStream file ;
	static Properties prop;
	
	
	
public void openbrowser(String data )throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ERIKINA\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");  
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 file=new FileInputStream("C:\\Users\\ERIKINA\\Documents\\workspace\\OLXframework\\src\\objectrepository\\Objectrepository.properties");
	   prop= new Properties();
   prop.load(file);
   
	 
	
}

	
public void navigate(String data)
{
		System.out.println(data);
		driver.get(data);
}


public void input(String objectname , String data  )
{
	driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(data);
 //  driver.findElement(By.xpath( "//*[@class='rui-1ekfu rui-3oSYn']")).sendKeys("raikarnikhet@gmail.com");
   //driver.findElement((By.xpath("//*[@class='rui-1ekfu rui-3oSYn']")).sendKeys(data);
}




public void click(String objectname)

{
	driver.findElement(By.xpath(prop.getProperty(objectname))).click();
}

 public String verifyTittle()
 {
	 
	 String tittle = driver.getTitle();
	
	 return tittle;
	 
 }




}
