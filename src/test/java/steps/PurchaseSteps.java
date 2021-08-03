package steps;

import com.co.sofka.web.controllers.BCLoginSouceDemo;
import com.co.sofka.web.controllers.BCPurchaseSauceDemo;
import com.co.sofka.web.controllers.DriverController;
import com.co.sofka.web.pages.SauceDemoHomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
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
        BCPurchaseSauceDemo.isVisibleButtons(page);
    }


    @Y("^da click en el boton ADD TO CART de cualquier \"([^\"]*)\"$")
    public void daClickEnElBotonADDTOCARTDeCualquier(String producto)  {
        SauceDemoHomePage page = new SauceDemoHomePage(driver);
        BCPurchaseSauceDemo.clickButtonAddToCart(page, producto);
    }

    @Entonces("^el producto se agrega a la lista de ADD TO CART$")
    public void elProductoSeAgregaALaListaDeADDTOCART() {
        SauceDemoHomePage page = new SauceDemoHomePage(driver);
        Assert.assertEquals(BCPurchaseSauceDemo.lookingCart(page), "1");
    }


}
