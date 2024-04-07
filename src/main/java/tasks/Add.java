package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterfaces.BooksPage.textLb;
import static userinterfaces.LoginPage.userNameLb;

public class Add implements Task {

    private final String book;
    public Add(String book) {
        this.book = book;
    }
    public static Add bookToCollection(String book) {
        return Tasks.instrumented(Add.class, book);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.angularRequestsHaveFinished();

        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Scroll.to(textLb),
                Enter.theValue(book).into(textLb)
        );

    }
}
