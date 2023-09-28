package co.com.booking.pageobject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/index.en-gb.html?aid=2311236;label=en-co-booking-desktop-5BWS5rR2KnBIiXbrHH1NNAS652796016468:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-65526620:lp1003665:li:dec:dm;ws=&gclid=Cj0KCQjwpc-oBhCGARIsAH6ote-KgRtA2QAb0O6GVDoof5pRQidVFHL2z9M2Mt5z5wVBmxedjX3YX4EaAvvTEALw_wcB")

public class loginPage extends PageObject {


    By ButtonClose_Click = By.xpath("//button[@aria-label = 'Dismiss sign in information.'] ");
    By ButtonClose_ClickF = By.xpath("//button[@aria-label = 'Dismiss sign in information.'] ");
    By ButtonLoggin_Click = By.xpath("//a[@aria-label = 'Sign in'] ");
    By ButtonRegister_Click = By.xpath("//a[@aria-label='Create an account']");
    By EnterEmail_Input = By.xpath("//input[@id = 'username']");

    By EnterEmail_InputFailed = By.xpath("//input[@id = 'username']");
    By EnterEmail_InputEmpty = By.xpath("//input[@id = 'username']");
    By ButtonContinue_Click = By.xpath("//button[@class = 'Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");
    By EnterPass_Input = By.xpath("//input[@id = 'password']");
    By EnterPass_InputFailed = By.xpath("//input[@id = 'password']");
    By EnterPass_InputEmpty = By.xpath("//input[@id = 'password']");
    By ButtonPass_Click = By.xpath("//button[@type = 'submit']");
    By TXT_Login2 = By.xpath("//*[text()='Enter your password']");
    By TXT_Login = By.xpath("//*[text()='Email address']");
    By TXT_Login3 = By.xpath("//*[text()='Please enter your email address']");

    public By getTXT_Login3() {
        return TXT_Login3;
    }



    public void setTXT_Login3(By TXT_Login3) {
        this.TXT_Login3 = TXT_Login3;
    }



    public By getButtonClose_Click() {
        return ButtonClose_Click;
    }

    public void setButtonClose_Click(By buttonClose_Click) {
        ButtonClose_Click = buttonClose_Click;
    }

    public By getButtonClose_ClickF() {
        return ButtonClose_ClickF;
    }

    public void setButtonClose_ClickF(By buttonClose_ClickF) {
        ButtonClose_ClickF = buttonClose_ClickF;
    }

    public By getButtonLoggin_Click() {
        return ButtonLoggin_Click;
    }

    public void setButtonLoggin_Click(By buttonLoggin_Click) {
        ButtonLoggin_Click = buttonLoggin_Click;
    }

    public By getEnterEmail_Input() {
        return EnterEmail_Input;
    }

    public void setEnterEmail_Input(By enterEmail_Input) {
        EnterEmail_Input = enterEmail_Input;
    }

    public By getEnterEmail_InputFailed() {
        return EnterEmail_InputFailed;
    }

    public void setEnterEmail_InputFailed(By enterEmail_InputFailed) {
        EnterEmail_InputFailed = enterEmail_InputFailed;
    }

    public By getButtonContinue_Click() {
        return ButtonContinue_Click;
    }

    public void setButtonContinue_Click(By buttonContinue_Click) {
        ButtonContinue_Click = buttonContinue_Click;
    }

    public By getEnterPass_Input() {
        return EnterPass_Input;
    }

    public void setEnterPass_Input(By enterPass_Input) {
        EnterPass_Input = enterPass_Input;
    }

    public By getEnterPass_InputFailed() {
        return EnterPass_InputFailed;
    }

    public void setEnterPass_InputFailed(By enterPass_InputFailed) {
        EnterPass_InputFailed = enterPass_InputFailed;
    }

    public By getButtonPass_Click() {
        return ButtonPass_Click;
    }

    public void setButtonPass_Click(By buttonPass_Click) {
        ButtonPass_Click = buttonPass_Click;
    }
    public By getTXT_Login2() {
        return TXT_Login2;
    }

    public void setTXT_Login2(By TXT_Login2) {
        this.TXT_Login2 = TXT_Login2;
    }
    public By getTXT_Login() {
        return TXT_Login;
    }

    public void setTXT_Login(By TXT_Login) {
        this.TXT_Login = TXT_Login;
    }

    public By getButtonRegister_Click() {
        return ButtonRegister_Click;
    }

    public void setButtonRegister_Click(By buttonRegister_Click) {
        ButtonRegister_Click = buttonRegister_Click;
    }

    public By getEnterEmail_InputEmpty() {
        return EnterEmail_InputEmpty;
    }

    public void setEnterEmail_InputEmpty(By enterEmail_InputEmpty) {
        EnterEmail_InputEmpty = enterEmail_InputEmpty;
    }

    public By getEnterPass_InputEmpty() {
        return EnterPass_InputEmpty;
    }

    public void setEnterPass_InputEmpty(By enterPass_InputEmpty) {
        EnterPass_InputEmpty = enterPass_InputEmpty;
    }
}

