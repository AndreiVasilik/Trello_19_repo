package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    HeaderHelper header;
    WebDriver wd;
    private TeamHelper teamHelper;
    private BoardHelper boardHelper;

    public void start() {
        wd = new ChromeDriver();
        //wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        openSite("https://trello.com/");
        login("black_sun_2004@bk.ru", "Mystic1985");
        boardHelper = new BoardHelper(wd);
        teamHelper = new TeamHelper(wd);
        header = new HeaderHelper(wd);
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

    public TeamHelper getTeamHelper() {
        return teamHelper;
    }

    public HeaderHelper getHeader() {
        return header;
    }
}

