Feature: Logout

  Scenario: Successful Logut with Existing Data
    Given that the user navigates to the online store
    When he logs in with credentials "147852369" and "123456789Ab.#?E"
    And he logs out
    Then he should see a header message related to "Hecho a mano en Colombia desde 1979"