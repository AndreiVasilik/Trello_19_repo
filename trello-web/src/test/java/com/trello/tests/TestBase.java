package com.trello.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {


    protected ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() {
        //openBrowser

        app.start();

    }

    @AfterClass
    public void tearDown() {
        //closeBrowser
        app.stop();
    }

}
