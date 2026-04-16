package Lista02_HerancaPolimorfismo.Q4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void deveCalcularPreco() {
        VooDomestico domestico = new VooDomestico(1000);
        assertEquals(1250, domestico.calcularPreco());
    }
}