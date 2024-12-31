package seleniumgrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetpgeSource_Title_Url {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String src=driver.getPageSource();
		//System.out.println(src);
		Thread.sleep(5000);
		driver.close();
	}

}
