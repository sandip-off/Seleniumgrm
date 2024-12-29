package seleniumgrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriver driver2=new FirefoxDriver();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver2.close();
		

	}

}
