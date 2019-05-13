package com.trello.tests;

import org.testng.annotations.Test;

public class CreateBoard extends TestBase {


    @Test
    public void boardCreationTest() throws InterruptedException {

        //initCreationBoard
        //fillBoardForm
        //verify, board created

        app.getHeader().clickOnPlusButtonOnHeader();
        app.getBoardHelper().selectCreateBoardFromDropDown();
        app.getBoardHelper().fillBoardCreationForm("Test board");
        app.getBoardHelper().submitBoardCreation();
    }

    @Test(enabled = false)
    public void boardCreationNegative() {

    }

}
