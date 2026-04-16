package Lista02_HerancaPolimorfismo.Q3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveCalcularPrecoDesconto() {
        ProdutoEletronico eletronico = new ProdutoEletronico(100);
        assertEquals(90, eletronico.calcularPrecoDesconto());
    }

}