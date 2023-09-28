package co.com.sena.questions;

import co.com.sena.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationName implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LoginPage.TXT_TITLE).viewedBy(actor).asString();
    }

    public static ValidationName compare() {
        return new ValidationName();
    }
}
