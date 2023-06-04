Feature: Positions Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    And click on the element in LeftNav
      | humanResources      |
      | setupHumanResources |
      | positionsTab        |

  Scenario: Adding positions

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput      | SeniorJavaDevop |
      | shortNameInput | SenJavaDevo     |


    And click on the element in Dialog
      | saveButton |
    Then success message should be displayed

  Scenario:Adding Positions negative scenario
    And click on the element in Dialog
      | addButton |
    And user sending the key in Dialog Content
      | nameInput      | SeniorJavaDevop |
      | shortNameInput | SenJavaDevo     |
    And click on the element in Dialog
      | saveButton |
    Then already exists message should be displayed

  Scenario: Editing Positions

    And user sending the key in Dialog Content
      | searchInput | SeniorJavaDevop |

    And user click on search button

    And edit item which added in first scenario
      | nameInput      | JuniorJavaDevops |
      | shortNameInput | JJD              |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed


  Scenario: Deleting Positions

    And user sending the key in Dialog Content
      | searchInput | JuniorJavaDevops |

    And user delete item from Dialog Content
      | JuniorJavaDevops |

    Then success message should be displayed

  Scenario: Deleting Positions negative Test
    And user sending the key in Dialog Content
      | searchInput | JuniorJavaDevops |
    And user click on search button

    Then there is no data to display should be displayed