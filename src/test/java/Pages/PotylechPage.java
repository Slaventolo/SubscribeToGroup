package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class PotylechPage {
    private final SelenideElement subscriptions = $x("//span[@class='button-pro __sec toggle-dropdown']");
    private final SelenideElement notifyOfPosts = $x("//div[text()='Оповещать о публикациях']");
    private final SelenideElement allowGroupMessages = $x("//div[text()='Сообщения от группы']");
    private final SelenideElement inGroupIcon = $x("//span[text()='В группе']");
    private final SelenideElement unsubscribe = $x("//div[text()='Выйти из группы']");
    private final SelenideElement confirmUnsubscription = $x("// input[@id='hook_FormButton_submit']");

    public void adjustSubscriptions() {
        subscriptions.click();
    }

    public void notifyOfPosts() {
        notifyOfPosts.click();
    }

    public void allowGroupMessages() {
        allowGroupMessages.click();
    }

    public void unsubscribe() {
        inGroupIcon.click();
        unsubscribe.click();
        confirmUnsubscription.click();
    }
}
