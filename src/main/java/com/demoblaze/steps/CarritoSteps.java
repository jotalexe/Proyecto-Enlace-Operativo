package com.demoblaze.steps;

import com.demoblaze.pages.CarritoPage;
import com.demoblaze.utilis.EsperaImplicita;
import net.thucydides.core.annotations.Step;


/**
 * @autor Alexander Alvarez
 */

public class CarritoSteps {

    EsperaImplicita esperaImplicita = new EsperaImplicita();
    CarritoPage carritoPage = new CarritoPage();


    @Step("Seleccionar Categoria")
    public void ClicCategoria(){
        esperaImplicita.EsperaImplicita(2);
        carritoPage.getDriver().findElement(carritoPage.getLinkByOnclick()).click();
    }

    @Step("Seleccionar producto")
    public void ClicEnProducto(){
        carritoPage.getDriver().findElement(carritoPage.getImgBySrc()).click();
        esperaImplicita.EsperaImplicita(2);
    }

    @Step("Agregar a carrito")
    public void ClicAddToCartButton(){
        carritoPage.getDriver().findElement(carritoPage.getAddToCartButton()).click();
        esperaImplicita.EsperaImplicita(2);
    }

    @Step("Revisar productos en carrito")
    public void ClicCartButton(){
        carritoPage.getDriver().findElement(carritoPage.getCartButton()).click();
        esperaImplicita.EsperaImplicita(5);
    }



}
