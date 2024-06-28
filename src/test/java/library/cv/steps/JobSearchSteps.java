package library.cv.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.cv.pages.HomePage;
import library.cv.pages.ResultPage;
import org.testng.asserts.SoftAssert;

public class JobSearchSteps {
    @When("I enter job {string}")
    public void iEnterJob(String jobTitle) {
    new HomePage().enterJobTitle(jobTitle);
    }

    @And("I accept cookies")
    public void iAcceptCookies() {
        new ResultPage().accpetCookies();
    }

    @And("I enter location {string}")
    public void iEnterLocation(String location) {
new HomePage().enterlocation(location);
    }

    @And("I select  distance{string}")
    public void iSelectDistance(String distance) {
    new HomePage().selectDistance(distance);
    }


    @And("I click on more search option link")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter min salary{string}")
    public void iEnterMinSalary(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("I enter max salary{string}")
    public void iEnterMaxSalary(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("I select salary type {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select job type {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on find jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }
SoftAssert softAssert = new SoftAssert();

    @Then("I verify result {string}")
    public void iVerifyResult(String result) {
        softAssert.assertEquals (new ResultPage().verifyResult(),result,"not matched");
    }
}
