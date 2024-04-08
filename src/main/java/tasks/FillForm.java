package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.AutomationPracticeFormPage.*;


public class FillForm implements Task {
    private final String firstName;
    private final String lastName;
    private final String userEmail;
    private final String userNumber;
    private final String subjectsInput;
    private final String currentAddress;

    public FillForm(String firstName, String lastName, String userEmail, String userNumber, String subjectsInput, String currentAddress) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.userEmail = userEmail;
        this.userNumber = userNumber;
        this.subjectsInput = subjectsInput;
        this.currentAddress = currentAddress;
    }
    public static FillForm fields(String firstName, String lastName, String userEmail, String userNumber, String subjectsInput, String currentAddress) {

        return Tasks.instrumented(FillForm.class, firstName, lastName,userEmail, userNumber, subjectsInput, currentAddress);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.angularRequestsHaveFinished();

        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Scroll.to(firstNameLb),
                Enter.theValue(firstName).into(firstNameLb),
                Scroll.to(lastNameLb),
                Enter.theValue(lastName).into(lastNameLb),
                Scroll.to(userEmailLb),
                Enter.theValue(userEmail).into(userEmailLb),
                //SelectFromOptions.byValue("Female").from(genderRbtn),
                Scroll.to(femaleGenderRb),
                Click.on(femaleGenderRb),
                Enter.theValue(userNumber).into(userNumberLb),
                Enter.theValue(subjectsInput).into(subjectsInputLb),
                //Hit.the(Keys.ENTER).into(subjectsInputLb),
                Click.on(musicHobbyRb),
                Enter.theValue(currentAddress).into(currentAddressLb),
                Click.on(submitBtn),
                WaitUntil.the(closeBtn, isVisible()).forNoMoreThan(60).seconds()
        );

    }
}
