package com.bonbonite.stepdefinitions;

import com.bonbonite.userinterfaces.MyAccountPageUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import com.bonbonite.tasks.UserCreation;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class CreationUserStepDefinitions {

    @Before
    public void setTheStage() {
        // Prepara el escenario con un elenco de actores que pueden navegar en la web
        OnStage.setTheStage(new OnlineCast());
    }

    @When("they register a user account")
    public void registerUserAccount() {
        // El actor en escena ejecuta la tarea de creación de usuario con datos aleatorios
        theActorInTheSpotlight().attemptsTo(
                UserCreation.withRandomData()
        );
    }

    @Then("the orders section must indicate {string}")
    public void verifyRegistrationMessage(String message) {
        // Se realiza la verificación (Question) sobre el elemento de confirmación esperado
        theActorInTheSpotlight().should(
                seeThat("El mensaje de confirmación de registro",
                        WebElementQuestion.the(MyAccountPageUI.TEXTO_CONFIRMACIÓN_USUARIO),
                        containsText(message))
        );
    }
}