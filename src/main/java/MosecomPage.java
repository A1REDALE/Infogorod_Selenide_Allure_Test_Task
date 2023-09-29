import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class MosecomPage {


    private final SelenideElement addressSearchField = $x("//input[@id = 'address-autocomplete']");
    private final SelenideElement address = $x("//div[text()='город Москва, Щибровская улица, дом 7']");
    private final SelenideElement answerButton1 = $x("//div[@id='quiz-page-id-0']//button");
    private final SelenideElement serovodorodRadioButton = $x("//input[@value='Сероводород']");
    private final SelenideElement answerButton2 = $x("//div[@id='quiz-page-id-1']//button");
    private final SelenideElement reportDate = $x("//input[@id='report-date']");
    private final SelenideElement date = $x("//a[text()='26']");
    private final SelenideElement reportTime = $x("//div[text()='Выберите временные отрезки']");
    private final SelenideElement reportTimePeriod = $x("//input[@data-label='06:00 - 12:00']");
    private final SelenideElement answerButton3 = $x("//div[@id='quiz-page-id-2']//button");
    private final SelenideElement reportPeriod = $x("//input[@value='Каждый день']");
    private final SelenideElement answerButton4 = $x("//div[@id='quiz-page-id-3']//button");



    @Step("проскролить страницу до опроса")
    public void scrollPage(){
        addressSearchField.shouldBe(Condition.visible)
                .scrollIntoView("false");
    }
    @Step("ввести в поле значение ")
    public void fillAddressField(){
        addressSearchField.sendKeys("с");
        AllureHelper.makeScreenshot();
    }

    @Step("выбрать адрес в списке")
    public void clickOnAddress(){
        address.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        AllureHelper.makeScreenshot();
    }
    @Step("кликнуть на кнопку Ответить первого вопроса")
    public void clickAnswerButton1() {
        answerButton1.shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
    }

    @Step("выбрать запах Сероводород")
    public void chooseSerovodorodRadioButton() {
        serovodorodRadioButton.click();
        AllureHelper.makeScreenshot();
    }
    @Step("сохраняем все запахи из списка и выводим их в обратном порядке")
    public void getReverseTextSmells() {
        ElementsCollection smells = $$x("//input[@name='smell_type']");
        List<String> listSmells = new ArrayList<>();
        for (SelenideElement e : smells) {
            listSmells.add(e.getAttribute("value"));
        }
        for (String smell : listSmells) {
            StringBuilder sm = new StringBuilder(smell);
            sm.reverse();
            AllureHelper.logAllure(sm.toString());
        }
    }
    @Step("кликнуть на кнопку Ответить второго вопроса")
    public void clickAnswerButton2() {
        answerButton2.click();
    }
    @Step("кликнуть на поле выбора даты")
    public void clickReportDateField() {
        reportDate.shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
    }
    @Step("выбрать дату 26")
    public void chooseDate() {
        date.shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
        AllureHelper.makeScreenshot();;
    }
    @Step("кликнуть на поле выбора временного периода")
    public void clickReportTimeField() {
        reportTime.shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
    }
    @Step("выбрать временной отрезок 06-12")
    public void chooseReportTimePeriodCheckBox() {
        reportTimePeriod.click();
        AllureHelper.makeScreenshot();;
    }

    @Step("кликнуть на кнопку Ответить третьего вопроса")
    public void clickAnswerButton3() {
        answerButton3.shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
    }
    @Step("выбрать периодичность появления запахов Каждый день")
    public void chooseEveryDayCheckBox() {
        reportPeriod.click();
        AllureHelper.makeScreenshot();;
    }
    @Step("кликнуть на кнопку Ответить четвертого вопроса")
    public void clickAnswerButton4() {
        answerButton4.shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
        AllureHelper.makeScreenshot();
    }
}
