package seleniumgrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11_Locator_partialLinktext {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/User/Documents/netflix.html");
	WebElement ele=driver.findElement(By.partialLinkText("N"));
	ele.click();
	Thread.sleep(2000);
	driver.quit();
}
}
