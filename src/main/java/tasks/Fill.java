package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterfaces.RegisterPage.*;

public class Fill implements Task {

    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String password;

    public Fill(String firstName, String lastName, String userName, String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }
    public static Fill registerFields(String firstName, String lastName, String userName, String password) {

        return Tasks.instrumented(Fill.class, firstName, lastName, userName, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.angularRequestsHaveFinished();

        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                //Scroll.to(subTitle),
                Enter.theValue(firstName).into(firstNameLb),
                Scroll.to(lastName),
                Enter.theValue(lastName).into(lastNameLb),
                Scroll.to(userName),
                Enter.theValue(userName).into(userNameLb),
                Scroll.to(password),
                Enter.theValue(password).into(passwordLb)
        );

    }
}
