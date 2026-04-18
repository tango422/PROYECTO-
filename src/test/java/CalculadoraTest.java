
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    // Prueba atómica 1: Verifica exclusivamente la suma
    @Test
    public void testSuma() {
        int a = 5;
        int b = 10;
        int resultado = a + b;
        
        // El tercer parámetro es el mensaje que verás si la prueba falla
        assertEquals(15, resultado, "Error: La suma de 5 + 10 debería ser 15");
    }

    // Prueba atómica 2: Verifica exclusivamente la resta
    @Test
    public void testResta() {
        int a = 20;
        int b = 8;
        int resultado = a - b;
        
        assertEquals(12, resultado, "Error: La resta de 20 - 8 debería ser 12");
    }
}