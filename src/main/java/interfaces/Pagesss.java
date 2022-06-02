package interfaces;

import core.InitialDriver;
import pages.HomePage;

public interface Pagesss {
    HomePage HOME_PAGE = new HomePage(InitialDriver.getDriver());
}
