package com.Pages;
import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageAccount extends BasePage {

    By botonAbrirCuenta = By.xpath("//*[@id=\'leftPanel\']/ul/li[1]/a");
    By usuario = By.xpath("//*[@id=\'loginPanel\']/form/div[1]/input");
    By contrasena = By.xpath("//*[@id=\'loginPanel\']/form/div[2]/input");
    By botonLogin = By.xpath("//*[@id=\'loginPanel\']/form/div[3]/input");
    By casillaCuenta = By.xpath("//*[@id=\'type\']/option[2]");
    By botonNuevaCuenta = By.xpath("//*[@id=\'rightPanel\']/div/div/form/div/input");
    By resultadoNuevaCuenta = By.xpath("//*[@id=\'rightPanel\']/div/div/p[1]");

    public PageAccount(WebDriver driver) {
        super();
    }


    public void newAccount() throws InterruptedException {

        teclear("javierTriana55", usuario);
        teclear("123", contrasena);
        oprimir(botonLogin);


        Thread.sleep(2000);
        oprimir(botonAbrirCuenta);

        Thread.sleep(2000);
        oprimir(casillaCuenta);

        Thread.sleep(2000);
        oprimir(botonNuevaCuenta);

        Thread.sleep(2000);
        esperaExplicita(5, resultadoNuevaCuenta,"Congratulations, your account is now open.");

    }

}