Feature: Attestations Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    And click on the element in LeftNav
      | setup      |
      | parameters |
      | discounts  |

  Scenario: adding discount

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | dscrptnInputBox | Rauf444 |
      | integrationCode | R.Z.    |

    And user removing zero from priority box

    And user sending the key in Dialog Content
      | priority | 1 |

    And click on the element in Dialog
      | slideToggleBtnGeneral |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: adding discount negative scenario

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | dscrptnInputBox | Rauf444 |
      | integrationCode | R.Z.    |

    And user removing zero from priority box

    And user sending the key in Dialog Content
      | priority | 1 |

    And click on the element in Dialog
      | slideToggleBtnGeneral |

    And click on the element in Dialog
      | saveButton |

    Then already exists message should be displayed

  Scenario: Editing discount

    And user sending the key in Dialog Content
      | dscrptnInput | Rauf444 |

    And click on the element in Dialog
      | searchButton |

    And edit description name
      | dscrptnInputBox | Rauf111 |
      | integrationCode | Z.R     |
      | priority        | 5       |

    And click on the element in Dialog
      | slideToggleBtnGeneral |
      | saveButton            |

    Then success message should be displayed

  Scenario: Deleting discount

    And user sending the key in Dialog Content
      | dscrptnInput | Rauf111 |

    And click on the element in Dialog
      | searchButton |

    And user delete discounted account
      | Rauf111 |

    Then success message should be displayed

  Scenario: Deleting discount negative scenario

    And user sending the key in Dialog Content
      | dscrptnInput | Rauf111 |

    And click on the element in Dialog
      | searchButton |

    Then there is no data to display should be displayed