package com.trello.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    public void start() {
        // wd = new ChromeDriver();
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        openSite("https://trello.com/");
        login("black_sun_2004@bk.ru", "Mystic1985");
    }

    protected void submitBoardCreation() {
        click(By.cssSelector("[type='submit']"));

    }

    protected void fillBoardCreationForm(String boardName) {
        type(By.xpath("//*[@class='subtle-input']"), boardName);

    }

    protected void selectCreateBoardFromDropDown() {
        click(By.cssSelector(".js-new-board"));

    }

    public void clickOnPlusButtonOnHeader() throws InterruptedException {
        Thread.sleep(5000);
        click(By.cssSelector("[aria-label='Create Board or Organization']"));

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

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void stop() {
        wd.quit();
    }

    public void selectCreateTeamFromDropDown() {
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
}
