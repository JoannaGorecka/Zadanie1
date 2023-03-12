Feature: Zadanie1

  Scenario Outline: user should add many addresses
    When user logs in with kruszek99@gmail.com and Pass123
    And user adds new address with <alias>, <address>, <city>, <postcode>, <phone>
    Then new address should contain <expectedAlias>, <expectedAddress>, <expectedCity>, <expectedPostcode>, <expectedPhone>
    Then user can delete the address

    Examples:
      | alias           | address    | city     | postcode | phone       | expectedAlias | expectedAddress | expectedCity | expectedPostcode | expectedPhone |
      | praca           | Komarowa 9 | Torun    | 55-888   | 555 888 999 | praca         | Komarowa 9      | Torun        |55-888            | 555 888 999   |

