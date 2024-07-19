package com.demoblaze.stepDefinitions;

import com.demoblaze.steps.CarritoSteps;
import com.demoblaze.steps.HomeSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CarritoStepDefinition {

    @Steps
    HomeSteps homeSteps;
    @Steps
    CarritoSteps carritoSteps;

    @Dado("que el Usuario este logiado y busca un producto")
    public void queElUsuarioEsteLogiadoYBuscaUnProducto() throws IOException {
        homeSteps.abrirNavegador();
        homeSteps.darCliclogin();
        homeSteps.escribirCorreo();
        homeSteps.escribirClave();
        homeSteps.clicBotonLogin();
        carritoSteps.ClicCategoria();

    }
    @Cuando("el usuario podra seleccionar un producto y agregarlo al carrito")
    public void elUsuarioPodraSeleccionarUnProductoYAgregarloAlCarrito() {
        carritoSteps.ClicEnProducto();
        carritoSteps.ClicAddToCartButton();

    }
    @Entonces("el usuario podrá visualizar el producto dentro del carrito de compras")
    public void elUsuarioPodráVisualizarElProductoDentroDelCarritoDeCompras() {
        carritoSteps.ClicCartButton();

    }
}
