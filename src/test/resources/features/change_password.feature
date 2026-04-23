Feature: Change password

  Scenario: Successful change and reset of password
    Given that the user navigates to the online store
    When he logs in with credentials "147852369" and "123456789Ab.#?E"
    And change your password from "123456789Ab.#?E" to "NuevaClave2026."
    Then you should see a message identical to "Ingresa a tu cuenta"
    # Paso de limpieza para que el test sea infinito:
    And he logs in with credentials "147852369" and "NuevaClave2026."
    And resets the password from "NuevaClave2026." back to "123456789Ab.#?E"