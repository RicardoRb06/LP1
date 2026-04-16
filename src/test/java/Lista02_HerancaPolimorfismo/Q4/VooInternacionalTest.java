package Lista02_HerancaPolimorfismo.Q4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class VooInternacionalTest {

    @Test
    void deveCalcularPreco() {
        VooInternacional internacional = new VooInternacional(5000);
        assertEquals(2500, internacional.calcularPreco());
    }
}