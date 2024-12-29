package seleniumgrm;

import org.openqa.selenium.chrome.ChromeDriver;

public class Opn_close_chrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
		
	}

}
