package library.cv.pages;

import library.cv.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = Logger.getLogger(HomePage.class.getName());
    /*
        Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
      Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
      enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
      clickOnFindJobsButton().
         */
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;


    public void enterJobTitle(String jobTitle) {
        clickOnElement(this.jobTitle);
        sendTextToElement(this.jobTitle, jobTitle);
        log.info("Enter job title" + jobTitle.toString());
    }

    public void enterlocation(String location) {
        clickOnElement(this.location);
        sendTextToElement(this.location, location);
        log.info("Enter location" + location.toString());
    }

    public void selectDistance(String distance) {
        clickOnElement(distanceDropDown);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        log.info("Enter location" + distanceDropDown.toString());
    }

    public void clickOnMoreSearchOptionLink() {
        mouseHoverToElementAndClick(moreSearchOptionsLink);
        log.info("click on more option " + moreSearchOptionsLink.toString());

    }

    public void enterMinSalary(String minSalary) {
        clickOnElement(salaryMin);
        sendTextToElement(salaryMin, minSalary);

        log.info("Salary minimum" + salaryMin.toString());
    }

    public void enterMaxSalary(String maxSalary) {
        clickOnElement(salaryMax);
        sendTextToElement(salaryMax, maxSalary);

        log.info("salary max " + salaryMax.toString());
    }


    public void selectSalaryType(String sType) {
        clickOnElement(salaryTypeDropDown);
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);

        log.info("salary type dropdown " + salaryTypeDropDown.toString());
    }

    public void selectJobType(String jobType) {
        clickOnElement(jobTypeDropDown);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);

        log.info("select job type dropdown" + jobTypeDropDown.toString());
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);

        log.info("click on find job " + findJobsBtn.toString());
    }


}