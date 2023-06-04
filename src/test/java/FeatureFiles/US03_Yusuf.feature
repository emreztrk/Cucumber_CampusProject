Feature: Document Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    And click on the element in LeftNav
      | setup         |
      | parameters    |
      | documentTypes |

  Scenario: Adding Document

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | Yusuf |

    And click on the element in Dialog
      | addState |
      | stateStudentRegistration |
    And click esc button

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed



  Scenario: Editing Document

    And user sending the key in Dialog Content
      | searchInput | Yusuf |

    And click on the element in Dialog
      | state |
      | stateStudentRegistration |

    And user click on search button

    And edit item which added in first scenario
      | nameInput | Ahmet |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Deleting Document

    And user delete item from Document Types
      | Ahmet | stateStudentRegistration |

    Then success message should be displayed

  Scenario: Deleting Document

    And user delete item from Document Types Negative
      | Ahmet | stateStudentRegistration |

    Then there is no data to display should be displayed
