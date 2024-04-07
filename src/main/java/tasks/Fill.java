package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterfaces.LoginPage.*;

public class Fill implements Task {
    private final String userName;
    private final String password;

    public Fill(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }
    public static Fill loginFields(String userName, String password) {

        return Tasks.instrumented(Fill.class, userName, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.angularRequestsHaveFinished();

        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Scroll.to(userNameLb),
                Enter.theValue(userName).into(userNameLb),
                Scroll.to(passwordLb),
                Enter.theValue(password).into(passwordLb),
                Click.on(loginLb)
        );

    }
}
