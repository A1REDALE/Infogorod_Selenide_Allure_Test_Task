import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class AllureHelper {
    @Attachment(value = "Attachment Screenshot", type = "image/png")
    public static byte[] makeScreenshot() {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
    @Attachment(value = "Log", type = "text/plain")
    public static String logAllure(String message) { return message; }
}
