package com.co.sena.task;

import com.co.sena.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(LoginPage.BTN_CLOSE));
    }



    public static Login enterCredentials ()
    {
        return Tasks.instrumented(Login.class);
    }

}
