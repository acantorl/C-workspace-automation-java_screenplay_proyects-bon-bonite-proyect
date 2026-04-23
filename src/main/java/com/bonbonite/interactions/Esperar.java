package com.bonbonite.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar implements Interaction {

    private final int milisegundos;

    public Esperar(int milisegundos) {
        this.milisegundos = milisegundos;
    }

    @Override
    @Step("{0} espera un momento")
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static Esperar por(int milisegundos) {
        return instrumented(Esperar.class, milisegundos);
    }
}