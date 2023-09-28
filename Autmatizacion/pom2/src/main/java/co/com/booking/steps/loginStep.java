package co.com.booking.steps;
import co.com.booking.pageobject.loginPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.security.PublicKey;


public class loginStep {

    loginPage loginPage = new loginPage();

    @Step
    public void openBrowser() {
        loginPage.open();
    }


    @Step
    public void ButtonClose_Click() {
        loginPage.getDriver().findElement(loginPage.getButtonClose_Click()).click();
    }


    @Step
    public void ButtonClose_ClickF() {
        loginPage.getDriver().findElement(loginPage.getButtonClose_ClickF()).click();
    }


    @Step
    public void ButtonLoggin_Click(){loginPage.getDriver().findElement(loginPage.getButtonLoggin_Click()).click();}





    @Step
    public void EnterEmail_InputEmpty() {
        loginPage.getDriver().findElement(loginPage.getEnterEmail_InputEmpty()).sendKeys("");

    }


    @Step
    public void EnterEmail_Input() {
        loginPage.getDriver().findElement(loginPage.getEnterEmail_Input()).sendKeys("felipequevedo3m@gmail.com");

    }

    @Step
    public void EnterEmail_InputFailed() {
        loginPage.getDriver().findElement(loginPage.getEnterEmail_InputFailed()).sendKeys("felipequevedo3mgmailcom");

    }



    @Step
    public void ButtonContinue_Click(){loginPage.getDriver().findElement(loginPage.getButtonContinue_Click()).click();}


    @Step
    public void EnterPass_Input() {
        loginPage.getDriver().findElement(loginPage.getEnterPass_Input()).sendKeys("3203239625fe");
    }



    @Step
    public void EnterPass_InputEmpty() {
        loginPage.getDriver().findElement(loginPage.getEnterPass_InputEmpty()).sendKeys("");
    }


    @Step
    public void ButtonPass_Click() {
        loginPage.getDriver().findElement(loginPage.getButtonPass_Click()).click();
    }

    @Step
    public void Txt_Sign2(){
        Assert.assertThat(loginPage.getDriver().findElement(loginPage.getTXT_Login2()).isDisplayed(),
                Matchers.is(true));
    }
    @Step
    public void Txt_Sign(){
        Assert.assertThat(loginPage.getDriver().findElement(loginPage.getTXT_Login()).isDisplayed(),
                Matchers.is(true));
    }

    @Step
    public void Txt_Sign3(){
        Assert.assertThat(loginPage.getDriver().findElement(loginPage.getTXT_Login3()).isDisplayed(),
                Matchers.is(true));
    }


    @Step
    public void ButtonRegister_Click(){
        loginPage.getDriver().findElement(loginPage.getButtonRegister_Click()).click();

    }


}
