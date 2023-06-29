package com.Tests;
import com.Pages.PageTransaction;
import com.Reports.reports;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestTransaction {

    private WebDriver driver;
    PageTransaction pageTransaction;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeEach
    public void setUp() {
        pageTransaction = new PageTransaction(driver);
        driver = pageTransaction.chromeDriverConnection();
        pageTransaction.link("https://parabank.parasoft.com/parabank/admin.htm");
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
        test = report.startTest("Proceso de transaccion");
        test.log(LogStatus.INFO,"Se inicia test");
        pageTransaction.transaction();
        test.log(LogStatus.PASS, "Test Finalizado Correctamente");
    }
}
