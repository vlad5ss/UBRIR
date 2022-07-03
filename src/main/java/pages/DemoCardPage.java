package pages;

import enums.Direction;
import interfaces.Pagesss;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoCardPage extends BasePage implements Pagesss {
    private static final String LIMITS_TEXT = "Лимиты";

    @AndroidFindBy(id = "cb.ibank:id/card_details_cashback_conditions")
    public WebElement CASHBACK_CONDITIONS;
    @AndroidFindBy(id = "cb.ibank:id/card_details_action_set_up_pin")
    public WebElement SET_PIN_CODE_BUTTON;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Действия']")
    public WebElement ACTIONS_BLOCK;
    @AndroidFindBy(id = "cb.ibank:id/card_details_action_limits")
    public WebElement LIMITS_BUTTON;
    @AndroidFindBy(id = "cb.ibank:id/card_details_action_edit_pin_code")
    public WebElement EDIT_PIN_CODE_BUTTON;
    @AndroidFindBy(id = "cb.ibank:id/card_details_cvc_cvv_button")
    public WebElement CARD_DETAILS_CVC_CVV_BUTTON;
    @AndroidFindBy(accessibility = "CVC2/CVV2")
    public WebElement CVC2_CVV2_BUTTON;
    @AndroidFindBy(accessibility = "Номер карты")
    public WebElement CARD_NUMBER_BUTTON;
    @AndroidFindBy(id = "cb.ibank:id/view_two_columns_icon")
    public WebElement COPY_CARD_NUMBER;
    @AndroidFindBy(id = "cb.ibank:id/view_two_columns_value")
    public List<WebElement> CARD_VALUE;
    @AndroidFindBy(id = "cb.ibank:id/card_details_action_tariff")
    public WebElement TARIFF_PLAN;

    public DemoCardPage(AndroidDriver driver) {
        super(driver);
    }

    @Step("Проскроллить к блоку 'Действия'")
    public DemoCardPage scrollToActionsBlock() {
        screen.swipeScreenWithPressTime(Direction.UP, 1000, null);
        return this;
    }

    @Step("Тапнуть на опцию 'Установить ПИН-код'")
    public DemoCardPage tapOnSetPinCodeButton() {
        buttons.clickElement(SET_PIN_CODE_BUTTON);
        return this;
    }

    @Step("Блок 'Действия' отображается в шторке с информацией по карте.")
    public boolean isDisplayActionsBlock() {
        return elements.isVisibleElement(ACTIONS_BLOCK);
    }

    @Step("Проскроллить к блоку 'Действия' и тапнуть на 'Изменить ПИН-код'")
    public DemoCardPage scrollAndTapOnEditPinCode() {
        screen.swipeScreenWithPressTime(Direction.UP, 1000, null);
        buttons.clickElement(EDIT_PIN_CODE_BUTTON);
        return this;
    }

    @Step("Тапнуть на 'Показать номер карты и CVC/CVV'")
    public DemoCardPage tapOnCardDetailsCvcCvvButton() {
        buttons.clickElement(CARD_DETAILS_CVC_CVV_BUTTON);

        return this;
    }

//    @Step("Данные карты соответсвуют {args}'")
//    public List<List<String>> checkCardValue(String... args) {
//        List<String> expectedValue = Arrays.asList(args);
//        CARD_VALUE.forEach(x -> waiters.isElementExist(x));
//
//        List<String> currentValue = CARD_VALUE
//                .stream().map(WebElement::getText).collect(Collectors.toList());
//
//        return Arrays.asList(expectedValue, currentValue);
//    }

    @Step("Тапнуть на 'Номер карты'")
    public boolean tapOnCardNumberButton() {
        buttons.clickElement(CARD_NUMBER_BUTTON);
        return elements.isSelectedElement(CVC2_CVV2_BUTTON);

    }

    @Step("Тапнуть на 'CVC2/CVV2'")
    public boolean tapOnCVC2CVV2() {
        buttons.clickElement(CVC2_CVV2_BUTTON);
        return elements.isSelectedElement(CARD_NUMBER_BUTTON);
    }

    @Step("Тапнуть на кнопку копировать")
    public DemoCardPage tapOnCopyCardNumber() {
        buttons.clickElement(COPY_CARD_NUMBER);
        return this;
    }
}
