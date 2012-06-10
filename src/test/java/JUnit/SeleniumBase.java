package JUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SeleniumBase {
	
	protected WebDriver driver;

	public void verifyTitle(String expectedTitle) {
		//get the title of the page
		String actualTitle = driver.getTitle();

		// verify title
		Assert.assertTrue(expectedTitle.equals(actualTitle));
	}

	public void enterText(String elementName, String text) {
		// find the input text box
		WebElement element = driver.findElement(By.name(elementName));

		// set the user name in input text box
		element.sendKeys(text);
	}
}
