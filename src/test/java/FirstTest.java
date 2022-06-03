import core.InitialDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.assertj.core.api.Assertions.assertThat;


public class FirstTest {

    HomePage homePage = new HomePage(InitialDriver.getDriver());
    private String WELCOME_TITLE = "Приветствуем";

    @Test
    public void firstTitleTest() {
        homePage.waitLoad();
        assertThat(homePage.getTitleBasePage()).as("Welcome title").contains(WELCOME_TITLE);
    }

    @Test
    public void logintTest() {
        homePage.login();
    }
}

