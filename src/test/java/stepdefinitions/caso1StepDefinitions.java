package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import tasks.Add;
import tasks.FillLogin;
import tasks.Going;
import utils.KillBrowser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.ProfilePage.*;

public class caso1StepDefinitions {
    @Before
    public void initialConfigurationDektop() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public static void CloseDriver() throws IOException, InterruptedException {
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
    }

    @Given("^I enter to ToolsQA page$")
    public void iEnterToEvalartTest() {
      //theActorCalled(actor).
       // OnStage.theActorCalled("Customer").attemptsTo(Open.browserOn().thePageNamed("pages.BelUAT"));

        OnStage.theActorCalled("Customer").wasAbleTo(
                Open.url("https://demoqa.com/login")
        );
    }

    @Given("^I login with my user already created$")
    public void iLoginWithMyUserAlreadyCreated(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps();
        for (Map<String, String> registerData : data ) {

            String userName = registerData.get("userName");
            String password = registerData.get("password");

            theActorInTheSpotlight().
                    wasAbleTo(
                            FillLogin.fields(userName, password)
                    );
            theActorInTheSpotlight().remember("User name", userName);
        }

//        OnStage.theActorCalled("Customer").wasAbleTo(
//                Going.to(newUserBtn),
//                Fill.registerFields(newUserBtn)
//        );

    }

    @When("I register the books")
    public void iRegisterTheBooks() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                //Going.to(bookStoreApplicationBtn),
                Going.to(bookStoreBtn),
                Add.bookToCollection("Programming JavaScript")
        );
    }
    @And("delete the book and the account")
    public void deleteTheBookAndTheAccount(String productsNumber) {
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                AddingProducts.by(productsNumber),
//                Going.to(SHOPPING_CART)
//        );
    }

    @Then("^only the book is are register$")
    public void onlyTheBookIsAreRegister() {
//        int totalPrice = ProductsInfo.getTotalPrice();
//        OnStage.theActorInTheSpotlight().should(
//                seeThat(IsCorrectProductsNumber.equalsBetween(TOTAL_PRODUCTS, productsNumber)),
//                seeThat(IsCorrectTotalPrice.inThePage(SHOPPING_CART_TOTAL_PRICE, totalPrice))
//
//        );
//
//        for(int i = 1; i<=productsNumber; i++){
//            OnStage.theActorInTheSpotlight().should(
//                    seeThat(IsCorrectProductName.inThePage(productName(String.valueOf(i)))),
//                    seeThat(IsCorrectTotalPriceXProduct.inThePage(totalPriceXProduct(String.valueOf(i)))),
//                    seeThat(IsCorrectUnitsXProduct.inThePage(unitsXProduct(String.valueOf(i))))
//            );
//        }
    }
}
