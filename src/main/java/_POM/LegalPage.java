package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class LegalPage extends ReusuableCode {
	public LegalPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	By backButton=By.xpath("(//android.view.View)[6]");

	public void backButton() {
		elementToAppear(driver.findElement(backButton));
		driver.findElement(backButton).click();
	}
}
