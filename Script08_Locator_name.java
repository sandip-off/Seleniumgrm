package seleniumgrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script08_Locator_name {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Documents/netflix.html");
		WebElement ele=driver.findElement(By.name("link1"));
		ele.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
