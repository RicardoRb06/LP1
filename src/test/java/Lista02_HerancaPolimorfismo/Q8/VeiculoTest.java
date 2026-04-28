package Lista02_HerancaPolimorfismo.Q8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveTestarPrecoNegativo() {
        try {
            Carro carro = new Carro("Toyota", "Corolla", -1);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Preço não pode ser negativo", e.getMessage());
        }
    }
}