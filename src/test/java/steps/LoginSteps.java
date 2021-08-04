package steps;

import com.co.sofka.web.controllers.BCLoginSouceDemo;
import com.co.sofka.web.controllers.DriverController;
import cucumber.api.PendingException;
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

public class LoginSteps {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverController.getDriver();
    }

    @Dado("^un usuario en la pagina inicial de souce demo$")
    public void unUsuarioEnLaPaginaInicialDeSouceDemo() {
        BCLoginSouceDemo.startApp(driver, "https://www.saucedemo.com/");
    }

    @Cuando("^el usuario ingresa un \"([^\"]*)\" y \"([^\"]*)\" incorrectos$")
    public void elUsuarioIngresaUnYIncorrectos(String username, String password) {
        BCLoginSouceDemo.loginUser(driver, username, password);

    }

    @Entonces("^se visualiza un \"([^\"]*)\" de error$")
    public void seVisualizaUnDeError(String mensaje) throws IOException {
        Assert.assertEquals(BCLoginSouceDemo.getMessage(driver), mensaje);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/main/resources/screenshots/LoginIncorrecto.png"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Dado("^un usuario en la pagina inicial de Sauce demo$")
    public void unUsuarioEnLaPaginaInicialDeSauceDemo() {
        BCLoginSouceDemo.startApp(driver, "https://www.saucedemo.com/");
    }

    @Cuando("^el usuario ingresa \"([^\"]*)\" y \"([^\"]*)\" correctos$")
    public void elUsuarioIngresaYCorrectos(String username, String password) {
        BCLoginSouceDemo.loginUser(driver, username, password);
    }

    @Entonces("^se puede autenticar correctamente$")
    public void sePuedeAutenticarCorrectamente() throws IOException {
        Assert.assertEquals(BCLoginSouceDemo.getTitleHome(driver), "PRODUCTS");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/main/resources/screenshots/Logincorrecto.png"));
    }


}
