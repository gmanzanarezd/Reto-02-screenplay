package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/auth/login")
public class LoginPage extends PageObject {

    public static final Target BOTON_LOGIN = Target.the("Click al boton de login").located(By.id("btnLogin"));

}
