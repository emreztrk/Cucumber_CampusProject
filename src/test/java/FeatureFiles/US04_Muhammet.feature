Feature: School Field Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    And click on the element in LeftNav
      | setup        |
      | parameters   |
      | fields |


  Scenario: Add School Field

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | user1 |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Adding Fields negative scenario

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | user1 |

    And click on the element in Dialog
      | saveButton |

    Then already exists message should be displayed


  Scenario: Edit School Field

    And user sending the key in Dialog Content
      | searchInput | user1 |

    And user click on search button

    And edit item which added in first scenario
      | nameInput | user2 |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Delete School Field

    And user sending the key in Dialog Content
      | searchInput | user2 |

    And user delete item from Dialog Content
      | user2 |

    Then success message should be displayed

  Scenario: Deleting Fields negative scenario

    And user sending the key in Dialog Content
      | searchInput | user2 |

    And user click on search button

    Then there is no data to display should be displayed

