Feature: Zadanie1

  Scenario Outline: user should add many addresses
    When user logs in with kruszek99@gmail.com and Pass123
    And user adds new address with <alias>, <address>, <city>, <state>, <postcode>, <phone>
    Then new address should contain <alias>, <address>, <city>, <state>, <postcode>, <phone>
    Then user can delete the address

    Examples:
      | alias           | address    | city     | state | postcode | phone       |
      | Domowy           | Flor 1 | Torun    | Alabama | 55999   | 555 555 555 |

