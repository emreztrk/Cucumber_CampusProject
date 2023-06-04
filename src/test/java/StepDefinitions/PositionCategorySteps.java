package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.WD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class PositionCategorySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dt) {
        List<String> leftButtons=dt.asList(String.class);

        for (String button : leftButtons){
            WebElement element=ln.getWebElement(button);
            ln.clickFunction(element);
        }
    }

    @And("click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {
        List<String> dialogButtons=dt.asList(String.class);

        for (String button : dialogButtons){
            WebElement element=dc.getWebElement(button);
            dc.clickFunction(element);
        }
    }

    @And("user sending the key in Dialog Content")
    public void userSendingTheKeyInDialogContent(DataTable dt) {
        List<List<String>> keys=dt.asLists(String.class);

        for (int i = 0; i < keys.size(); i++) {
            WebElement element=dc.getWebElement(keys.get(i).get(0));
            dc.sendKeysFunction(element, keys.get(i).get(1));
        }
    }
    @And("click esc button")
    public void clickEscButton() {
        new Actions(WD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }
    @And("user delete item from Document Types")
    public void userDeleteFromDocumentTypes(DataTable dt) {
        List<List<String>> items=dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.deleteItemDocument(items.get(i));
        }
        dc.clickFunction(dc.deleteImageBtn);
        dc.clickFunction(dc.deleteDialogBtn);
    }
    @And("user delete item from Document Types Negative")
    public void userDeleteFromDocumentTypesNegative(DataTable dt) {
        List<List<String>> items=dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.deleteItemDocument(items.get(i));
        }
    }

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage, "successfully");
    }

    @And("edit item from Dialog Content")
    public void editItemFromDialogContent() {
        dc.nameInput.clear();
    }

    @And("user delete item from Dialog Content")
    public void userDeleteItemFromDialogContent(DataTable dt) {
        List<String > dialogButtons=dt.asList(String.class);

        for (String deleteButton : dialogButtons){
            dc.deleteItem(deleteButton);
        }
    }

    @And("user delete item from Grade levels")
    public void userDeleteItemFromGradeLevels(DataTable dt) {
        List<String> dialogButtons = dt.asList(String.class);

        for (String deleteButton : dialogButtons) {
            WebElement element = dc.getWebElement(deleteButton);

            dc.clickFunction(element);
        }
    }

    @Then("negative test message should be displayed")
    public void notDeleteMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.notDeleteMessage, "not");
    }
}

