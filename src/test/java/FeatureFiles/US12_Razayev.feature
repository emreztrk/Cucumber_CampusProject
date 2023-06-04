Feature: Add Grade Levels Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | grandLevels |

  Scenario: Admin User should be able to Add Grade Levels positive test

    And click on the element in Dialog
      | addGradeLevels |

    And user sending the key in Dialog Content
      | nameInput  | 1012AB34 |
      | shortNameInput  | 1012AB34 |
      | orderInput | 12     |

    And click on the element in Dialog
      | nextGradeBtn   |
      | nextGradeInput |
      | saveButton     |

    Then success message should be displayed


  Scenario: Admin User should be able to Add Grade Levels negative test

    And click on the element in Dialog
      | addGradeLevels |

    And user sending the key in Dialog Content
      | nameInput  | 1012AB34 |
      | shortNameInput  | 1012AB34 |
      | orderInput | 12     |

    And click on the element in Dialog
      | nextGradeBtn   |
      | nextGradeInput |
      | saveButton     |

    Then already exists message should be displayed

  Scenario: Admin User should be able to Edit Grade Levels positive test

 When Search name as "1012AB34" and click on the edit button

    And Edit item which  added in scenario
      | nameInput | Manager1012AB |


    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed


  Scenario: Admin User should be able to Delete Grade Levels positive test


    When Search name as "Manager1012AB" and click on the delete button

    Then Click on the delete button
    And success message should be displayed

  Scenario: Admin User should be able to Delete Grade Levels negative test


    Then There is no name as "Manager1012AB" to display should be displayed

  Scenario: Admin User should have an option to activate and deactivate grade levels.

    And click on the element in Dialog
      | slideToggleBtn |

    Then success message should be displayed