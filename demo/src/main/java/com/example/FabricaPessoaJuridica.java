package com.example;

public class FabricaPessoaJuridica implements FabricaAbstrata{

    @Override
    public Contrato createContrato() {
        return new ContratoPJ();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboPJ();
    }

}
