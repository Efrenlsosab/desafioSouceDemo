package steps;

import com.co.sofka.web.controllers.BCLoginSouceDemo;
import com.co.sofka.web.controllers.BCPurchaseSauceDemo;
import com.co.sofka.web.controllers.DriverController;
import com.co.sofka.web.pages.SauceDemoHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {
    WebDriver driver;
    @Before
    public void setUp() {
        driver = DriverController.getDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Dado("^que un usuario se encuentre Autenticado$")
    public void queUnUsuarioSeEncuentreAutenticado() {
        BCLoginSouceDemo.startApp(driver, "https://www.saucedemo.com/");
        BCLoginSouceDemo.loginUser(driver, "standard_user", "secret_sauce");

    }

    @Cuando("^un usuario ingresa a la pagina home del sitio Sauce demo$")
    public void unUsuarioIngresaALaPaginaHomeDelSitioSauceDemo() {
        Assert.assertEquals(BCLoginSouceDemo.getTitleHome(driver), "PRODUCTS");
    }


    @Entonces("^visualizara los botones para anadir al carro de compras ADD TO CART en los productos$")
    public void visualizaraLosBotonesParaAnadirAlCarroDeComprasADDTOCARTEnLosProductos() {
        SauceDemoHomePage page = new SauceDemoHomePage(driver);
        BCPurchaseSauceDemo.isVisibleButtons(driver,page);
    }
}
