package com.demoblaze.steps;


import com.demoblaze.pages.HomePage;
import com.demoblaze.utilis.DatosExcel;
import com.demoblaze.utilis.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import java.io.IOException;

/**
 * @autor Alexander Alvarez
 */

public class HomeSteps {

    HomePage homePage = new HomePage();
    DatosExcel datosExcel = new DatosExcel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    private static final String Ruta = "Datos.xlsx";
    private static final String PaginaWeb = "Url";
    private static final String Login = "Login";


    @Step("Abrir Navegador")
    public void abrirNavegador() throws IOException {
        homePage.openUrl(datosExcel.leerDatosExcel(Ruta,PaginaWeb,1,0));

    }
    @Step("Dar clic en boton login")
    public void darCliclogin(){
        homePage.getDriver().findElement(homePage.getBtnLogin()).click();
    }

    @Step ("Escribir Correo")
    public void escribirCorreo()throws IOException{
        homePage.getDriver().findElement(homePage.getTxtUsuario()).
                sendKeys(datosExcel.leerDatosExcel(Ruta,Login ,1,0));

    }

    @Step("Escribir Clave")
    public void escribirClave()throws IOException{
        homePage.getDriver().findElement(homePage.getTxtPassword()).
                sendKeys(datosExcel.leerDatosExcel(Ruta,Login ,1,1));


    }

    @Step("Clic en Login")
    public void clicBotonLogin(){
        homePage.getDriver().findElement(homePage.getBtnIngreso()).click();
    }

    @Step
    public void validarLogin(){
        Assert.assertThat(homePage.getDriver().findElement(homePage.getMsjValidarIngreso())
                .isDisplayed(), Matchers.is(true));
        esperaImplicita.EsperaImplicita(2);
    }


}
