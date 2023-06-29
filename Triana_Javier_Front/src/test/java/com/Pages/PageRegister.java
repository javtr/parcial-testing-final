package com.Pages;
import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRegister extends BasePage {

    By botonRegistro = By.xpath("//*[@id=\'loginPanel\']/p[2]/a");
    By primerNombre = By.id("customer.firstName");
    By apellido = By.id("customer.lastName");
    By direccion = By.id("customer.address.street");
    By ciudad = By.id("customer.address.city");
    By estado = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By telefono = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By nombreUsuario = By.id("customer.username");
    By contrasena = By.id("customer.password");
    By confirmaContrasena = By.id("repeatedPassword");
    By resultado = By.xpath("//*[@id=\'rightPanel\']/p");
    By registro = By.xpath("//*[@id=\'customerForm\']/table/tbody/tr[13]/td[2]/input");

    public PageRegister(WebDriver driver) {
        super();
    }

    public void register() {
        oprimir(botonRegistro);
        teclear("Javier", primerNombre);
        teclear("Triana", apellido);
        teclear("Calle47", direccion);
        teclear("Bogota", ciudad);
        teclear("Bogota", estado);
        teclear("2342", zipCode);
        teclear("333333", telefono);
        teclear("3333", ssn);
        teclear("javier234", nombreUsuario);
        teclear("123", contrasena);
        teclear("123", confirmaContrasena);
        oprimir(registro);

        esperaExplicita(5,resultado,"Your account was created successfully. You are now logged in.");
        comparar(resultado,"Your account was created successfully. You are now logged in.");

    }

}
