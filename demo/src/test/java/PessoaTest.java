import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.FabricaAbstrata;
import com.example.FabricaPessoaFisica;
import com.example.FabricaPessoaJuridica;
import com.example.Pessoa;

class PessoaTest {
    
    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Contrato PF", pessoa.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Contrato PJ", pessoa.emitirContrato());
    }


    @Test
    void deveEmitirReciboPF() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Recibo PF", pessoa.emitirRecibo());
    }


    @Test
    void deveEmitirReciboPJ() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Recibo PJ", pessoa.emitirRecibo());
    }

}
