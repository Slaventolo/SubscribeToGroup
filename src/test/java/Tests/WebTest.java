package Tests;
import Pages.*;
import org.junit.jupiter.api.Test;

public class WebTest {
    private final String URL = "https://ok.ru/";
    private final String LOGIN = "technoPol24";
    private final String PASSWORD = "technoPolis2022";

    private final String nameToSet = "политех питер";

    @Test
    public void subscribeToGroup() {
        new LoginPage(URL).insertData(LOGIN, PASSWORD);

        new OkMenu().seeGroups();

        GroupsPage groupsPage = new GroupsPage();
            groupsPage.insertGroupName(nameToSet);
            groupsPage.subscribe();
            groupsPage.browseToGroup();

        PotylechPage potylechPage = new PotylechPage();
            potylechPage.adjustSubscriptions();
            potylechPage.notifyOfPosts();
            potylechPage.allowGroupMessages();
    }
}
