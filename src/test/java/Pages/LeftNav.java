package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {


    public LeftNav() {
        PageFactory.initElements(WD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupHumanResources;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement attestations;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positionsTab;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setup;


    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    private WebElement parameters;


    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    private WebElement fields;


    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement grandLevels;

    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    private WebElement discounts;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    private WebElement bankaccount;
    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;
    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    private WebElement schoolLocations;

    @FindBy(xpath = "(//span[text()='Departments'])[1]")
    private WebElement Departments;

    @FindBy(xpath = "//*[text()='Education']")
    private WebElement educationTab;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setupEdu;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;
    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypes;



    public WebElement getWebElement(String Button) {

        switch (Button) {
            case "setup": return setup;
            case "parameters": return parameters;
            case "fields": return fields;
            case "humanResources": return humanResources;
            case "setupHumanResources": return setupHumanResources;
            case "positionCategories": return positionCategories;
            case "attestations": return attestations;
            case "positionsTab": return positionsTab;
            case "nationalities": return nationalities;
            case "grandLevels": return grandLevels;
            case "discounts": return discounts;
            case "bankaccount": return bankaccount;
            case "schoolSetup" : return schoolSetup;
            case "schoolLocations" : return schoolLocations;
            case "Departments" : return Departments;
            case "educationTab" : return educationTab;
            case "setupEdu" : return setupEdu;
            case "subjectCategories" : return subjectCategories;
            case "documentTypes": return documentTypes;



            default: return null;
        }

    }

}