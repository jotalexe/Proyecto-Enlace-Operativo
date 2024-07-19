package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Alexander Alvarez
 */

public class HomePage extends PageObject {

        By btnLogin = By.id("login2");
        public By getBtnLogin() {return btnLogin;}
        By txtUsuario = By.id("loginusername");
        public By getTxtUsuario() {return txtUsuario;}
        By txtPassword = By.id("loginpassword");
        public By getTxtPassword() {return txtPassword;}
        By btnIngreso = By.xpath("//button[text() = 'Log in']");
        public By getBtnIngreso() {return btnIngreso;}
        By msjValidarIngreso = By.id("nava");
        public By getMsjValidarIngreso() {return msjValidarIngreso;}

}
