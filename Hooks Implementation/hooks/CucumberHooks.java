package hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberHooks extends BaseClass_Hooks{
	//public static ChromeDriver driver;
	
	@Before
	public void precondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	}
	
	@After
	public void postcondition() {
		driver.close();
	}
	

}
