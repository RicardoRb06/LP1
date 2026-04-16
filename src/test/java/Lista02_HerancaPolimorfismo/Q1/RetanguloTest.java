package Lista02_HerancaPolimorfismo.Q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RetanguloTest {

    @Test
    void deveCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(10, 4);
        assertEquals(28, retangulo.calcularPerimetro());
    }

    @Test
    void deveCalcularArea() {
        Retangulo retangulo = new Retangulo(10, 4);
        assertEquals(40, retangulo.calcularArea());
    }
}