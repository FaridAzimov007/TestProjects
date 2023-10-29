package web.homePage;

import homePage.HomePageSteps;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import web.settings.TestBase;

@DisplayName("Home page tests")
@Tag("Smoke")
@Epic("Auth")
public class HomePageTests extends TestBase {


    @Owner("Kadim Abbasov - QA engineer")
    @Feature(value = "auth")
    @DisplayName("User auth by Fill out card request form")
    @Description("Verification of user authorization by filling in the card request form")
    @TmsLink("https://jira.ce.sometask-1111")
    @Test
    public void fillOutCardRequestForm(){
        new HomePageSteps()
                .fillOutBankCardRequestForm();

    }
}
