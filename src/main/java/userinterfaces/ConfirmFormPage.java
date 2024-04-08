package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmFormPage {

    private ConfirmFormPage(){
    }
    public static final Target confirmFromTitle = Target.the("Confirm practice form title").located(By.id("example-modal-sizes-title-lg"));

}
