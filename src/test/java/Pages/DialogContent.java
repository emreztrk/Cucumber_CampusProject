package Pages;

import Utilities.WD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(WD.getDriver(),this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button/button)[1]")
    public WebElement deleteImageBtn;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//ms-edit-button//span[@class='mat-button-wrapper']")
    public WebElement editButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortNameInput;

    @FindBy(xpath="//div[contains(text(),'exists')]")
    public WebElement alreadyExists;

    @FindBy(xpath = "//div[contains(text(),'no data to display')]")
    public WebElement noDataToDisplay;

    @FindBy(xpath = "//div[contains(text(),'not')]")
    public WebElement notDeleteMessage;


    @FindBy(xpath = "//ms-add-button[@tooltip='GRADE_LEVELS.TITLE.ADD']")
    public WebElement addGradeLevels;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']/input")
    public WebElement orderInput;

    @FindBy(xpath = "//span[text()='Next Grade']")
    public WebElement nextGradeBtn;

    @FindBy(xpath = "//mat-option[2]")
    public WebElement nextGradeInput;

    @FindBy(xpath = "(//tbody//ms-edit-button)[1]")
    public WebElement editGradeInput;

    @FindBy(xpath = "(//td/mat-slide-toggle)[1]")
    public WebElement slideToggleBtn;

    @FindBy(xpath = "//div[@class='mat-paginator-outer-container']//mat-select")
    public WebElement sizeBtn;

    @FindBy(xpath = "//div[@role='listbox']/mat-option[8]")
    public WebElement selectSize;

    @FindBy(xpath = "(//tbody/tr/td[text()='11th'])//following::ms-delete-button[1]")
    public WebElement deleteGradeLevelNeg;

    @FindBy(xpath = "(//tbody/tr/td[text()='1012AB'])//following::ms-delete-button[1]")
    public WebElement deleteGradeLevelPos;

    @FindBy(xpath = "//button[@aria-label='Next Page']")
    public WebElement nextPageBtn;

    @FindBy(xpath = "//div[text()=' Name ']")
    public WebElement nameHeadBtn;

    @FindBy(xpath = "(//input[@data-placeholder='Description'])[2]")
    public WebElement dscrptnInputBox;
    @FindBy(xpath = "(//input[@data-placeholder='Description'])[1]")
    public WebElement dscrptnInput;

    @FindBy(xpath = "(//input[@data-placeholder='Integration Code'])[2]")
    public WebElement integrationCode;

    @FindBy(xpath = "//input[@data-placeholder='Priority']")
    public WebElement priority;

    @FindBy(xpath = "(((//mat-form-field)//following-sibling::mat-slide-toggle)/label/span)[1]")
    public WebElement slideToggleBtnGeneral;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='iban']/input")
    private WebElement iban;

    @FindBy(xpath = "(//mat-select[@role='combobox']//span[text()='Currency'])[2]")
    private WebElement currency;

    @FindBy(xpath = "//span[text()=' USD ']")
    private WebElement usd;
    @FindBy (xpath = "//ms-integer-field[@formcontrolname='capacity']/input")
    private WebElement capacityInput;
    @FindBy(xpath = "(//mat-form-field[contains(@class,'mat-form-field')]//div[contains(@class,'mat-select-value')])[2]")
    public WebElement locationType;
    @FindBy(xpath = "//mat-option/span[text()=' Laboratory ']")
    public WebElement laboratory;
    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//span[@class='mat-slide-toggle-bar']")
    public WebElement activeButton;
    @FindBy(xpath = "//td[@role='cell'][2]")
    public List<WebElement> registerListName;
    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")
    public List<WebElement> editButtonList;
    @FindBy(xpath = "(//mat-paginator[contains(@class,'mat-paginator')]//span[@class='mat-button-wrapper'])[3]")
    public WebElement nextPage;
    @FindBy(xpath = "//ms-delete-button/button")
    public List<WebElement> deleteButtonList;

    @FindBy(xpath = "//mat-paginator[contains(@class,'mat-paginator')]//button[3]")
    public WebElement NextButton;

    @FindBy(xpath="//div[contains(text(),'already')]")
    public WebElement already;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//td[text()='math']")
    public WebElement math;

    @FindBy(css = "div[id*='mat-select-value']")
    public WebElement state;
    @FindBy(xpath = "(//div[contains(@id, 'mat-select-value')])[3]")
    public WebElement addState;
    @FindBy(xpath = "//span[text()=' Student Registration ']")
    public WebElement stateStudentRegistration;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement nameInput2;

    public void deleteItem(String searchText){

        sendKeysFunction(searchInput,searchText);
        clickFunction(searchButton);


        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));

        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);


    }

    public void deleteDiscountedItem(String searchText){

        sendKeysFunction(dscrptnInput,searchText);
        clickFunction(searchButton);


        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));

        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);


    }
    public void deleteItemDocument(List<String> deleteItems){

        sendKeysFunction(searchInput,deleteItems.get(0));
        clickFunction(state);
        clickFunction(getWebElement(deleteItems.get(1)));
        clickFunction(searchButton);


        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));

        //clickFunction(deleteImageBtn);
        //clickFunction(deleteDialogBtn);


    }


    public WebElement getWebElement(String Button) {

        switch (Button) {
            case "addButton" : return addButton;
            case "nameInput" : return nameInput;
            case "saveButton": return saveButton;
            case "editButton": return editButton;
            case "searchInput": return searchInput;
            case "shortNameInput":return shortNameInput;
            case "searchButton": return searchButton;
            case "addGradeLevels": return addGradeLevels;
            case "orderInput": return orderInput;
            case "nextGradeBtn": return nextGradeBtn;
            case "nextGradeInput": return nextGradeInput;
            case "editGradeInput": return editGradeInput;
            case "deleteImageBtn": return deleteImageBtn;
            case "deleteDialogBtn": return deleteDialogBtn;
            case "slideToggleBtn": return slideToggleBtn;
            case "sizeBtn": return sizeBtn;
            case "selectSize": return selectSize;
            case "deleteGradeLevelNeg": return deleteGradeLevelNeg;
            case "deleteGradeLevelPos": return deleteGradeLevelPos;
            case "nextPageBtn": return nextPageBtn;
            case "nameHeadBtn": return nameHeadBtn;
            case "dscrptnInputBox": return dscrptnInputBox;
            case "dscrptnInput": return dscrptnInput;
            case "integrationCode": return integrationCode;
            case "priority": return priority;
            case "slideToggleBtnGeneral": return slideToggleBtnGeneral;
            case "iban": return iban;
            case "currency": return currency;
            case "usd": return usd;
            case "capacityInput" : return capacityInput;
            case "locationType" : return locationType;
            case "laboratory":return laboratory;
            case "activeButton":return activeButton;
            case "codeInput": return codeInput;
            case "math": return math;

            case "state": return state;
            case "addState": return addState;
            case "stateStudentRegistration": return stateStudentRegistration;
            case "nameInput2": return nameInput2;



            default: return null;
        }

    }

    public void waitUntilRefresh(){

        wait.until(ExpectedConditions.numberOfElementsToBe
                (By.xpath("//fuse-progress-bar/*") , 0));

    }


    public void clickOnSearchButton(){

        searchButton.click();
    }

    public void FoundElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            System.out.println("Bug: Element not found ");
        }
    }

}
