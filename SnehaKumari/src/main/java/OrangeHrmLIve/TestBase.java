package OrangeHrmLIve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;

	public static WebDriver setUp() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/executable/chromedriver.exe");
			driver = new ChromeDriver();
			String baseUrl = "http://opensource.demo.orangehrmlive.com/";
			driver.get(baseUrl);
			driver.manage().window().maximize();

		}
		return driver;
	}
	
	public void type(WebElement element,String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement sub) {
		sub.click();
	}
	public static void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}
}