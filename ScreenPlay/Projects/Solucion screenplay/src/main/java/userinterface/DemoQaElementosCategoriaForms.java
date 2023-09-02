package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class DemoQaElementosCategoriaForms {

    public static final Target BTN_FORMS =Target.the("Boton Forms").located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5"));
    public static final Target BTN_PRACTICE_FORMS = Target.the("Boton practice forms").located(By.xpath("//div[@class='element-list collapse show']"));
    public static final Target TXT_FIRST_NAME =Target.the("Caja de texto primer nombre").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME =Target.the("Caja de texto apellido").located(By.id("lastName"));
    public static final Target TXT_EMAIL =Target.the("Caja de texto correo").located(By.id("userEmail"));
    public static final Target BTN_MALE = Target.the("Radio Button Macho").located(By.xpath("//*[contains(text(),'Male')]"));
    public static final Target BTN_FEMALE = Target.the("Radio Button Hembra").located(By.xpath("//*[contains(text(),'Female')]"));
    public static final Target BTN_OTHER = Target.the("Radio Button Otro").located(By.xpath("//*[contains(text(),'Other')]"));
    public static final Target TXT_MOBILE =Target.the("Caja de texto Celuar").located(By.id("userNumber"));
    public static final Target TXT_DATE =Target.the("Caja de texto Fecha de nacimiento").located(By.id("dateOfBirthInput"));
    public static final Target TXT_SUBJECTS = Target.the("Caja de texto asignaturas").located(By.xpath("//*[@id='subjectsInput']"));
    public static final Target CHK_BX_SPORTS = Target.the("Check box deportes").located(By.xpath("//*[contains(text(),'Sports')]"));
    public static final Target CHK_BX_READING = Target.the("Check box lectura").located(By.xpath("//*[contains(text(),'Reading')]"));
    public static final Target CHK_BX_MUSIC = Target.the("Check box musica").located(By.xpath("//*[contains(text(),'Music')]"));
    public static final Target TXT_CURRENT_ADDRESS = Target.the("Caja de texto dirección actual").located(By.id("currentAddress"));
    public static final Target TXT_STAGE_FORMS = Target.the("Lista pais").located(By.xpath("//*[contains(text(),'Select State')]"));
    public static final Target TXT_STAGE_FORMS1 = Target.the("Lista pais 1").located(By.xpath("//input[@id='react-select-3-input']"));
    public static final Target TXT_CITY_FORMS = Target.the("Lista ciudad").located(By.id("city"));
    public static final Target TXT_CITY_FORMS1 = Target.the("Lista ciudad 1").located(By.xpath("//input[@id='react-select-4-input']"));
    public static final Target BTN_CREAR_REGISTRO =Target.the("Boton para enviar creación registro").located(By.xpath("//*[contains(text(),'Submit')]"));
    public static final Target LBL_VERIFICACION_FIRST_NAME = Target.the("Label de verificar nombre").located(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[1]/td[2]"));
    public static final Target LBL_VERIFICACION_EMAIL_FORMS = Target.the("Label de verificar email").located(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[2]/td[2]"));
    public static final Target LBL_VERIFICACION_MOBILE = Target.the("Label de verificar numero").located(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[4]/td[2]"));
    public static final Target LBL_VERIFICACION_SUBJECTS = Target.the("Label de verificar asignaturas").located(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[6]/td[2]"));
    public static final Target LBL_VERIFICACION_CURRENT_ADDRESS_FORMS = Target.the("Label de verificar direccion").located(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[9]/td[2]"));
    public static final Target LBL_VERIFICACION_STATE = Target.the("Label de verificar pais").located(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[10]/td[2]"));
    public static final Target LBL_VERIFICACION_CITY = Target.the("Label de verificar ciudad").located(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[10]/td[2]"));
    public static final Target LBL_VERIFICACION_GRACIAS = Target.the("Label de verificar agradecimiento").located(By.xpath("//*[contains(text(),'Thanks for submitting the form')]"));
}

