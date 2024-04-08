package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class AreEquals implements Question<Boolean> {

    private final Target messageTitle;
    private final String notificationMessage;



    public AreEquals(Target messageTitle, String notificationMessage) {
        this.messageTitle = messageTitle;
        this.notificationMessage = notificationMessage;
    }

    public static AreEquals theTexts(Target messageTitle, String notificationMessage) {
        return new AreEquals(messageTitle, notificationMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return messageTitle.resolveFor(actor).getText().equals(notificationMessage);
    }
}