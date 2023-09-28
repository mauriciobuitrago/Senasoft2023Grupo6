package co.com.booking.steps;
import co.com.booking.pageobject.loginPage;
import co.com.booking.pageobject.registerPage;
import net.thucydides.core.annotations.Step;


public class registerStep {


   registerPage registerPage = new registerPage();
   loginPage loginPage = new loginPage();

    @Step
    public void openBrowser() {registerPage.open();}

    @Step
    public void ButtonClose_ClickR() {
        registerPage.getDriver().findElement(registerPage.getButtonClose_ClickR()).click();
    }
    @Step
    public void ButtonRegister_Click(){
                registerPage.getDriver().findElement(registerPage.getButtonRegister_Click()).click();

            }
}
