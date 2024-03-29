package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper {
    WebDriver wd;
    public HeaderHelper(WebDriver wd) {

        this.wd = wd;
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void clickOnPlusButtonOnHeader() throws InterruptedException {
        Thread.sleep(10000);
        click(By.cssSelector(".header-btn-icon.icon-lg.icon-add.light"));
    }

    public void clickOnTheHomeIconHeader() throws InterruptedException {
        Thread.sleep(5000);
        click(By.xpath("//span[@class='header-btn-icon icon-lg icon-house light']"));

    }
}
