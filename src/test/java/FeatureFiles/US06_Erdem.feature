Feature: Subject Category Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And click on the element in LeftNav
      | educationTab      |
      | setupEdu          |
      | subjectCategories |

  Scenario: Adding Subject Category
    And click on the element in Dialog
      | addButton |
    And user sending the key in Dialog Content
      | nameInput | CucumberBDD_Batch5TR |
      | codeInput | 17769                |
    And click on the element in Dialog
      | saveButton |
    Then success message should be displayed

  Scenario: Adding Subject Category Negative
    And click on the element in Dialog
      | addButton |
    And user sending the key in Dialog Content
      | nameInput | CucumberBDD_Batch5TR |
      | codeInput | 17769                |
    And click on the element in Dialog
      | saveButton |
    Then already exists message should be displayed


  Scenario: Editing Subject Category
    And user sending the key in Dialog Content
      | searchInput | CucumberBDD_Batch5TR |
    And user click on search button
    And edit item which added in first scenario
      | nameInput | CucumberBDD_Batch5UK |
    And click on the element in Dialog
      | saveButton |
    Then success message should be displayed

  Scenario: Deleting Subject Category
    And user delete item from Dialog Content
      | CucumberBDD_Batch5UK |
    Then success message should be displayed

  Scenario: Deleting Subject Category Negative
    And user sending the key in Dialog Content
      | searchInput | CucumberBDD_Batch5UK |
    And user click on search button
    Then there is no data to display should be displayed



