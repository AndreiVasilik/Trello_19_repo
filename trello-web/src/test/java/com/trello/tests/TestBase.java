package com.trello.tests;

import manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {


    protected static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() {
        //openBrowser

        app.start();

    }

    @AfterSuite
    public void tearDown() {
        //closeBrowser
        app.stop();
    }

}
