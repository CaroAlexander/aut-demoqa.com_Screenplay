package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class AutomationPracticeFormPage extends PageObject {

    private AutomationPracticeFormPage(){
    }
    public static final Target firstNameLb = Target.the("First Name label").located(By.id("firstName"));
    public static final Target lastNameLb = Target.the("Last name label").located(By.id("lastName"));
    public static final Target userEmailLb = Target.the("User email label").located(By.id("userEmail"));
    public static final Target femaleGenderRb = Target.the("Female gender radio Btn").locatedBy("//*[text()='Female']");
    public static final Target userNumberLb = Target.the("User number label").located(By.id("userNumber"));
    public static final Target subjectsInputLb = Target.the("Subjects Input").located(By.id("subjectsInput"));
    public static final Target musicHobbyRb = Target.the("Music Hobby Radio Btn").locatedBy("//*[text()='Music']");
    public static final Target currentAddressLb = Target.the("Current address label").locatedBy("//textarea[@placeholder='Current Address']");
    public static final Target submitBtn = Target.the("Submit Button").located(By.id("submit"));
    public static final Target closeBtn = Target.the("Close Button").located(By.id("closeLargeModal"));


}
