package com.Pages;
import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageOverview extends BasePage {

    By usuario = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By contrasena = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By botonLogin = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
    By botonVerCuentas = By.xpath("//*[@id=\'leftPanel\']/ul/li[2]/a");
    By resultadoVerCuentas = By.xpath("//*[@id=\'accountTable\']/tfoot/tr/td");


    public PageOverview(WebDriver driver) {
        super();
    }

    public void overview(){

        teclear("javierTriana55", usuario);
        teclear("123", contrasena);
        oprimir(botonLogin);

        oprimir(botonVerCuentas);
        esperaExplicita(5, resultadoVerCuentas,"*Balance includes deposits that may be subject to holds");
        comparar(resultadoVerCuentas,"*Balance includes deposits that may be subject to holds");
    }
}
