package com.co.steptsdefinitions;

import com.co.sena.questions.ValidationName;
import com.co.sena.task.Login;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Felipe");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("que el usuario esta en la pagina web")
    public void queElUsuarioEstaEnLaPaginaWeb() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/index.es.html"));
    }

    @Cuando("el usuario ingresa las credenciales")
    public void elusuarioIngresaLasCredenciales() {

        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials());
    }

    @Entonces("el usuario estara logueado")
    public void elUsuarioEstaraLogueado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationName.compare()
        , Matchers.is("Swag Labs")));
    }

    @Cuando("el usuario no ingresa las dos credenciales")
    public void elUsuarioNoIngresaLasDosCredenciales() {

    }
    @Entonces("el usuario no estara logueado")
    public void elUsuarioNoEstaraLogueado() {

    }


}
