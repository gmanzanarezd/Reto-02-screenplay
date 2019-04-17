package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuAdminPage extends PageObject {

    public static final Target BOTON_DESPLEGAR_PIM = Target.the("Botonpara desplegar menu PIM").located(By.xpath("(//SPAN[@class='material-icons collapsible-indicator'])[41]"));
    public static final Target OPCION_ADD_EMPLOYEE = Target.the("Seleccionar la opción para agregar empleado").located(By.xpath("//SPAN[@class='left-menu-title'][text()='Add Employee']"));


}
