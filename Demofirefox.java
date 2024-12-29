package seleniumgrm;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demofirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();


	}

}
