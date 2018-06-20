package OrangeHrmLIve;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import OrangeHrmLIve.HomePage;
import OrangeHrmLIve.TestBase;

public class HomePageTest {

	HomePage homePage;
	public static Logger log = Logger.getLogger(HomePageTest.class);
	@BeforeTest
	public void setUp() {
		try {
			//setting up chromedriver and invoking url
			TestBase.setUp();
			homePage = new HomePage();
			//login to application
			homePage.loginToApplication("Admin", "admin");
		} catch (Exception e) {
			log.info("HomePageTest.java setUp() Error while setting up the testing environment -"+
						" Error Message: "+ e.getMessage()); 
		}
	}

	@Test
	public void createAndVerifyCandidateProfile() {
		try {
			homePage.clickRecuritment();
			homePage.createVacanies("Test Automation Engineer", "Robert Craig");
			homePage.addCandidate("Sneha", "Agrawal", "abc@gmail.com", "77777777", "Selenium", "Automation Profile");
			homePage.deactivateVacancy();
					
			Assert.assertTrue( homePage.getVacancyName().contains("Closed"), "Job vacancy is not closed");
			log.info("Getting Text of VacancyName , it should contain (closed)");
			} catch (Exception e) {
			log.info("HomePageTest.java createAndVerifyCandidateProfile() error while creating and verifying profile -"+ 
						" Error Message: "+e.getMessage());
		}
	}

	@AfterTest
	public void logoutApplication() {
		try {
			HomePage homePage = new HomePage();
			homePage.logout();
		} catch (Exception e) {
			log.info("HomePageTest.java logoutApplication() Error while logging out fromt he application -" +
						" Error Message: "+e.getMessage());
		}
	}
}
