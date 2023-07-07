package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdf {
	WebDriver driver = Hooks.driver;

	@When("Click on view Products")
	public void click_on_view_Products() {

		WebElement viewProducts = driver.findElement(By.xpath("//a[@href='/medicare/show/all/products']"));
		viewProducts.click();

		System.out.println("View product Passed");
	}

	@When("Validate Landed on view Products page")
	public void validate_Landed_on_view_Products_page() {
	}

	@When("Click on Cart icon to add one item to cart and enter the quantity")
	public void click_on_Cart_icon_to_add_one_item_to_cart_and_enter_the_quantity() throws InterruptedException {

		WebElement carticon = driver.findElement(By.xpath("//a[@href='/medicare/cart/add/1/product']"));
		carticon.click();
		Thread.sleep(3000);
	}

	@When("user landed on checkout page")
	public void user_landed_on_checkout_page() {

		WebElement page = driver.findElement(By.xpath("//div[@class='col-sm-10']"));

		System.out.println("Product List is " + page.getText());

	}

	@When("click on checkout")
	public void click_on_checkout() throws InterruptedException {
		WebElement checkout = driver.findElement(By.xpath("//a[@href='/medicare/cart/validate']"));
		checkout.click();
		Thread.sleep(3000);

	}

	@Then("Validate User landed on Shipping address page.")
	public void validate_User_landed_on_Shipping_address_page() {
	}

	@When("User click select option")
	public void user_click_select_option() throws InterruptedException {
		WebElement select = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		select.click();
		Thread.sleep(3000);

	}

	@Then("Validate landed on Total summary page")
	public void validate_landed_on_Total_summary_page() {

	}

	@When("Give credit card details")
	public void give_credit_card_details() throws InterruptedException {
		WebElement credit = driver.findElement(By.xpath("//input[@id='cardNumber']"));
		credit.sendKeys("PJ56896L");
		Thread.sleep(3000);

		WebElement Month = driver.findElement(By.xpath("//input[@id='expityMonth']"));
		Month.sendKeys("06");
		Thread.sleep(3000);

		WebElement CV = driver.findElement(By.xpath("//input[@id='expityMonth']"));
		CV.sendKeys("//input[@id='cvCode'");
		Thread.sleep(3000);
	}

	@When("Click on Final payment")
	public void click_on_Final_payment() throws InterruptedException {
		WebElement Pay = driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg btn-block']"));
		Pay.click();
		Thread.sleep(3000);

	}

	@Then("Validated Order confirmed page")
	public void validated_Order_confirmed_page() {

	}

}
