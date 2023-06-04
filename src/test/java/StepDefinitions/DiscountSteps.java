package StepDefinitions;

import Pages.DialogContent;
import Utilities.WD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DiscountSteps {

    DialogContent dc = new DialogContent();
    WebDriverWait wait =new WebDriverWait(WD.getDriver(), Duration.ofSeconds(5));

    @And("user removing zero from priority box")
    public void userRemovingZeroFromPriorityBox() {
        dc.priority.clear();
    }

    @And("edit description name")
    public void editDescriptionName(DataTable dt) {

        dc.waitUntilRefresh();
        dc.clickFunction(dc.editButton);
        wait.until(ExpectedConditions.visibilityOf(dc.dscrptnInputBox));
        dc.dscrptnInputBox.clear();
        dc.integrationCode.clear();
        dc.priority.clear();

        List<List<String>> keys = dt.asLists(String.class);

        for (int i = 0; i < keys.size(); i++) {
            WebElement element = dc.getWebElement(keys.get(i).get(0));
            dc.sendKeysFunction(element,keys.get(i).get(1));
        }
    }

    @And("user delete discounted account")
    public void userDeleteDiscountedAccount(DataTable dt) {
        List<String> dialogButtons = dt.asList(String.class);

        for (String button :dialogButtons) {
            dc.deleteDiscountedItem(button);
        }

    }
}
