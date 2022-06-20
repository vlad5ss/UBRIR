package interfaces;

import core.InitialDriver;
import pages.*;

public interface Pagesss {
    HomePage homePage = new HomePage(InitialDriver.getDriver());
    LoginPage loginPage = new LoginPage(InitialDriver.getDriver());
    CreditCartPage creditCartPage = new CreditCartPage(InitialDriver.getDriver());
    MapPage mapPage = new MapPage(InitialDriver.getDriver());
    FinancePage financePage = new FinancePage(InitialDriver.getDriver());
    NewCreditPage newCreditPage = new NewCreditPage(InitialDriver.getDriver());
    TransferPage transferPage = new TransferPage(InitialDriver.getDriver());
    DepositPage depositPage = new DepositPage(InitialDriver.getDriver());
}
