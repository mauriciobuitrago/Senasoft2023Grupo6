package co.com.sena.steptsdefinitions;

import co.com.sena.questions.ValidationName;
import co.com.sena.task.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Felipe");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("that the user is on the web page")
    public void thattheuserisonthewebpage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/index.es.html"));
    }


    @Then("the user will not be logged in")
    public void theUserWillNotBeLoggedIn() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationName.compare()
                , Matchers.is("Swag Labs")));
    }

    @When("the user does not enter the two credentials")
    public void theUserDoesNotEnterTheTwoCredentials() {
    }

    @Given("that the user is on the website")
    public void thatTheUserIsOnTheWebsite() {

    }

    @When("the user enters the credentials")
    public void theUserEntersTheCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials());
    }
}
