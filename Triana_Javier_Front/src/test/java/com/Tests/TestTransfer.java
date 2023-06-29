package com.Tests;

import com.Pages.PageTransfer;
import com.Reports.reports;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class TestTransfer {

    private WebDriver driver;
    PageTransfer pageTransfer;
    public ExtentReports report;
    public ExtentTest test;


    @BeforeEach
    public void setUp() {
        pageTransfer = new PageTransfer(driver);
        driver = pageTransfer.chromeDriverConnection();
        pageTransfer.link("https://parabank.parasoft.com/parabank/transfer.htm");
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
        test = report.startTest("Proceso de Transferencia");
        test.log(LogStatus.INFO,"Se inicia test");
        pageTransfer.trasferencias();
        test.log(LogStatus.PASS, "Test Finalizado Correctamente");
    }
}

