package pages;

import interfaces.Pagesss;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class DemoAccountPage extends BasePage implements Pagesss {

    private static final String SALARY_ACCOUNT_NAME = "Зарплатный счет";
    private static final String CERTIFICATE_AVAILABLE_RESIDUE_TEXT = "Справка о доступном остатке";

    @AndroidFindBy(accessibility = "Переименовать")
    public WebElement editNameButton;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.TextView[contains(@text, 'Пополнить')]/..")
    public WebElement accountRefilBtn;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.TextView[contains(@text, 'Реквизиты')]/..")
    public WebElement requestSitesBtn;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.widget.TextView[contains(@text, '3457')]/..")
    public WebElement cardWithoutPin;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[contains(@text, 'Со своего счёта')]")
    public WebElement fromMyAccount;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[contains(@text, 'С карты другого банка')]")
    public WebElement fromCardOtherBank;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[contains(@text, 'Запросить платеж')]")
    public WebElement requestPayment;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_transfer_to_account_recipient")
    public WebElement transferrToAccountRecepient;
    @AndroidFindBy(id = "cb.ibank:id/view_payment_account_name")
    public WebElement paymentAccountName;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_transfer_to_account_empty_sender")
    public WebElement transferToAccountSender;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Накопительный счет')]/..")
    public WebElement depositAccountVariantSender;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.widget.EditText")
    public WebElement sumOfTransfer;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_transfer_to_account_button_next")
    public WebElement transferBtn;
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public WebElement cardWithPinCode;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, '" + CERTIFICATE_AVAILABLE_RESIDUE_TEXT + "')]/..")
    public WebElement certificateAvailable;


    public DemoAccountPage(AndroidDriver driver) {
        super(driver);
    }


    @Step("Тапнуть на кнопку 'Переименовать'")
    public DemoAccountPage tapOnEditNameButton() {
        buttons.clickElement(editNameButton);
        return this;
    }

    @Step("Тапнуть на кнопку 'Пополнить'")
    public DemoAccountPage tapOnRefillButton() {
        buttons.clickElement(accountRefilBtn);
        return this;
    }

//    @Step("Тапнуть 'Реквизиты'")
//    public DemoRequisitesPage tapOnRequisites() {
//        buttons.clickElement(tapOnRequisites());
//        return new DemoRequisitesPage();
//    }

//    @Step("Тапнуть на 'Карту' последнюю карту с номером *3457")
//    public DemoCardPage tapOnCardWithoutPinCode() {
//        buttons.clickElement(cardWithoutPin);
//        return new DemoCardPage();
//    }

    @Step("Тапнуть на опцию 'Со своего счета'")
    public DemoAccountPage tapOnFromMyAccountButton() {
        buttons.clickElement(fromMyAccount);
        return this;
    }

    @Step("Тапнуть на опцию 'Запросить платеж'")
    public DemoAccountPage tapOnRequestPaymentButton() {
        buttons.clickElement(requestPayment);
        return this;
    }

    @Step("В поле 'Счет пополнения' указан выбранный ранее счет")
    public boolean isExistSelectedAccount() {
        return elements.getTextFromElement(paymentAccountName).equals(SALARY_ACCOUNT_NAME);
    }

    @Step("Тапнуть на поле с плейсхолдером 'Выбрать счёт списания'")
    public DemoAccountPage tapOnTransferFromAccountSender() {
        buttons.clickElement(transferToAccountSender);
        return this;
    }

    @Step("Выбрать счет 'Накопительный счет'")
    public DemoAccountPage chooseDepositAccountCheckbox() {
        buttons.clickElement(depositAccountVariantSender);
        return this;
    }

//    @Step("Ввести сумму в поле с плейсхолдером 'Сумма'")
//    public DemoAccountPage inputSumForTransfer(String sumOfTransfer) {
//        buttons.clickElement(sumOfTransfer);
//        elements.sendKeyFromAction(sumOfTransfer);
//        return this;
//    }

    @Step("Тапнуть на кнопку 'Перевести'")
    public DemoAccountPage tapOnTransferButton() {
        buttons.clickElement(transferBtn);
        return this;
    }

//    @Step("Тапнуть на первую карту с номером *3438")
//    public DemoCardPage tapOnCardWithPinCode() {
//        buttons.clickElement(cardWithoutPin);
//        return new DemoCardPage();
//    }

}
