package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InsurancePage {

    public String title = "ОСАГО с кэшбэком до 10%";
    public String promo = "Кэшбэк при оплате полисов Т‑Страхования картой с сервисами Pro и Premium.";
    public String section = "ОСАГО";
    public String placeholder = "Введите госномер";
    public String calculate = "Рассчитать";

    private final SelenideElement pageTitle = $("[data-test='htmlTag title']");
    private final SelenideElement sectionText = $("[data-test ='breadcrumb-1']");
    private final SelenideElement promoSubtitle = $("[data-test ='htmlTag subtitle']");
    private final SelenideElement fieldPlaceholder = $("[data-qa-type ='uikit/input.inputBox.label']");
    private final SelenideElement buttonCalculate = $("[data-qa-type ='uikit/button.content']");

    @Step("Открыть страницу")
    public InsurancePage openPage() {
        open("/insurance/osago");
        return this;
    }

    @Step("Проверить заголовок страницы")
    public InsurancePage checkPageTitile() {
        pageTitle.shouldHave(text(title));
        return this;
    }

    @Step("Проверить название раздела")
    public InsurancePage checkSectionText() {
        sectionText.shouldHave(text(section));
        return this;
    }

    @Step("Проверить текст в подзаголовке")
    public InsurancePage checkPromoSubtitle() {
        promoSubtitle.shouldHave(text(promo));
        return this;
    }

    @Step("Проверить текст кнопки 'Контакты'")
    public InsurancePage checkFieldPlaceholder() {
        fieldPlaceholder.shouldHave(text(placeholder));
        return this;
    }

    @Step("Проверить текст кнопки 'Рассчитать'")
    public InsurancePage checkButtonCalculateText() {
        buttonCalculate.shouldHave(text(calculate));
        return this;
    }

}