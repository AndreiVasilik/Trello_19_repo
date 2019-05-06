package com.trello.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTeam extends TestBase {

    @Test
    public void teamCreationFromHeaderTest() throws InterruptedException {
        app.clickOnPlusButtonOnHeader();
        app.selectCreateTeamFromDropDown();
        app.fillTeamCreationForm("First team", "description");
        app.submitTeamCreation();

        String teamName = app.getTeamName();

        Assert.assertEquals(teamName,"First team");
    }
}
