import Base.BaseTest;
import interfaces.Pagesss;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FirstTest extends BaseTest implements Pagesss {

    private String WELCOME_TITLE = "Приветствуем";

    @Test
    public void firstTitleTest() {
        homePage.waitLoad();
        assertThat(homePage.getTitleBasePage()).as("Welcome title").contains(WELCOME_TITLE);
    }

    @Description("Login test")
    @Test
    public void logintTest() {
        homePage.login();
    }
}

