package com.co.sena.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target BTN_CLOSE = Target.the("Cerrar ventana emergente")
            .locatedBy("//button[@aria-label='Ignorar información sobre el inicio de sesión']");

    public static final Target BTN_LOGIN = Target.the("clic en boton loigin")
            .locatedBy("//input[@id='Iniciar sesión]");

    public static final Target TXT_USERNAME = Target.the("ingresar datos de username")
            .locatedBy("//input[@id='user-name']");

    public static final Target BTN_USERNAME = Target.the("ngresar datos de username")
            .locatedBy("//input[@id='user-name']");
    public static final Target TXT_PASSWORD = Target.the("ingresar contraseña")
            .locatedBy("//input[@id='password']");


    public static final Target TXT_TITLE = Target.the("Titulo de logueo")
            .locatedBy("//div[text()='Swag Labs']");



}
