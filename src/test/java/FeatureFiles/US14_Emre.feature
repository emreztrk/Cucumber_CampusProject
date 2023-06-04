Feature: Nationalities Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    And click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

  Scenario: Add Nationality

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | Turkish1071 |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

    Scenario: Add Nationality negative scenario

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | Turkish1071 |

    And click on the element in Dialog
      | saveButton |

    Then already exists message should be displayed

  Scenario: Editing nationality

    And user sending the key in Dialog Content
      | searchInput | Turkish1071 |

    And click on the element in Dialog
      | searchButton |

    And edit item which added in first scenario
      | nameInput | Turkish1453 |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Deleting nationality

    And user sending the key in Dialog Content
      | searchInput | Turkish1453 |

    And user delete item from Dialog Content
      | Turkish1453 |

    Then success message should be displayed

  Scenario: Deleting Nationality negative scenario

    And user sending the key in Dialog Content
      | searchInput | Turkish1453 |

    And click on the element in Dialog
      | searchButton |

    Then there is no data to display should be displayed