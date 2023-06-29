package com.Tests;
import com.Pages.PageOverview;
import com.Reports.reports;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;

class TestOverview {

    private WebDriver driver;
    PageOverview pageOverview;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeEach
    public void setUp() {
        pageOverview = new PageOverview(driver);
        driver = pageOverview.chromeDriverConnection();
        pageOverview.link("https://parabank.parasoft.com/parabank/admin.htm");
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
        test = report.startTest("Se revisan las cuentas");
        test.log(LogStatus.INFO,"Se inicia test");
        pageOverview.overview();
        test.log(LogStatus.PASS, "Test Finalizado Correctamente");
    }


}
