package automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import pageObjects.HeroKuAppPageObject;

public class HeroKuApp {
	private WebDriver driver;
	
	public HeroKuApp(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goToLogin() {
		driver.get("http://the-internet.herokuapp.com/login");
	}
	
	public void wrongPass() {
		HeroKuAppPageObject element = new HeroKuAppPageObject(driver);
		element.getPassInput().sendKeys("SoloSecretPassword!");
		element.getPassInput().sendKeys(Keys.ENTER);
	}
	
	public void wrongUser() {
		HeroKuAppPageObject element = new HeroKuAppPageObject(driver);
		element.getUserInput().sendKeys("justtom");
	}
	
	public void rightPass() {
		HeroKuAppPageObject element = new HeroKuAppPageObject(driver);
		element.getPassInput().sendKeys("SuperSecretPassword!");
		element.getPassInput().sendKeys(Keys.ENTER);
	}
	
	

}
