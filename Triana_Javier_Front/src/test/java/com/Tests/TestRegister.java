package com.Tests;
import com.Pages.PageRegister;
import com.Reports.reports;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;

class TestRegister {

	private WebDriver driver;
	PageRegister pageRegister;
	public ExtentReports report;
	public ExtentTest test;

	@BeforeEach
	public void setUp() {
		pageRegister = new PageRegister(driver);
		driver = pageRegister.chromeDriverConnection();
		pageRegister.link("https://parabank.parasoft.com/parabank/admin.htm");
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
		test = report.startTest("Registro correcto");
		test.log(LogStatus.INFO,"Se inicia test");
		pageRegister.register();
		test.log(LogStatus.PASS, "Test Finalizado Correctamente");
	}

}
