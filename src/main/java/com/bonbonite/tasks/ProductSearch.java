package com.bonbonite.tasks;

import com.bonbonite.userinterfaces.HomePageUI;
import com.bonbonite.userinterfaces.SearchPageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductSearch implements Task {
    private final String producto;

    public ProductSearch(String producto) {
        this.producto = producto;
    }

    public static ProductSearch conNombre(String producto) {
        return instrumented(ProductSearch.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HomePageUI.BTN_RECHAZAR_COOKIES.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(HomePageUI.BTN_RECHAZAR_COOKIES)),
                Click.on(HomePageUI.BTN_LUPA),
                Enter.theValue(producto).into(SearchPageUI.INPUT_BUSQUEDA),
                Click.on(SearchPageUI.BTN_BUSCAR)
        );
    }
}