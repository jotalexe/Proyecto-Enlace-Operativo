package com.demoblaze.stepDefinitions;

import com.demoblaze.steps.HomeSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    HomeSteps homeSteps;

    @Dado("que el usuario abre la pagina de demoblaze")
    public void queElUsuarioAbreLaPaginaDeDemoblaze()throws IOException {
        homeSteps.abrirNavegador();


    }
    @Dado("pulsa el boton de mi cuenta")
    public void pulsaElBotonDeMiCuenta() {
        homeSteps.darCliclogin();

    }
    @Cuando("el usuario ingresa la informacion de credenciales")
    public void elUsuarioIngresaLaInformacionDeCredenciales() throws IOException {
        homeSteps.escribirCorreo();
        homeSteps.escribirClave();
        homeSteps.clicBotonLogin();

    }
    @Entonces("vera el panel de perfil de usuario")
    public void veraElPanelDePerfilDeUsuario() {
        homeSteps.validarLogin();

    }



}
