package Lista02_HerancaPolimorfismo.Q8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {

    @Test
    void deveTestarCalcularPreco(){
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite", 2000);
        assertEquals(2100, bicicleta.calcularPreco());
    }

}