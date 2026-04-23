package com.bonbonite.stepdefinitions;

import com.bonbonite.tasks.ChangePassword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.bonbonite.userinterfaces.LogInPageUI.TEXT_INGRESA_A_TU_CUENTA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;

public class ChangePasswordStepDefinitions {

    @And("change your password from {string} to {string}")
    public void changeYourPassword(String actual, String nueva) {
        theActorInTheSpotlight().attemptsTo(
                ChangePassword.de(actual, nueva)
        );
    }

    @Then("you should see a message identical to {string}")
    public void verifyChangeMessage(String message) {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(TEXT_INGRESA_A_TU_CUENTA, isVisible()).forNoMoreThan(15).seconds()
        );

        theActorInTheSpotlight().should(
                seeThat("Mensaje de cambio de contraseña",
                        Text.of(TEXT_INGRESA_A_TU_CUENTA),
                        containsStringIgnoringCase(message))
        );
    }

    @And("resets the password from {string} back to {string}")
    public void resetPassword(String passwordTemporal, String passwordOriginal) {
        theActorInTheSpotlight().attemptsTo(
                ChangePassword.de(passwordTemporal, passwordOriginal)
        );
    }
}