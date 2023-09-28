package co.com.sena.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target BTN_CLOSE = Target.the("Close pop-up window")
            .locatedBy("//button[@aria-label='Ignorar información sobre el inicio de sesión']");

    public static final Target BTN_LOGIN = Target.the("click on login button")
            .locatedBy("//input[@id='Iniciar sesión]");

    public static final Target TXT_USERNAME = Target.the("enter username data")
            .locatedBy("//input[@id='user-name']");

    public static final Target BTN_USERNAME = Target.the("enter username data")
            .locatedBy("//input[@id='user-name']");
    public static final Target TXT_PASSWORD = Target.the("enter password")
            .locatedBy("//input[@id='password']");


    public static final Target TXT_TITLE = Target.the("Logon title")
            .locatedBy("//div[text()='Swag Labs']");


}
