import com.confluence.pages.AtlassianLoginPage;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for Login Page")
public class LoginTest {

    AtlassianLoginPage loginPage;
    Page page = loginPage.getPage();


    public LoginTest() {
        loginPage = new AtlassianLoginPage(page);
    }

    @Test
    @DisplayName("Check if Sign In button exist on the main page")
    public void checkSignIn() {
        //Assertions.assertTrue(loginPage);  //not finished
    }


    @Test
    public void secondTest(){
        loginPage.login();
    }
}
