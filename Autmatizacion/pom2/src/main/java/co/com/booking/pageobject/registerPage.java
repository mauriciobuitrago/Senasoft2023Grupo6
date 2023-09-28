package co.com.booking.pageobject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/index.en-gb.html?aid=2311236;label=en-co-booking-desktop-5BWS5rR2KnBIiXbrHH1NNAS652796016468:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-65526620:lp1003665:li:dec:dm;ws=&gclid=Cj0KCQjwpc-oBhCGARIsAH6ote-KgRtA2QAb0O6GVDoof5pRQidVFHL2z9M2Mt5z5wVBmxedjX3YX4EaAvvTEALw_wcB")

public class registerPage extends PageObject {
    By ButtonRegister_Click = By.xpath("//a[@aria-label='Create an account']");
    By ButtonClose_ClickR = By.xpath("//button[@aria-label = 'Dismiss sign in information.'] ");

    public By getButtonRegister_Click() {
        return ButtonRegister_Click;
    }

    public void setButtonRegister_Click(By buttonRegister_Click) {
        ButtonRegister_Click = buttonRegister_Click;
    }

    public By getButtonClose_ClickR() {
        return ButtonClose_ClickR;
    }

    public void setButtonClose_ClickR(By buttonClose_ClickR) {
        ButtonClose_ClickR = buttonClose_ClickR;
    }
}
