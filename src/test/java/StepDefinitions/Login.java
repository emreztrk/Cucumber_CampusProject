package StepDefinitions;

import Pages.DialogContent;
import Utilities.WD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    DialogContent dc = new DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        WD.getDriver().get("https://test.mersys.io/");
        WD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        Hooks hk=new Hooks();

        dc.sendKeysFunction(dc.username, hk.getData().get(0));
        dc.sendKeysFunction(dc.password, hk.getData().get(1));
        dc.clickFunction(dc.loginButton);
    }

    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {
        dc.verifyContainsTextFunction(dc.txtTechnoStudy, "Techno Study");
    }
}
