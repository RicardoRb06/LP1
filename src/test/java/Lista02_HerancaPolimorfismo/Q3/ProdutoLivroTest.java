package Lista02_HerancaPolimorfismo.Q3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveCalcularPrecoDesconto() {
        ProdutoLivro livro = new ProdutoLivro(100);
        assertEquals(95, livro.calcularPrecoDesconto());
    }
}