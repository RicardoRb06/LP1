package Lista02_HerancaPolimorfismo.Q3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPrecoDesconto() {
        ProdutoRoupa roupa = new ProdutoRoupa(100);
        assertEquals(80, roupa.calcularPrecoDesconto());
    }

}