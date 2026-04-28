package Lista02_HerancaPolimorfismo.Q8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveTestarCalcularPreco(){
        Carro carro = new Carro("Toyota", "Corolla", 100000);
        assertEquals(125000, carro.calcularPreco());
    }
}