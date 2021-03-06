package steps;

import com.co.sofka.web.controllers.BCLoadProductsSauceDemo;
import com.co.sofka.web.controllers.BCLoginSouceDemo;

import com.co.sofka.web.controllers.DriverController;
import com.co.sofka.web.pages.SauceDemoHomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class LoadProductsSteps {
    WebDriver driver;
    @Before
    public void setUp() {
        driver = DriverController.getDriver();
        //driver = DriverController.getDriverFirefox();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    @Dado("^que un usuario se encuentre Autenticado con el \"([^\"]*)\" y \"([^\"]*)\"$")
    public void queUnUsuarioSeEncuentreAutenticadoConElY(String username, String password)  {
        BCLoginSouceDemo.startApp(driver, "https://www.saucedemo.com/");
        BCLoginSouceDemo.loginUser(driver,username, password);
    }

    @Cuando("^el usuario ingrese a la pagina Home de Souce demo$")
    public void elUsuarioIngreseALaPaginaHomeDeSouceDemo() {
        Assert.assertEquals(BCLoginSouceDemo.getTitleHome(driver), "PRODUCTS");
            }

    @Entonces("^se visualizan los nombres de los articulos$")
    public void seVisualizanLosNombresDeLosArticulos() throws IOException {
        SauceDemoHomePage page = new SauceDemoHomePage(driver);
        BCLoadProductsSauceDemo.isVisibleProducts(page);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/main/resources/screenshots/LoadProducts.png"));
    }
}
