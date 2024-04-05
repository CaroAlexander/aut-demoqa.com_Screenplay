package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class caso1StepDefinitions {
    @Before
    public void initialConfigurationDektop() {
        OnStage.setTheStage(new OnlineCast());
    }

//    @After
//    public static void CloseDriver() throws IOException, InterruptedException {
//        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
//        KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
//    }

    @Given("^I enter to ToolsQA page$")
    public void iEnterToEvalartTest() {
      //theActorCalled(actor).
       // OnStage.theActorCalled("Customer").attemptsTo(Open.browserOn().thePageNamed("pages.BelUAT"));

        OnStage.theActorCalled("Customer").wasAbleTo(
                Open.url("https://demoqa.com/login")
        );
    }

//    @Given("^I select the Categoty and Subcategoty$")
//    public void iSelectTheCategotyAndSubcategoty(DataTable dataTable) {
//        OnStage.theActorCalled("Customer").wasAbleTo(
//                Selecting.categoryAndSubcategory(
//                        CategoryAndSubcategoryData.setData(dataTable).get(0)
//                )
//        );
//    }

    @When("I add {string} products to the Shopping Cart")
    public void iAddproductsToTheShoppingCart(String productsNumber) {
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                AddingProducts.by(productsNumber),
//                Going.to(SHOPPING_CART)
//        );
    }

    @Then("^I see the purchase summary correctly$")
    public void iSeeTheAlert() {
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
