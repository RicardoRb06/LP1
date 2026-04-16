package Lista02_HerancaPolimorfismo.Q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GerenteTest {

    @Test
    void calcularPagamento() {
        Gerente gerente = new Gerente(2000, 0.5);
        assertEquals(2500, gerente.calcularPagamento());
    }

    @Test
    void deveChecarErroTaxaAlto() {
        try {
            Gerente gerente = new Gerente(2000, 1.01);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("O bonus deve ser menor ou igual a 1", e.getMessage());
        }
    }

    @Test
    void deveChecarErroTaxaBaixo() {
        try {
            Gerente gerente = new Gerente(2000, -0.01);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("O bonus deve ser maior que 0", e.getMessage());
        }
    }
}