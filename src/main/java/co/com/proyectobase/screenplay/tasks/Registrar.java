package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.model.EmployeeData;
import co.com.proyectobase.screenplay.userinterface.MenuAdminPage;
import co.com.proyectobase.screenplay.userinterface.RegisterEmployeesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.locators.WaitForWebElements;
import org.apache.tools.ant.taskdefs.WaitFor;
import org.ini4j.Reg;
import org.openqa.selenium.support.ui.Wait;
import org.yecht.Data;

import java.time.Duration;
import java.util.List;

import static java.time.Duration.*;

public class Registrar implements Task {

    private List<EmployeeData> datos;

    public Registrar(List<EmployeeData> datos) {
        this.datos = datos;
    }

    public static Registrar LosDatos(List<EmployeeData> datos) {
        return Tasks.instrumented(Registrar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Colocar una Pausa

        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getFirstName())).into(RegisterEmployeesPage.FIRST_NAME));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getMiddleName())).into(RegisterEmployeesPage.MIDDLE_NAME));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getLastName())).into(RegisterEmployeesPage.LAST_NAME));
        //actor.attemptsTo(Click.on(RegisterEmployeesPage.LOCATION));
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getLocation()).from(RegisterEmployeesPage.LOCATION_1));
        actor.attemptsTo(Click.on(RegisterEmployeesPage.BOTON_SAVE_1));
        //Colocar pausa
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getOtherId())).into(RegisterEmployeesPage.OTHER_ID));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getDateOfBirth())).into(RegisterEmployeesPage.DATE_OF_BIRTH));
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getMaritalStatus()).from(RegisterEmployeesPage.MARITAL_STATUS));
        actor.attemptsTo(Click.on(RegisterEmployeesPage.GENDER_MALE));
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getNacionality()).from(RegisterEmployeesPage.COMBO_NACIONALITY));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getDriverLicenseNumber())).into(RegisterEmployeesPage.DRIVER_LICENSE_N));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getLicenseExpiry())).into(RegisterEmployeesPage.EXPIRY_LICENSE));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getNickName())).into(RegisterEmployeesPage.NICK_NAME));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getMilitaryService())).into(RegisterEmployeesPage.MILITARY_SERVICE));
        actor.attemptsTo(Click.on(RegisterEmployeesPage.BOTON_NEXT_1));
        //Colocar pausa
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getJoinedDate())).into(RegisterEmployeesPage.JOIN_DATE));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getPermanecy())).into(RegisterEmployeesPage.DATE_PERMANECY));
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getJobTitle()).from(RegisterEmployeesPage.JOB_TITLE));
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getEmploymentStatus()).from(RegisterEmployeesPage.EMPLOYMENT_STATUS));
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getJobCategory()).from(RegisterEmployeesPage.JOB_CATEGORY));
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getSubUnit()).from(RegisterEmployeesPage.SUB_UNIT));
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getWorkShift()).from(RegisterEmployeesPage.WORK_SHIFT));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getContractStartDate())).into(RegisterEmployeesPage.CONTRACT_START));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getContractEndDate())).into(RegisterEmployeesPage.CONTRACT_END));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getComment())).into(RegisterEmployeesPage.COMMENT));
        actor.attemptsTo(Enter.theValue(String.valueOf(datos.get(0).getEffectiveFrom())).into(RegisterEmployeesPage.EFFECTIVE_FROM));
        actor.attemptsTo(Click.on(RegisterEmployeesPage.BOTON_NEXT_2));
        //Pausa
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getRegion()).from(RegisterEmployeesPage.REGION));
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getFte()).from(RegisterEmployeesPage.FTE));
        actor.attemptsTo(SelectFromOptions.byValue(datos.get(0).getTemporaryDepartament()).from(RegisterEmployeesPage.TEMPORARY_DEPARTAMENT));
        actor.attemptsTo(Click.on(RegisterEmployeesPage.BOTON_NEXT_3));
        //Pausa
        actor.attemptsTo(Click.on(RegisterEmployeesPage.BOTON_NEXT_CONTACT_DETAILS));
        //Pausa
        actor.attemptsTo(Click.on(RegisterEmployeesPage.BOTON_NEXT_SUPERVISORS));
        //Pausa

        actor.attemptsTo(Click.on(RegisterEmployeesPage.BOTON_SAVE));













    }



}
