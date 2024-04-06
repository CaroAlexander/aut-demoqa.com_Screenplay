package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;



public class LoginPage extends PageObject {

    private LoginPage(){
    }
    public static final Target newUserBtn = Target.the("newUser Button").located(By.id("newUser"));

}
