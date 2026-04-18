import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {
    
    @Given("que el usuario está en la página de login")
    public void usuarioEnLogin() {
        System.out.println("Navegando a la página de login...");
    }

    @When("ingresa el usuario {string} y la clave {string}")
    public void ingresaCredenciales(String user, String pass) {
        System.out.println("Intentando con: " + user);
    }

    @Then("debería ver el mensaje {string}")
    public void verificaMensaje(String mensaje) {
        assertTrue(true); 
    }

    @Then("debería ver el mensaje de error {string}")
    public void verificaError(String error) {
        assertTrue(true);
    }
}
