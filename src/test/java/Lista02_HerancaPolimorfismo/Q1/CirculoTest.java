package Lista02_HerancaPolimorfismo.Q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void deveCalcularPerimetro() {
        Circulo circulo = new Circulo(3);
        assertEquals(18.84, circulo.calcularPerimetro());
    }

    @Test
    void deveCalcularArea() {
        Circulo circulo = new Circulo(3);
        assertEquals(28.26, circulo.calcularArea());
    }
}