package homePage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePageElements {
    public static final SelenideElement HOME_PAGE = $x("//h1");
    public static final SelenideElement USER_NAME_INPUT_FIELD = $x("//input[@id='userName']");
    public static final SelenideElement EMAIL_INPUT_FIELD = $x("//input[@id='email']");
    public static final SelenideElement PHONE_INPUT_FIELD = $x("//input[@id='phoneNumber']");
    public static final SelenideElement PASSWORD_INPUT_FIELD = $x("//input[@id='password']");
    public static final SelenideElement PASSWORD_VALIDATION_INPUT_FIELD = $x("//input[@id='passwordValidation']");
    public static final ElementsCollection PRIVACY_CHECKBOX = $$x("//label[@class='signUpForm__checkoboxItem']");
    public static final ElementsCollection OTP_AUTH = $$x("//input[@id='inputForAuth']");
    public static final SelenideElement SUBMIT_LOGIN_BUTTON = $x("//button[@id='submitLogin']");




}
