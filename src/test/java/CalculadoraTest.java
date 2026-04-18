import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        // Prueba atómica de suma
        int resultado = 5 + 5;
        assertEquals(10, resultado, "El resultado de 5 + 5 debe ser 10");
    }

    @Test
    public void testResta() {
        // Prueba atómica de resta
        int resultado = 20 - 10;
        assertEquals(10, resultado, "El resultado de 20 - 10 debe ser 10");
    }
}