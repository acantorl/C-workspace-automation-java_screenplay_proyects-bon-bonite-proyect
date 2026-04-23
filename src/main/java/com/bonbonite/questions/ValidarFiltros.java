package com.bonbonite.questions;

import com.bonbonite.userinterfaces.PlpPageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarFiltros implements Question<String> {

    public static ValidarFiltros elTextoFiltros() {
        return new ValidarFiltros();
    }

    @Override
    // El método debe ser answeredBy (con 'ed' al final)
    public String answeredBy(Actor actor) {
        return Text.of(PlpPageUI.LABEL_FILTROS).answeredBy(actor);
    }
}