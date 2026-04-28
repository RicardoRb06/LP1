package Lista02_HerancaPolimorfismo.Q8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveTestarCalcularPreco(){
        Moto moto = new Moto("Honda", "CB 500", 30000);
        assertEquals(34500, moto.calcularPreco());
    }
}