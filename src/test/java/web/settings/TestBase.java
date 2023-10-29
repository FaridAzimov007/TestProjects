package web.settings;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class TestBase {


    public void start() {
        System.setProperty("chromeoptions.args", "--window-size=1920x1080");
        Configuration.headless = true;
        Configuration.timeout=10000;
        Configuration.browserSize = "1920x1080";
        Selenide.clearBrowserCookies();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

    }

    public void finish(){
        Selenide.closeWebDriver();
    }

    @BeforeEach
    public void setUp() {
        start();
    }

    @AfterEach
    public void close(){
        finish();
    }


}
