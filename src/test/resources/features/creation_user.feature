Feature: Create user

  Scenario: Successful user creation
    Given that the user navigates to the online store
    When they register a user account
    Then the orders section must indicate "No has realizado ningún pedido aún"




