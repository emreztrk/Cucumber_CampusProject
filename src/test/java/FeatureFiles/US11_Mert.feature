Feature: Bank Account Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | bankaccount  |

  Scenario: Admin User should be able to Add Bank Account to positive test
    And click on the element in Dialog

      | addButton |

    And user sending the key in Dialog Content

      | nameInput | 1012AB  |
      | iban | 123456  |

    And click on the element in Dialog

      | currency |
      | usd |
      | saveButton |

    Then success message should be displayed

  Scenario: Admin User should be able to Add Bank Account to negative test


    And click on the element in Dialog

      | addButton |

    And user sending the key in Dialog Content

      | nameInput | 1012AB  |
      | iban | 123456  |

    And click on the element in Dialog

      | currency |
      | usd |
      | saveButton |

    Then already exists message should be displayed


    Scenario: Admin User should be able to Edit Bank Account to positive test

      And user sending the key in Dialog Content

        | nameInput2 | 1012AB  |

      And click on the element in Dialog
      |searchButton|


      And  edit item which added in first scenario
      |nameInput|Account2763|

      And click on the element in Dialog

        | saveButton |

      Then success message should be displayed

  Scenario: Admin User should be able to Delete Bank Account to positive test


    And user delete item from Dialog Content
      |Account2763|


    Then success message should be displayed

  Scenario: Admin User should be able to Delete Bank Account to negative test


    And user sending the key in Dialog Content
      | searchInput | Account2763 |

    And user click on search button

    Then there is no data to display should be displayed












































