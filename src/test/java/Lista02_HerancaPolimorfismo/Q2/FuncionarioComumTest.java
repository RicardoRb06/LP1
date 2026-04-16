package Lista02_HerancaPolimorfismo.Q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void calcularPagamento() {
        FuncionarioComum funcionario = new FuncionarioComum(1600);
        assertEquals(1600, funcionario.calcularPagamento());
    }
}