import core.InitialDriver;
import interfaces.Guiifds;
import org.testng.annotations.Test;
import pages.Advertisements;

import static org.assertj.core.api.Assertions.assertThat;

import static steps.FirstPageSteps.getTitleBasePage;


public class FirstTest implements Guiifds {

    Advertisements advertisements = new Advertisements(InitialDriver.getDriver());
    private String WELCOME_TITLE = "Приветствуем";

    @Test
    public void firstTitleTest() {
        firstPageSteps.waitFirstPageLoad();
        assertThat(getTitleBasePage()).as("Welcome title").contains(WELCOME_TITLE);
    }

    @Test
    public void logintTest() {
        firstPageSteps.login();
    }
}
