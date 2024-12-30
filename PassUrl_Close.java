package seleniumgrm;

import org.openqa.selenium.chrome.ChromeDriver;

public class PassUrl_Close {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.close();
		//driver.quit();
		
	}

}
