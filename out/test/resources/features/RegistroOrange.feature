#Author: gmanzanarezd@choucairtesting.com
# language:es
@CasoExitoso
Característica:
  Como usuario
  Quiero ingresar la plataforma OrangeHR
  Y realizar el registro de los datos de un empleado

  Escenario: Registro de empleado en OrangeHR
    Dado que Juan necesita crear un empleado en el OrageHR
    Cuando el realiza el ingreso del registro en la aplicación
      | firstName  | middleName | lastName | employeeId |Location              | otherId | dateOfBirth | maritalStatus | gender  | nacionality | driverLicenseNumber | licenseExpiry  | nickName  | militaryService   | hobbies1  | hobbies2 |ss     |bloodGroup|sasda     | joinedDate | permanecy | jobTitle   |employmentStatus| jobCategory  | subUnit  | workShift | contractStartDate|  contractEndDate | comment     | effectiveFrom  | region   | fte | temporaryDepartament |
      | Francisco  | Jose       | Leal     | 2319		  |Australian Regional HQ| 1923	   | 1991-04-23  | Married       | Male    | Colombian   | 1213145             | 2019-09-25     | fleal     | fuerzas especiales| Baseball  | Golf     | Valor |O         |otro valor|2019-04-01  | 2019-02-04| QA Engineer| Freelance      | Operatives   | QA Team  | General   | 2019-04-03       |   2030-11-05     | Comentarios | 2019-04-16     | Region-1 | 1   | Sub unit-1           |
    Entonces el visualiza el nuevo empleado en el aplicativo
