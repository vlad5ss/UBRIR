import interfaces.Pagesss;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FirstTest implements Pagesss {

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

