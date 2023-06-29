package com.Pages;
import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageTransaction extends BasePage {

    By username = By.xpath("//*[@id=\'loginPanel\']/form/div[1]/input");
    By password = By.xpath("//*[@id=\'loginPanel\']/form/div[2]/input");
    By buttonLogin = By.xpath("//*[@id=\'loginPanel\']/form/div[3]/input");
    By accountOverview = By.xpath("//*[@id=\'leftPanel\']/ul/li[2]/a");
    By resultado = By.xpath("//*[@id=\'accountTable\']/tfoot/tr/td");
    By secondAccount = By.xpath("//*[@id=\'accountTable\']/tbody/tr[2]/td[1]/a");
    By accountDetails = By.xpath("//*[@id=\'rightPanel\']/div/div[1]/h1");
    By activityPeriod = By.xpath("//*[@id=\'month\']");
    By allPeriods = By.xpath("//*[@id=\'month\']/option[1]");
    By activityTypes = By.xpath("//*[@id=\'transactionType\']");
    By allTypes = By.xpath("//*[@id=\'transactionType\']/option[1]");
    By buttonGo = By.xpath("//*[@id=\'rightPanel\']/div/div[2]/form/table/tbody/tr[3]/td[2]/input");


    public PageTransaction(WebDriver driver) {
        super();
    }

    public void transaction() throws InterruptedException {

        teclear("javierTriana55", username);
        teclear("123", password);
        oprimir(buttonLogin);

        Thread.sleep(1000);

        oprimir(accountOverview);
        esperaExplicita(5,resultado,"*Balance includes deposits that may be subject to holds");
        comparar(resultado,"*Balance includes deposits that may be subject to holds");

        Thread.sleep(1000);

        oprimir(secondAccount);
        esperaExplicita(5,accountDetails,"Account Details");
        comparar(accountDetails,"Account Details");

        Thread.sleep(1000);

        oprimir(activityPeriod);
        oprimir(allPeriods);
        oprimir(activityTypes);
        oprimir(allTypes);
        oprimir(buttonGo);
    }
}