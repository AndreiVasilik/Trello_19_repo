package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static jdk.nashorn.internal.objects.NativeJava.type;

public class BoardHelper {
    private WebDriver wd;

    public BoardHelper(WebDriver wd) {

        this.wd = wd;
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void submitBoardCreation() {
        click(By.cssSelector("[type='submit']"));

    }

    public void fillBoardCreationForm(String boardName) {
        type(By.xpath("//*[@class='subtle-input']"), boardName);

    }

    public void selectCreateBoardFromDropDown() {
        click(By.cssSelector(".js-new-board"));

    }
}
