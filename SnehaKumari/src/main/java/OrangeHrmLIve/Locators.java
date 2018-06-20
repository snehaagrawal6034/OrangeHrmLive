package OrangeHrmLIve;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators {
	@FindBy(id = "txtUsername")
	public WebElement uname;
	
	@FindBy(id = "txtPassword")
	public WebElement password;
	
	@FindBy(id = "btnLogin")
	public WebElement LoginButton;
	
	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	public WebElement recruitTab;
	
	@FindBy(id = "menu_recruitment_viewJobVacancy")
	public WebElement vacancies;
	
	@FindBy(id = "btnAdd")
	public WebElement button;
	
	@FindBy(id = "addJobVacancy_name")
	public WebElement vacancyName;
	
	@FindBy(id = "addJobVacancy_hiringManager")
	public WebElement hiringManager;

	@FindBy(id="menu_recruitment_viewCandidates")
	public WebElement candidate;
	
	@FindBy(id="btnAdd")
	public WebElement addButton;
	
	@FindBy(id="addCandidate_firstName")
	public WebElement fname;
	
	@FindBy(id="addCandidate_lastName")
	public WebElement lname;
	
	@FindBy(id="addCandidate_email")
	public WebElement email;
	
	@FindBy(id="addCandidate_contactNo")
	public WebElement contactNo;

	
	@FindBy(id="addCandidate_vacancy")
	public WebElement addCandidate;
	
	@FindBy(id="addCandidate_resume")
	public WebElement addResume;
	
	@FindBy(id="btnSave")
	public WebElement buttonSave;
	
	@FindBy(linkText="Test Automation Engineer")
	public WebElement deactivateVacancy;
	
	@FindBy(id="addJobVacancy_status")
	public WebElement vacancyInactive;
	
	@FindBy(id="addCandidate_keyWords")
	public WebElement addCandidateKeywords;
	
	@FindBy(id="addCandidate_comment")
	public WebElement addCandidateComment;
	
	@FindBy(id="welcome")
	public WebElement welcome;
	
	@FindBy(xpath = "//a[contains(@href,'addCandidate')]")
	public WebElement candidateProfile;
	
	@FindBy(xpath = "//input[@value='Edit']")
	public WebElement editProfile;
	
	@FindBy(xpath="//*[@id='welcome-menu']/ul/li[2]/a")
	public WebElement logout;
	
	
	

}
