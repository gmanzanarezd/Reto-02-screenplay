package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterEmployeesPage extends PageObject {

    //Primera pantalla
    public static final Target FIRST_NAME  = Target.the("Introducir primer nombre").located(By.id("firstName"));
    public static final Target MIDDLE_NAME = Target.the("Introducir segundo nombre").located(By.id("middleName"));
    public static final Target LAST_NAME   = Target.the("Introducir apellido").located(By.id("lastName"));
    public static final Target EMPLOYEE_ID = Target.the("Id del empleado").located(By.id("employeeId"));
    public static final Target LOCATION = Target.the("Ubicación").located(By.xpath("//*[@id=\'location_inputfileddiv\']/div/input"));
    public static final Target LOCATION_1 = Target.the("Seleccionar ubicación").located(By.id("location"));
    public static final Target BOTON_SAVE_1 = Target.the("primer botón guardar").located(By.xpath("//A[@id='systemUserSaveBtn']"));
    public static final Target OTHER_ID = Target.the("Otro id").located(By.id("otherId"));
    public static final Target DATE_OF_BIRTH = Target.the("").located(By.id("dateOfBirth"));
    public static final Target MARITAL_STATUS = Target.the("Estado civil").located(By.xpath("(//SPAN[text()='-- Select --'][text()='-- Select --'])[1]"));
    public static final Target COMBO_LOCATION  = Target.the("Combo de país").located(By.xpath("//SPAN[text()='-- Select --']"));
    public static final Target GENDER_MALE= Target.the("Seleccionar masculino").located(By.xpath("//LABEL[@ng-class='{disabled: form.readonly}'][text()='Male']"));
    public static final Target GENDER_FEMALE= Target.the("Seleccionar femenino").located(By.xpath("//LABEL[@ng-class='{disabled: form.readonly}'][text()='Female']"));
    public static final Target COMBO_NACIONALITY = Target.the("Combo de nacionalidad").located(By.xpath("(//SPAN[text()='-- Select --'][text()='-- Select --'])[2]"));
    public static final Target DRIVER_LICENSE_N  = Target.the("Número de licencia de conducir").located(By.id("txtLicenNo"));
    public static final Target EXPIRY_LICENSE = Target.the("Fecha de expiración de licencia").located(By.xpath("//INPUT[@id='txtLicExpDate']"));
    public static final Target NICK_NAME = Target.the("alias").located(By.id("nickName"));
    public static final Target MILITARY_SERVICE = Target.the("Servicio militar").located(By.id("militaryService"));
    public static final Target BOTON_NEXT_1 = Target.the("boton next 1").located(By.xpath("//BUTTON[@ng-show='!employeeWizard.showFinishButton'][text()='Next']"));
    //Segunda Pantalla
    public static final Target JOIN_DATE = Target.the("fecha de ingreso").located(By.xpath("//INPUT[@id='joined_date']"));
    public static final Target DATE_PERMANECY = Target.the("fecha de permanencia").located(By.xpath("//INPUT[@id='date_of_permanency']"));
    public static final Target JOB_TITLE = Target.the("cargo").located(By.id("//*[@id=\'subunit_id_inputfileddiv\']/div/input"));
    public static final Target EMPLOYMENT_STATUS = Target.the("estado del empleado").located(By.xpath("//*[@id=\'employment_status_id_inputfileddiv\']/div/input"));
    public static final Target JOB_CATEGORY = Target.the("Categoria").located(By.xpath("//*[@id=\'job_category_id_inputfileddiv\']/div/input"));
    public static final Target SUB_UNIT = Target.the("subunidad").located(By.xpath("//*[@id=\'subunit_id_inputfileddiv\']/div/input"));
    public static final Target WORK_SHIFT = Target.the("Turno de trabajo").located(By.xpath("//*[@id=\'work_shift_id_inputfileddiv\']/div/input"));
    public static final Target CONTRACT_START = Target.the("Fecha de inicio de contrato").located(By.xpath("//INPUT[@id='contractStartDate']"));
    public static final Target CONTRACT_END = Target.the("Fecha final del contrato").located(By.id("contractEndDate"));
    public static final Target COMMENT = Target.the("Comentarios").located(By.xpath("//*[@id=\'comment\']"));
    public static final Target EFFECTIVE_FROM = Target.the("válido desde").located(By.id("changes_Effective_from"));
    public static final Target BOTON_NEXT_JOB = Target.the("boton next en job").located(By.xpath("//BUTTON[@ng-show='!employeeWizard.showFinishButton'][text()='Next']"));
    //Tercera Pantalla
    public static final Target REGION = Target.the("Región").located(By.xpath("//*[@id=\'WizardFieldDefinition9_inputfileddiv\']/div/input"));
    public static final Target FTE = Target.the("fte").located(By.xpath("//*[@id=\'WizardFieldDefinition10_inputfileddiv\']/div/input"));
    public static final Target TEMPORARY_DEPARTAMENT = Target.the("departamento temporal").located(By.xpath("//*[@id=\'WizardFieldDefinition11_inputfileddiv\']/div/input"));
    public static final Target BOTON_NEXT_DETAILS_JOB = Target.the("boton next otros detalles job").located(By.xpath("//BUTTON[@ng-show='!employeeWizard.showFinishButton'][text()='Next']"));
    //Cuarta pantalla
    public static final Target BOTON_NEXT_CONTACT_DETAILS = Target.the("Boton next cuarta pantalla").located(By.xpath("//BUTTON[@ng-show='!employeeWizard.showFinishButton'][text()='Next']"));
    //Quinta pantalla
    public static final Target BOTON_NEXT_SUPERVISORS = Target.the("Boton next pantalla supervisor").located(By.xpath("//BUTTON[@ng-show='!employeeWizard.showFinishButton'][text()='Next']"));
    //Sexta pantalla
    public static final Target BOTON_SAVE = Target.the("Boton guardar").located(By.xpath("//BUTTON[@form-name='wizardForm'][text()='Save']"));
    //Segunda Pantalla Opcional
    public static final Target HOBBIES1 = Target.the("Pasatiempos").located(By.id("pimField2"));
    public static final Target BOTON_NEXT_2 = Target.the("Boton next 2").located(By.xpath("//BUTTON[@ng-show='!employeeWizard.showFinishButton'][text()='Next']"));
    //Tercera pantalla Opcional
    public static final Target HOBBIES2 = Target.the("Otros pasatiempos").located(By.id("pimField5"));
    public static final Target SS = Target.the("ss").located(By.id("pimField7"));
    public static final Target BLOOD_GROUP = Target.the("grupo sanguíneo").located(By.xpath("//SPAN[text()='-- Select --']"));
    public static final Target SASDA = Target.the("sasda").located(By.id("pimField8"));
    public static final Target BOTON_NEXT_3 = Target.the("Boton next 3").located(By.xpath("//BUTTON[@ng-show='!employeeWizard.showFinishButton'][text()='Next']"));

}
