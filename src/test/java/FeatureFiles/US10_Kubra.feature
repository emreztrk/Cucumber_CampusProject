Feature: School Department Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And click on the element in LeftNav
      |setup       |
      |schoolSetup |
      |Departments |
  Scenario: Admin User should be able to Add School Departments Positive Test



    And click on the element in Dialog
      |addButton |

    And user sending the key in Dialog Content
      |nameInput | Law |
      |codeInput | 1434 |

    And click on the element in Dialog
      |saveButton |

    Then success message should be displayed

  Scenario: Admin User should be able to Add School Departments Negative Test


    And click on the element in Dialog
      |addButton |

    And user sending the key in Dialog Content
      |nameInput | Law |
      |codeInput | 1434 |

    And click on the element in Dialog
      |saveButton |

    Then already exists message should be displayed

  Scenario: Admin User should be able to Edit School Departments
    And Search name as "Law" and click on the edit button
    And Edit item which  added in scenario
      | nameInput | Justice |
    And click on the element in Dialog
      |saveButton|
    And success message should be displayed

  Scenario: Admin User should be able to Delete School Departments Positive Test
    When Search name as "Justice" and click on the delete button
    Then Click on the delete button
    And success message should be displayed


  Scenario: Admin User should be able to Delete School Departments Negative Test
    Then There is no name as "Justice" to display should be displayed