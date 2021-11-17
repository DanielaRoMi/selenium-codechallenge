import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import automation.HeroKuApp;

public class App {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DRODR\\eclipse-workspace\\TestCode\\resources\\drivers\\chromedriver.exe");
		
		onlyWrongPass();
		wrongUserRightPass();
				
		
	}
	
	public static void onlyWrongPass() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		HeroKuApp base = new HeroKuApp(driver);
		base.goToLogin();
		base.wrongPass();
		Thread.sleep(2000);
		driver.quit();
	}

	public static void wrongUserRightPass() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		HeroKuApp base = new HeroKuApp(driver);
		base.goToLogin();
		base.wrongUser();
		base.rightPass();
		Thread.sleep(2000);
		driver.close();
				
	}


}
