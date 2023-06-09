package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class HomePage extends ReusuableCode {
	public String successfulMsg;

	public HomePage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By ScanVehicle = By.xpath("//android.widget.Button[@content-desc='Scan Vehicle']");
	private By close = By.xpath("//android.view.View[@content-desc='Close']");
	private By plusButton = By.xpath("//android.widget.Button[@index=3]");
	private By enterpriseDelivery = By.xpath("//android.widget.ImageView[@content-desc=\"Enterprise Delivery\"]");
	private By Ekart = By.xpath("//android.view.View[@content-desc=\"Ekart 1\"]");
	private By SelectCustomer = By.xpath("//android.view.View[@content-desc=\"Select Customer\"]");
	private By StartDelivery = By.xpath("//android.view.View[@content-desc=\"Start Delivery\"]");
	private By EndDelivery = By.xpath("//android.view.View[@content-desc=\"End Delivery\"]");
	private By Yes = By.xpath("//android.view.View[@content-desc=\"Yes\"]");
	private By CustomerDetails = By.xpath("//android.widget.EditText[@text='0, Number of Services']");
	private By EkartName = By.xpath("//android.view.View[@content-desc=\"Ekart 1\"]");
	private By Submit = By.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
	private By successMsg = By
			.xpath("//android.view.View[@content-desc=\"Great job, your ride is finished.\r\n" + "Ok\"]");

	public void scanVechile() {
		elementToAppear(driver.findElement(ScanVehicle));
		driver.findElement(ScanVehicle).click();

		// close button
		closeButton();
	}

	public void closeButton() {
		elementToAppear(driver.findElement(close));
		driver.findElement(close).click();
	}

	public void deliveryService() {
		elementToAppear(driver.findElement(plusButton));
		driver.findElement(plusButton).click();
		elementToAppear(driver.findElement(enterpriseDelivery));
		driver.findElement(enterpriseDelivery).click();
	}

	public void eKart() {
		deliveryService();
		elementToAppear(driver.findElement(Ekart));
		driver.findElement(Ekart).click();
	}

	public void selectCustomer() {
		eKart();
		elementToAppear(driver.findElement(SelectCustomer));
		driver.findElement(SelectCustomer).click();
	}

	public void startDelivery() throws InterruptedException {
		selectCustomer();
		elementToAppear(driver.findElement(StartDelivery));
		driver.findElement(StartDelivery).click();
		Thread.sleep(10000);
		driver.findElement(EndDelivery).click();
		elementToAppear(driver.findElement(Yes));
		driver.findElement(Yes).click();
		elementToAppear(driver.findElement(CustomerDetails));
		driver.findElement(CustomerDetails).click();
		driver.findElement(CustomerDetails).sendKeys("3");
		elementToAppear(driver.findElement(EkartName));
		driver.findElement(EkartName).click();
	}

	public void completeDelivery() throws InterruptedException {
		elementToAppear(driver.findElement(Submit));
		driver.findElement(Submit).click();
		Thread.sleep(3000);
	}

	public void startServicePlus_Button()
	{
	elementToAppear(driver.findElement(plusButton));
	driver.findElement(plusButton).click();
	}

}
