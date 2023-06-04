Feature: Attestations Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    And click on the element in LeftNav
      | humanResources      |
      | setupHumanResources |
      | attestations        |


  Scenario: Adding attestation

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | Diploma |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Adding attestation negative scenario

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | Diploma |

    And click on the element in Dialog
      | saveButton |

    Then already exists message should be displayed

  Scenario: Editing attestation

    And user sending the key in Dialog Content
      | searchInput | Diploma |

    And user click on search button

    And edit item which added in first scenario
      | nameInput | Red Diploma |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Deleting attestation

    And user sending the key in Dialog Content
      | searchInput | Red Diploma |

    And user click on search button

    And user delete item from Dialog Content
      | Red Diploma |

    Then success message should be displayed

  Scenario: Deleting attestation negative scenario

    And user sending the key in Dialog Content
      | searchInput | Red Diploma |

    And user click on search button

    Then there is no data to display should be displayed