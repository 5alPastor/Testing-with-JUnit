import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest {

    @Test
    public void testSuma(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }
}
