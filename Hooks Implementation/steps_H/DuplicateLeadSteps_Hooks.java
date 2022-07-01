package steps_H;

import org.openqa.selenium.By;

import hooks.BaseClass_Hooks;
import io.cucumber.java.en.When;

public class DuplicateLeadSteps_Hooks extends BaseClass_Hooks {

	@When("Findby the Email")
	public void findByEmail() {
		driver.findElement(By.xpath("//span[text()='Email']")).click();
	}
	
	@When("Enter the Email {string}")
	public void Email(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}
}
