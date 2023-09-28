package co.com.booking.stepdefinitions;
import co.com.booking.steps.loginStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginStepDefinition {

    @Steps
    loginStep loginStep;

    @Given("the user wants to log in")
    public void theUserWantsToLogIn(){loginStep.openBrowser();}

    @When ("the user is on the main page")
    public void theUserIsOnTheMainPage(){
        loginStep.ButtonClose_Click();
    }
    @Then("the user click in the button for login")
    public void theUserClickInTheButtonForLogin() {
        loginStep.ButtonLoggin_Click();
        loginStep.EnterEmail_Input();
        loginStep.ButtonContinue_Click();
        loginStep.EnterPass_Input();
        loginStep.ButtonPass_Click();
        loginStep.Txt_Sign2();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Given("the user wants to log in but fail")
    public void theUserWantsToLogInn(){loginStep.openBrowser();}

    @When ("the user is on the main pages")
    public void theUserIsOnTheMainPages(){
        loginStep.ButtonClose_ClickF();
    }
    @Then("the user fail the  login")
    public void theUserFailTheLogin() {
        loginStep.ButtonRegister_Click();
        loginStep.EnterEmail_InputFailed();
        loginStep.ButtonContinue_Click();
       // loginStep.EnterPass_InputFailed();
        loginStep.ButtonPass_Click();
        loginStep.Txt_Sign();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Given("the user wants to log in but its empty")
    public void theUserWantsToLogInButItsEmpty() {
        loginStep.openBrowser();
    }
    @When("the user is in the mains pages")
    public void theUserIsOnTheMainsPages(){
        loginStep.ButtonClose_ClickF();
    }

    @Then("the user dont put any dates")
    public void theUserDontAnyDates() {
        loginStep.ButtonLoggin_Click();
        loginStep.EnterEmail_InputEmpty();
        //loginStep.ButtonContinue_Click();
        loginStep.EnterPass_InputEmpty();
        //loginStep.ButtonPass_Click();
        loginStep.Txt_Sign();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
