
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.InsurancePage;

@Tag("simple")
public class TbankInsuranceTest extends TestBase {

    InsurancePage osagoPage = new InsurancePage ();

    @Test
    @DisplayName("Заголовок страницы соответствует требованиям")
    public void pageTitleTest() {
        osagoPage.openPage();
        osagoPage.checkPageTitile();
    }

    @Test
    @DisplayName("Кнопка 'Рассчитать' кликабельна")
    public void buttonCalculateTest() {
        osagoPage.openPage();
        osagoPage.checkButtonCalculate();
    }

    @Test
    @DisplayName("Текст в подзаголовке соответствует требованиям")
    public void promoSubtitleWatchTest() {
        osagoPage.openPage();
        osagoPage.checkPromoSubtitle();
    }

    @Test
    @DisplayName("Текст плейсхолдера поля ввода номера соответствует требованиям")
    public void fieldPlaceholderWatchTest() {
        osagoPage.openPage();
        osagoPage.checkFieldPlaceholder();
    }

    @Test
    @DisplayName("Название кнопки 'Рассчитать' соответствует требованиям")
    public void buttonCalculateWatchTest() {
        osagoPage.openPage();
        osagoPage.checkButtonCalculateText();
    }
}
