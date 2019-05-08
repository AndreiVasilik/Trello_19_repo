package com.trello.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private BoardHelper boardHelper;
    WebDriver wd;

    public void start() {
        wd = new ChromeDriver();
        //wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        openSite("https://trello.com/");
        login("black_sun_2004@bk.ru", "Mystic1985");
        boardHelper = new BoardHelper(wd);
    }

    public void clickOnPlusButtonOnHeader() throws InterruptedException {
        Thread.sleep(10000);
        click(By.cssSelector(".header-btn-icon.icon-lg.icon-add.light"));

    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void login(String userName, String password) {

        click(By.cssSelector("[href='/login']"));

        type(By.name("user"), userName);
        type(By.name("password"), password);
        click(By.id("login"));
    }

    public void stop() {
        wd.quit();
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

    public BoardHelper getBoardHelper() {
        return boardHelper;
    }
}

