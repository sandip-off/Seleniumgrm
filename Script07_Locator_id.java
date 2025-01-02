package seleniumgrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script07_Locator_id {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/New%20folder/EveningClass/src/seleniumgrm/dummy.html");
	WebElement ele=driver.findElement(By.id("L1"));
	ele.click();
	Thread.sleep(2000);
	driver.quit();
	
}
}
