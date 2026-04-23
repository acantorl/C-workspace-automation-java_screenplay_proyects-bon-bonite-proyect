Feature: Login

  Scenario: Successful Login with Existing Data
    Given that the user navigates to the online store
    When he logs in with credentials "147852369" and "123456789Ab.#?E"
    Then he should see a message related to "No has realizado ningún pedido aún"