Feature: School Functionality
  Background:Before Scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    Given click on the element in LeftNav
      |setup|
      |schoolSetup|
      |schoolLocations|

    Scenario: School Locations Add
      When click on the element in Dialog
        | addButton |
      Then user sending the key in Dialog Content
        |nameInput|Test12234|
        |shortNameInput|T114|
        |capacityInput|20|

      And click on the element in Dialog
        |locationType|
        |laboratory  |
        |activeButton|
        | saveButton |
      And success message should be displayed

  Scenario: School Locations Negative Add
    When click on the element in Dialog
      | addButton |
    Then user sending the key in Dialog Content
      |nameInput|Test12234|
      |shortNameInput|T114|
      |capacityInput|20|

    And click on the element in Dialog
      |locationType|
      |laboratory  |
      |activeButton|
      | saveButton |
    Then already exists message should be displayed

  Scenario: School Locations Edit
    When Search name as "Test12234" and click on the edit button
    And Edit item which  added in scenario
      | nameInput | Manager231 |
    And click on the element in Dialog
      |saveButton|
    And success message should be displayed

  Scenario: School Locations Delete
    When Search name as "Manager231" and click on the delete button
    Then Click on the delete button
    And success message should be displayed

  Scenario: School Locations Delete Negative Test
    Then There is no name as "Manager231" to display should be displayed