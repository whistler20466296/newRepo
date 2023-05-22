package Bindings;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver driver;

	public static String URL = "https://www.nykaa.com/";

	@Before

	public void Start()

	{
//
//	 WebDriverManager.chromedriver().setup();
//
//	 driver = new ChromeDriver();
//
//	 driver.get(URL);

	}

	@After

	public void End()

	{

		// driver.quit();

	}

}
