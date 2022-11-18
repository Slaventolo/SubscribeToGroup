package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class OkMenu {
    private final SelenideElement groups = $x("//a[@aria-label='Группы']");

    public void seeGroups() {
        groups.click();
    }
}
