package seleniumgrm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openchrome_firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		FirefoxDriver driver2 =new FirefoxDriver();

	}

}
