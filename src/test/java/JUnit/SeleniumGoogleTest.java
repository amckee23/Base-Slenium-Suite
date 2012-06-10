package JUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SeleniumGoogleTest extends SeleniumBase{

	@Before
	public void setUp() {
		// Create a new instance of the html unit driver
		driver = new HtmlUnitDriver();
	}

	@Test
	public void shouldBeAbleToNavigateToSeleniumHqFromGoogle() 
	{
		//Navigate to desired web page
		driver.get("http://www.google.com");
		
		// verify title of index page
		verifyTitle("Google");
	}
}