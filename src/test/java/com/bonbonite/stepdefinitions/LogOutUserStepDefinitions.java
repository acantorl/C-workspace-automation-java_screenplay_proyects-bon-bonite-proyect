package com.bonbonite.stepdefinitions;

import com.bonbonite.questions.ValidarTextoHeader;
import com.bonbonite.tasks.LogOutUser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class LogOutUserStepDefinitions {



    @When("he logs out")
    public void heLogsOut() {
        theActorInTheSpotlight().attemptsTo(
                LogOutUser.asUser() // Llamas al método estático que instancia la clase
        );

    }
    @Then("he should see a header message related to {string}")
    public void heShouldSeeAHeaderMessageRelatedTo(String elTextoHeader) {
        OnStage.theActorInTheSpotlight().should(
                // Usamos equalToIgnoringCase para que no falle por Mayúsculas/Minúsculas
                seeThat(ValidarTextoHeader.elTextoHeader(), equalToIgnoringCase(elTextoHeader))
        );
    }





}
