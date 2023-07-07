package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterStepdf {

	WebDriver driver = Hooks.driver;

	@Given("User launch the application")
	public void user_launch_the_application() {

		driver.get("http://localhost:8080/medicare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@Given("User click on Login link")
	public void user_click_on_Login_link() throws InterruptedException {
		WebElement Login = driver.findElement(By.xpath("//a[@href='/medicare/login']"));
		Login.click();
		Thread.sleep(3000);
	}

	@Then("User click on Register here")
	public void user_click_on_Register_here() throws InterruptedException {

		WebElement Register = driver.findElement(By.xpath("//a[@href='/medicare/membership']"));
		Register.click();
		Thread.sleep(2000);
	}

	@Then("User fill personal details")
	public void user_fill_personal_details() throws InterruptedException {
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		FirstName.sendKeys("Fname");
		Thread.sleep(2000);

		WebElement LastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		LastName.sendKeys("Lname");
		Thread.sleep(2000);

		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("Mana@gmail.com");
		Thread.sleep(2000);

		WebElement ContactNumber = driver.findElement(By.xpath("//input[@id='contactNumber']"));
		ContactNumber.sendKeys("1234567890");

		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("admin");
		Thread.sleep(2000);

		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		ConfirmPassword.sendKeys("admin");
		Thread.sleep(2000);

		// select User option

		WebElement Select = driver.findElement(By.xpath("//label[@class='radio-inline']/input[@id='role1']"));
		Select.click();
		Thread.sleep(2000);

		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);

		WebElement Address1 = driver.findElement(By.xpath("//input[@id='addressLineOne']"));
		Address1.sendKeys("ABC Chowk");
		Thread.sleep(2000);

		WebElement Address2 = driver.findElement(By.xpath("//input[@id='addressLineTwo']"));
		Address2.sendKeys("Bankar colony");
		Thread.sleep(2000);

		WebElement City = driver.findElement(By.xpath("//input[@id='city']"));
		City.sendKeys("Pune");
		Thread.sleep(2000);

		WebElement PostalCode = driver.findElement(By.xpath("//input[@id='postalCode']"));
		PostalCode.sendKeys("411202");
		Thread.sleep(2000);

		WebElement State = driver.findElement(By.xpath("//input[@id='state']"));
		State.sendKeys("Maharashtra");
		Thread.sleep(2000);

		WebElement Country = driver.findElement(By.xpath("//input[@id='country']"));
		Country.sendKeys("India");
		Thread.sleep(2000);

		WebElement nextconfm = driver.findElement(By.xpath("//button[@name='_eventId_confirm']"));
		nextconfm.click();
		Thread.sleep(2000);

		WebElement lastconfm = driver
				.findElement(By.xpath("//a[@href='/medicare/membership?execution=e1s3&_eventId_submit']"));
		lastconfm.click();
		Thread.sleep(2000);

		System.out.println("Register successful");

	}

	@Then("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		WebElement loginhere = driver.findElement(By.xpath("//a[@class='btn btn-lg btn-success']"));
		loginhere.click();
		Thread.sleep(2000);

		System.out.println("Login");

	}

	@Then("User enter Email as {string} and Password as {string}")
	public void user_enter_Email_as_and_Password_as(String Email, String Password) throws InterruptedException {

		WebElement q = driver.findElement(By.xpath("//input[@id='username']"));
		q.sendKeys(Email);
		Thread.sleep(2000);

		WebElement p = driver.findElement(By.xpath("//input[@type='password']"));
		p.sendKeys(Password);
		Thread.sleep(2000);

	}

	@Then("click on login")
	public void click_on_login() throws InterruptedException {

		WebElement login = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		login.click();
		Thread.sleep(2000);

		System.out.println("Login Successfull");

	}

}
