package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeroKuAppPageObject {
private WebDriver driver;
	
	public HeroKuAppPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUserInput() {
		WebElement user = driver.findElement(By.id("username"));
		return user;
	}
	
	public WebElement getPassInput() {
		WebElement pass = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/div/input"));
		return pass;
	}
	

	public WebElement getLoginButton() {
		WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i"));
		return button;
	}
	
	

}
