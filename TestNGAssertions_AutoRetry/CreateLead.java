package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import week7.day2.CustomListener;

public class CreateLead extends BaseForAll{

	@BeforeClass
	public void setdata() {
		fileName = "CreateLead";
	}

	@Test(dataProvider="fetchdata")
	public void CLead(String CName, String Fname, String Lname, String Dept, String Desc, String Email, String Phone){

		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Create Lead | opentaps CRM11");//verify hard assert -> works fine, as expected - based on pass/fail assert status
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(title, "Create Lead | opentaps CRM"); //verify soft assert -> works as expected
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(Fname);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(Lname);
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys(Dept);
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys(Desc);
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys(Phone);
		WebElement eleState= driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select state = new Select(eleState);
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//soft.assertAll();
	}


}





