package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.MenuAdminPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Navegar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuAdminPage.BOTON_DESPLEGAR_PIM));
        actor.attemptsTo(Click.on(MenuAdminPage.OPCION_ADD_EMPLOYEE));
    }

    public static Navegar Opciones() {
        return Tasks.instrumented(Navegar.class);
    }

}
