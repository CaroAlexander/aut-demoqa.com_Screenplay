package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.AreEquals;
import tasks.FillForm;
import tasks.FillLogin;
import tasks.Going;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.ConfirmFormPage.confirmFromTitle;
import static userinterfaces.LeftMenuPage.*;
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
    public void iFillTheFormWithDataAndSubmitIt(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps();
        for (Map<String, String> registerData : data ) {

            String firstName = registerData.get("firstName");
            String lastName = registerData.get("lastName");
            String userEmail = registerData.get("userEmail");
            String userNumber = registerData.get("userNumber");
            String subjectsInput = registerData.get("subjectsInput");
            String currentAddress = registerData.get("currentAddress");

            theActorInTheSpotlight().
                    attemptsTo(
                            Going.to(formBtn),
                            Going.to(practiceFormBtn),
                            FillForm.fields(firstName, lastName, userEmail, userNumber, subjectsInput,currentAddress)
                    );
            theActorInTheSpotlight().remember("First name", firstName);
        }

    }

    @Then("^the close button is shown$")
    public void theCloseButtonIsShown(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps();
        for (Map<String, String> confirmData : data ) {

            String notificationMessage = confirmData.get("notificationMessage");

            OnStage.theActorInTheSpotlight().should(
                    seeThat(AreEquals.theTexts(confirmFromTitle, notificationMessage))
            );
        }
    }

}

