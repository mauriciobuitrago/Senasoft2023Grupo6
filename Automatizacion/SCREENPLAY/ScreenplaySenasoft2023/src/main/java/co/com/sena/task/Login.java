package co.com.sena.task;

import co.com.sena.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(LoginPage.BTN_CLOSE);
        actor.attemptsTo(Enter.theValue("standard_user").into(LoginPage.BTN_USERNAME),
                Enter.theValue("secret_sauce").into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN));

    }


    public static Login enterCredentials() {
        return Tasks.instrumented(Login.class);
    }

}
