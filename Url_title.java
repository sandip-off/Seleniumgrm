package seleniumgrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url_title {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		

		
		
	}

}
