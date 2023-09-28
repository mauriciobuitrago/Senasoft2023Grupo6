package co.com.booking.stepdefinitions;
import co.com.booking.steps.registerStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class registerStepDefinition {

    @Steps
    registerStep registerStep;

    @Given("the user wants to register")
    public void theUserWantsToRegister(){registerStep.openBrowser();}

    @When ("the user enter the credentials")
    public void theUserEnterTheCrendentials(){
        registerStep.ButtonClose_ClickR();
        registerStep.ButtonRegister_Click();
    }
    @Then("the user is registered")
    public void theUserIsRegistered(){

    }

}
