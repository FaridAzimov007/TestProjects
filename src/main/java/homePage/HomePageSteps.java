package homePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static homePage.HomePageElements.*;

public class HomePageSteps {

    public HomePageSteps fillOutBankCardRequestForm() {
        Selenide.open("http://tl.af-ctf.ru/#");
        HOME_PAGE.should(exist);
        USER_NAME_INPUT_FIELD.should(exist).sendKeys("Kratos");
        EMAIL_INPUT_FIELD.should(exist).sendKeys("kratos@gmail.com");
        PHONE_INPUT_FIELD.should(exist).sendKeys("79778787787");
        PASSWORD_INPUT_FIELD.should(exist).sendKeys("Fasd234! wdwk123!!!");
        PASSWORD_VALIDATION_INPUT_FIELD.should(exist).sendKeys("Fasd234! wdwk123!!!");
        PRIVACY_CHECKBOX.get(0).click();
        PRIVACY_CHECKBOX.get(1).click();
        SUBMIT_LOGIN_BUTTON.should(exist).click();
        return this;
    }

    public boolean isAlertPresent() {
        String script = "if (window.alert) return true; else return false;";
        String result = executeJavaScript(script);

        return Boolean.parseBoolean(result);
    }

    public void handleAlert() {
        if (isAlertPresent()) {
            Selenide.confirm("OK");

        }
    }
}

