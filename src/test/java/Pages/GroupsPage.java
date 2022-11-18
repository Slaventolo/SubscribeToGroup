package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GroupsPage {
    private final SelenideElement input = $x("//div[@class='wrap-input__414z3']//input");
    private final String subscribeButton = "//a[@class='button-pro group-join_btn __small']";// любая кнопка вступить
    private final String groupName = "//div[@class='ucard-v_h ellip']/a";// любое название группы
    private final String GALOCHKA = ".//*[@href='/polytechpetra']/span/*";




    //private final SelenideElement SPbPU_Name = $x("//span[text()='Санкт-Петербургский политехнический университет']");


    public void insertGroupName(String groupName) {
        input
                .setValue(groupName)
                .sendKeys(Keys.ENTER);
    }

    public SelenideElement findGroup() {
        List<SelenideElement> groups = $$x("//div[@class='ucard-v __h group-big-card __trimmed __flex']");
        for(SelenideElement element : groups) {
            if (element.text().equals("Санкт-Петербургский политехнический университет") && element.$(GALOCHKA).is(visible))
                return element;
        }
        return null;
    }

    public void subscribe() {
        SelenideElement neededElement = findGroup();
        neededElement.$(By.xpath(subscribeButton)).click();
    }

    public void browseToGroup() {
        SelenideElement neededElement = findGroup();
        neededElement.$(By.xpath(groupName)).click();
    }
}
