package com.co.sena.questions;

import com.co.sena.userinterfaces.LoginPage;
import com.co.sena.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationName implements Question{


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LoginPage.TXT_TITLE).viewedBy(actor).asString();
    }

    public static ValidationName compare ()
    {
        return new ValidationName();
    }
}
