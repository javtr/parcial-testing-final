package com.Pages;
import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageTransfer extends BasePage {

    By username = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By password = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By buttonLogin = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
    By buttonTransfer= By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a");
    By resultTransferFounds = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");
    By fieldAmount = By.xpath("//*[@id=\"amount\"]");
    By fieldFrom = By.xpath("//*[@id=\"fromAccountId\"]/option[3]");
    By fieldTo = By.xpath("//*[@id=\"toAccountId\"]/option[2]");
    By buttonTransferAccounts= By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input");
    By resultTransferOk = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");

    public PageTransfer(WebDriver driver) {
        super();
    }

    public void trasferencias() throws InterruptedException {

        teclear("javierTriana55", username);
        teclear("123", password);
        oprimir(buttonLogin);

        Thread.sleep(2000);

        oprimir(buttonTransfer);

        esperaExplicita(5,resultTransferFounds,"Transfer Funds");

        Thread.sleep(2000);

        teclear("4500", fieldAmount);

        oprimir(fieldFrom);
        oprimir(fieldTo);
        oprimir(buttonTransferAccounts);

        esperaExplicita(3,resultTransferOk,"Transfer Complete!");

    }
}
