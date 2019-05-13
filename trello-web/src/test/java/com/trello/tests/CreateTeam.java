package com.trello.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTeam extends TestBase {

    @Test
    public void teamCreationFromHeaderTest() throws InterruptedException {
        app.getHeader().clickOnPlusButtonOnHeader();
        app.getTeamHelper().selectCreateTeamFromDropDown();
        app.getTeamHelper().fillTeamCreationForm("First team", "description");
        app.getTeamHelper().submitTeamCreation();

        String teamName = app.getTeamHelper().getTeamName();

        Assert.assertEquals(teamName,"First team");
    }
}
