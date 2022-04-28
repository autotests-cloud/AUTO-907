package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("test")
    void generatedTest() {
        step("Open http://localhost/243n_web_20.2.0.35514/LoginView.aspx", () -> {
            step("// todo: just add selenium action");
        });

        step("Include username yakovlev_ks", () -> {
            step("// todo: just add selenium action");
        });

        step("Include password 12345678", () -> {
            step("// todo: just add selenium action");
        });

        step("Press Enter", () -> {
            step("// todo: just add selenium action");
        });
    }
}