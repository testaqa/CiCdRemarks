import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class AppTests {

    @BeforeAll
    public static void BeforeAll() {
        Configuration.baseUrl = "https://godzila.bg/en";
        Configuration.startMaximized = true;
    }

    @Test
    void numberOfCitiesOnStart() {
        open("");
        $$(".popup-btn-city").shouldHaveSize(2);
    }

}
