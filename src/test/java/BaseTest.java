import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;


public class BaseTest {

    @Before
    public void setUp() {
        Configuration.browser = "firefox";
        SelenideLogger.addListener("AllureSelenide",new AllureSelenide().screenshots(true).includeSelenideSteps(true));
        Selenide.open("https://mosecom.mos.ru/");
    }
    @After
    public void tearDown(){
        Selenide.clearBrowserCookies();
    }
}


