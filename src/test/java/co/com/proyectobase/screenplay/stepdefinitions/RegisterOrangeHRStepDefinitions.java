package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.model.EmployeeData;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Navegar;
import co.com.proyectobase.screenplay.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterOrangeHRStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor juan = Actor.named("Juan");

    @Before
    public void ConfiguracionInicial(){
        juan.can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que Juan necesita crear un empleado en el OrageHR$")
    public void que_Juan_necesita_crear_un_empleado_en_el_OrageHR()  {
        juan.wasAbleTo(Abrir.LaPaginaOrange());
        juan.wasAbleTo(Navegar.Opciones());
    }

    @Cuando("^el realiza el ingreso del registro en la aplicación$")
    public void el_realiza_el_ingreso_del_registro_en_la_aplicación(List<EmployeeData> datos)  {
        juan.attemptsTo(Registrar.LosDatos(datos));
    }

    @Entonces("^el visualiza el nuevo empleado en el aplicativo$")
    public void el_visualiza_el_nuevo_empleado_en_el_aplicativo()  {

    }


}
