package seleniumgrm; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorpassvlue{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:\\Users\\User\\Documents/aaa.html");
		
		Thread.sleep(2000);
		//driver.findElement(By.id("a1")).click();
		driver.findElement(By.tagName("input")).sendKeys("selenium");
		
	}

}
