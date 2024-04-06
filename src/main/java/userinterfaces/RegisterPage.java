package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class RegisterPage extends PageObject {

    private RegisterPage(){
    }
//    public static final Target subTitle = Target.the("Sub title").locatedBy("//*[text()='Register to Book Store']");
    public static final Target firstNameLb = Target.the("firstname label").located(By.id("firstname"));
    public static final Target lastNameLb = Target.the("lastname label").located(By.id("lastname"));
    public static final Target userNameLb = Target.the("lastname label").located(By.id("userName"));
    public static final Target passwordLb = Target.the("password label").located(By.id("password"));
}
