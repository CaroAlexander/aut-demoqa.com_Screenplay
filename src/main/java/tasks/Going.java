package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Going implements Task {

    private final Target target;
    public Going(Target target) {
        this.target = target;
    }
    public static Going to(Target target) {
        return Tasks.instrumented(Going.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.angularRequestsHaveFinished();

        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Scroll.to(target),
                Click.on(target)
        );

    }
}
