import io.qameta.allure.Flaky;
import org.junit.Test;

public class MosecomTest extends BaseTest{
    @Flaky
    @Test
    public void answerTest() {
        MosecomPage mosecomPage = new MosecomPage();
        mosecomPage.scrollPage();
        mosecomPage.fillAddressField();
        mosecomPage.clickOnAddress();
        mosecomPage.clickAnswerButton1();
        mosecomPage.chooseSerovodorodRadioButton();
        mosecomPage.getReverseTextSmells();
        mosecomPage.clickAnswerButton2();
        mosecomPage.clickReportDateField();
        mosecomPage.chooseDate();
        mosecomPage.clickReportTimeField();
        mosecomPage.chooseReportTimePeriodCheckBox();
        mosecomPage.clickAnswerButton3();
        mosecomPage.chooseEveryDayCheckBox();
        mosecomPage.clickAnswerButton4();
    }
}
