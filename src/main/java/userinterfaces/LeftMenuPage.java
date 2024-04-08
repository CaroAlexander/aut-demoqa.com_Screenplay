package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class LeftMenuPage extends PageObject {

    private LeftMenuPage(){
    }
    public static final Target formBtn = Target.the("Opc Forms").locatedBy("//*[text()='Forms']");
    public static final Target practiceFormBtn = Target.the("Opc Practice Form").locatedBy("//*[text()='Practice Form']");

    public static final Target newUserBtn = Target.the("newUser Button").located(By.id("newUser"));
    public static final Target userNameLb = Target.the("User name label").located(By.id("userName"));
    public static final Target passwordLb = Target.the("Password label").located(By.id("password"));
    public static final Target loginLb = Target.the("Login Button").located(By.id("login"));

}
