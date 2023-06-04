package StepDefinitions;

import Pages.DialogContent;
import Utilities.WD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NoSearchButton {
    DialogContent dc = new DialogContent();
    WebDriverWait wait = new WebDriverWait(WD.getDriver(), Duration.ofSeconds(5));

    @When("Search name as {string} and click on the edit button")
    public void searchNameAsAndClickOnTheEditButton(String name) {
        {
            dc.waitUntilRefresh();

            String text = "";
            do {
                dc.waitUntilRefresh();

                for (int j = 0; j < dc.registerListName.size(); j++) {

                    if (!dc.registerListName.get(j).getText().contains(name)) {

                        dc.waitUntilRefresh();
                    } else if (dc.registerListName.get(j).getText().contains(name)) {

                        text = dc.registerListName.get(j).getText();
                        dc.clickFunction(dc.editButtonList.get(j));

                    }
                }
                if(!text.contains(name)){
                    dc.clickFunction(dc.nextPage);}

            } while (!text.contains(name));


        }
    }

    @And("Edit item which  added in scenario")
    public void editItemWhichAddedInScenario(DataTable dt) {
        wait.until(ExpectedConditions.visibilityOf(dc.nameInput));

        List<List<String>> keys = dt.asLists(String.class);

        for (int i = 0; i < keys.size(); i++) {
            WebElement element = dc.getWebElement(keys.get(i).get(0));
            dc.sendKeysFunction(element, keys.get(i).get(1));
        }
    }

    @When("Search name as {string} and click on the delete button")
    public void searchNameAsAndClickOnTheDeleteButton(String name) {
        {
            dc.waitUntilRefresh();
            String text = "";
            do {
                dc.waitUntilRefresh();

                for (int j = 0; j < dc.registerListName.size(); j++) {

                    if (!dc.registerListName.get(j).getText().contains(name)) {

                        dc.waitUntilRefresh();
                    } else if (dc.registerListName.get(j).getText().contains(name)) {

                        text = name;
                        dc.clickFunction(dc.deleteButtonList.get(j));

                    }
                }
                if(!text.contains(name)){
                    dc.clickFunction(dc.nextPage);}
            } while (!text.contains(name));

        }
    }

    @Then("Click on the delete button")
    public void clickOnTheDeleteButton() {
        dc.clickFunction(dc.deleteDialogBtn);
    }

    @Then("There is no name as {string} to display should be displayed")
    public void thereIsNoNameAsToDisplayShouldBeDisplayed(String name) {
        dc.waitUntilRefresh();
        List<String> Names=new ArrayList<>();
        String text = "empty";

        do {
            dc.waitUntilRefresh();

            for (int j = 0; j < dc.registerListName.size(); j++) {
                Names.add(dc.registerListName.get(j).getText());
                if (dc.registerListName.get(j).getText().contains(name)) {

                    text = dc.registerListName.get(j).getText();

                    System.out.println("name not deleted = "+text);break;

                }
            }if(!text.contains(name)){
                dc.clickFunction(dc.nextPage);
            }

        } while ((!dc.NextButton.getAttribute("class").contains("disabled")) && !text.contains(name));//(!dc.NextButton.getAttribute("class").contains("disabled"))//!text.contains(name)
        for (int i = 0; i <dc.registerListName.size() ; i++) {
            Names.add(dc.registerListName.get(i).getText());
        }

        for (String a : Names){
            Assert.assertFalse(a.contains(name));
        }

    }
}
