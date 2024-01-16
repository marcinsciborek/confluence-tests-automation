package com.confluence.pages;

import com.confluence.model.AtlassianUsers;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import lombok.Getter;

@Getter
public class AtlassianLoginPage extends BasePage {

    public AtlassianLoginPage(Page page) {
        super(page);
    }


    public final Locator signIn = page.locator ("//span[contains(text(),'Sign in')]");
    public final Locator inputEmailField = page.locator ("//input[@id='username']");
    public final Locator inputPasswordField = page.locator ("//input[@id='password']");
    public final Locator continueButton = page.locator("//span[@class='css-178ag6o']").first();

    public void login(){
        page.context().clearCookies();
        page.waitForLoadState(LoadState.NETWORKIDLE);
        signIn.click();
        inputEmailField.fill(AtlassianUsers.USER.getUserName());
        continueButton.click();
        inputPasswordField.fill(AtlassianUsers.USER.getPassword());
        continueButton.click();
    }
}
