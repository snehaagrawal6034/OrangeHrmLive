package OrangeHrmLIve;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends TestBase {

	public Locators loc;
	public static Logger log = Logger.getLogger(HomePage.class);

	public HomePage() {

		this.loc = new Locators();
		PageFactory.initElements(driver, this.loc);
		PropertyConfigurator
				.configure(System.getProperty("user.dir") + "\\src\\test\\resources\\logs\\log4j.properties");

	}

	public void loginToApplication(String username, String password) {
		type(loc.uname, username);
		log.info("Entering username" + ":" + username);
		type(loc.password, password);
		log.info("Entering password" + ":" + password);
		click(loc.LoginButton);
		log.info("Clicking login button");

	}

	public void clickRecuritment() {
		click(loc.recruitTab);
		log.info("Clicking on recruitment tab");
	}

	public void createVacanies(String vacName, String hiringManager) {
		click(loc.vacancies);
		log.info("Clicking on vacancies tab");
		click(loc.button);
		log.info("Clicking on add button");
		Select sel = new Select(driver.findElement(By.id("addJobVacancy_jobTitle")));
		sel.selectByVisibleText("IT Executive");
		type(loc.vacancyName, vacName);
		log.info("entering vacancy" + ":" + vacName);
		
		// TODO: Due to db getting refreshed hiringManager value gets invalid,
		// so need to update it accordingly
		
		type(loc.hiringManager, hiringManager);
		log.info("entering vacancy" + ":" + hiringManager);
		click(loc.buttonSave);
		log.info("Clicking on add button");
	}

	public void addCandidate(String fname, String lname, String email, String phoneNo, String keywords,
			String comment) {
		click(loc.candidate);
		log.info("Clicking on candidate button");
		click(loc.addButton);
		log.info("Clicking on add button");
		type(loc.fname, fname);
		log.info("entering firstname" + ":" + fname);
		type(loc.lname, lname);
		log.info("entering lastname" + ":" + lname);
		type(loc.email, email);
		log.info("entering email" + ":" + email);
		type(loc.contactNo, phoneNo);
		log.info("entering phoneNo" + ":" + phoneNo);
		Select addCandidate = new Select(loc.addCandidate);
		addCandidate.selectByVisibleText("Test Automation Engineer");
		type(loc.addResume, System.getProperty("user.dir") + "\\src\\main\\java\\Info (6).txt");
		log.info("uploading resume");
		type(loc.addCandidateKeywords, keywords);
		log.info("entering keywords" + ":" + keywords);
		type(loc.addCandidateComment, comment);
		log.info("entering comment" + ":" + comment);
		click(loc.buttonSave);
		log.info("Clicking on save button");

	}

	// deactivating created vacancy
	public void deactivateVacancy() {
		click(loc.vacancies);
		log.info("Clicking on vacancies button");
		click(loc.deactivateVacancy);
		log.info("Clicking on link to deactivate");
		click(loc.buttonSave);
		log.info("Clicking on save button");
		click(loc.vacancyInactive);
		log.info("Clicking on checkbox to make it inactive");
		click(loc.buttonSave);
		log.info("Clicking on save button");
	}


	public String getVacancyName() {
		click(loc.candidate);
		log.info("Clicking on candidate button");
		click(loc.candidateProfile);
		log.info("Clicking on candidateProfile button");
		click(loc.editProfile);
		log.info("Clicking on candidateProfile button");
		Select addCandidate = new Select(loc.addCandidate);
		List<WebElement> getOptions = addCandidate.getOptions();
		log.info("Getting Text of VacancyName , it should contain (closed)");
		System.out.println(getOptions.get(1).getText());
		return getOptions.get(1).getText();

	}

	public void logout() {
		click(loc.welcome);
		log.info("Clicking on welcome button");

		click(loc.logout);
		log.info("Clicking on logout button");

	}
}
