package Lista02_HerancaPolimorfismo.Q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveCalcularPagamento() {
        Diretor diretor = new Diretor(2000, 0.5, 10000);
        assertEquals(7000, diretor.calcularPagamento());
    }

    @Test
    void deveChecarErroTaxaAlto() {
        try {
            Diretor diretor = new Diretor(2000, 1.01, 10000);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("O bonus deve ser menor ou igual a 1", e.getMessage());
        }
    }

    @Test
    void deveChecarErroTaxaBaixo() {
        try {
            Diretor diretor = new Diretor(2000, -0.01, 10000);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("O bonus deve ser maior que 0", e.getMessage());
        }
    }
}