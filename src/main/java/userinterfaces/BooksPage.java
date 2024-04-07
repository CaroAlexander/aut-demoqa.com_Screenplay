package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class BooksPage extends PageObject {

    private BooksPage(){
    }
    public static final Target textLb = Target.the("Text label").located(By.id("searchBox"));

}
