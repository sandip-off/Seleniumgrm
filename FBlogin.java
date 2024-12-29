package seleniumgrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("admmin@123");
	driver.findElement(By.name("login")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();

	}

}
