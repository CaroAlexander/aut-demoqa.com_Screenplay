package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class ProfilePage extends PageObject {

    private ProfilePage(){
    }
    public static final Target bookStoreApplicationBtn = Target.the("Opc Book Store Application").locatedBy("//*[text()='Book Store Application']");
    public static final Target bookStoreBtn = Target.the("Opc Book Store").locatedBy("//*[text()='Book Store']");

    public static final Target newUserBtn = Target.the("newUser Button").located(By.id("newUser"));
    public static final Target userNameLb = Target.the("User name label").located(By.id("userName"));
    public static final Target passwordLb = Target.the("Password label").located(By.id("password"));
    public static final Target loginLb = Target.the("Login Button").located(By.id("login"));

}
