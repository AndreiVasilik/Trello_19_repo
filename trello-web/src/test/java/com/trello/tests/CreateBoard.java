package com.trello.tests;

import org.testng.annotations.Test;

public class CreateBoard extends TestBase {


    @Test
    public void boardCreationTest() throws InterruptedException {

        //initCreationBoard
        //fillBoardForm
        //verify, board created

        app.clickOnPlusButtonOnHeader();
        app.selectCreateBoardFromDropDown();
        app.fillBoardCreationForm("Test board");
        app.submitBoardCreation();
    }

    @Test(enabled = false)
    public void boardCreationNegative() {

    }

}
