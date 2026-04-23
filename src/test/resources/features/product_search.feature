Feature: Check product availability

  Scenario: Successful product search
    Given that the user navigates to the online store
    When the user search for the product "tenis"
    Then the user should see results related to "Filtros"




