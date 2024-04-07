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
import tasks.Fill;
import tasks.Going;
import utils.KillBrowser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.ProfilePage.bookStoreBtn;

public class caso2StepDefinitions {

    @When("I extract the text")
    public void iRegisterTheBooks() {
        OnStage.theActorInTheSpotlight().attemptsTo(
//                //Going.to(bookStoreApplicationBtn),
//                Going.to(bookStoreBtn),
//                Add.bookToCollection("Programming JavaScript")
        );
    }

    @Then("^the text are printed into the report$")
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

    @When("I fill the form with data and submit it")
    public void iFillTheFormWithDataAndSubmitIt() {
        OnStage.theActorInTheSpotlight().attemptsTo(

        );
    }

    @Then("^the close button is shown$")
    public void theCloseButtonIsShown() {
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

