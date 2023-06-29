package com.Tests;
import com.Pages.PageAccount;
import com.Reports.reports;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class TestNewAccount {

    private WebDriver driver;
    PageAccount pageAccount;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeEach
    public void setUp() {
        pageAccount = new PageAccount(driver);
        driver = pageAccount.chromeDriverConnection();
        pageAccount.link("https://parabank.parasoft.com/parabank/openaccount.htm");
        report = reports.getIntance();
    }

    @AfterEach
    public void tearDown() throws Exception {
        report.endTest(test);
        report.flush();
        driver.quit();
    }

    @Test
    void test01() throws InterruptedException {
        test = report.startTest("Apertura de cuenta correcta");
        test.log(LogStatus.INFO,"Se inicia test");
        pageAccount.newAccount();
        test.log(LogStatus.PASS, "Test Finalizado Correctamente");
    }

}

