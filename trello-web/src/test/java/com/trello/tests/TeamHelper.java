package com.trello.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamHelper {
    private WebDriver wd;

    public TeamHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void selectCreateTeamFromDropDown() {
        //Thread.sleep(10000);
        //click(By.cssSelector("div.chrome.chrome-74.windows.body-tabbed-page:nth-child(2) div.pop-over.is-shown:nth-child(4) div.no-back div.pop-over-content.js-pop-over-content.u-fancy-scrollbar.js-tab-parent div:nth-child(1) ul.pop-over-list li:nth-child(2) a.js-new-org > span.sub-name"));

        click(By.cssSelector(".js-new-org"));
    }

    public void fillTeamCreationForm(String teamName, String desc) {
        type(By.name("displayName"), teamName);
        type(By.name("desc"), desc);
    }

    public void submitTeamCreation() {
        click(By.cssSelector("[type=submit]"));
    }

    public String getTeamName() {
        return wd.findElement(By.cssSelector("h1.u-inline")).getText();
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

}
