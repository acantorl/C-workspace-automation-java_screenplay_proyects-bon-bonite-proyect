package com.bonbonite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.bonbonite.userinterfaces.PdpPageUI.BTN_AÑADIR_AL_CARRITO;
import static com.bonbonite.userinterfaces.PdpPageUI.SIZE_SHOE;
import static com.bonbonite.userinterfaces.PlpPageUI.FIRST_CARD_TENNIS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class AddProductToCart implements Task


{
    public static Performable now() {
        return Tasks.instrumented(AddProductToCart.class);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FIRST_CARD_TENNIS, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(FIRST_CARD_TENNIS),
                JavaScriptClick.on(SIZE_SHOE),
                // Una pequeña pausa técnica de 1 segundo para que el script de la página reaccione
                Hit.the(Keys.ESCAPE).into(SIZE_SHOE), // Esto a veces ayuda a refrescar el estado del DOM
                WaitUntil.the(BTN_AÑADIR_AL_CARRITO, isEnabled()),
                JavaScriptClick.on(BTN_AÑADIR_AL_CARRITO)
        );

    }
}
