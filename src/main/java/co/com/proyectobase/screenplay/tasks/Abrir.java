package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
        import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private LoginPage loginPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginPage));
        actor.attemptsTo(Click.on(LoginPage.BOTON_LOGIN));

    }

    public static Abrir LaPaginaOrange() {
        return Tasks.instrumented(Abrir.class);
    }

}
