package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Float {
	public static void main(String[] args)
	{
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ERIKINA\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");  
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.olx.in/");
	driver.findElement(By.xpath("//*[@class='rui-3sH3b rui-byaEk rui-1zK8h RgSo4']")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div/button[3]/span")).click();
	
	
	

}
}
