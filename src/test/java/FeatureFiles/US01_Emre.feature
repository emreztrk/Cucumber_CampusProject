Feature: Position Category Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    And click on the element in LeftNav
      | humanResources      |
      | setupHumanResources |
      | positionCategories  |

  Scenario: Add Position Category

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | Head Officer |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Add Position Category negative scenario

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | Head Officer |

    And click on the element in Dialog
      | saveButton |

    Then already exists message should be displayed

  Scenario: Edit Position Category

    And user sending the key in Dialog Content
      | searchInput | Head Officer |

    And click on the element in Dialog
      | searchButton |

    And edit item which added in first scenario
      | nameInput | Manager |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Deleting nationality

    And user sending the key in Dialog Content
      | searchInput | Manager |

    And user delete item from Dialog Content
      | Manager |

    Then success message should be displayed

  Scenario: Deleting Nationality negative scenario

    And user sending the key in Dialog Content
      | searchInput | Manager |

    And click on the element in Dialog
      | searchButton |

    Then there is no data to display should be displayed







