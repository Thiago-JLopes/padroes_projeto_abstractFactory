package com.example;

public class FabricaPessoaFisica implements FabricaAbstrata{

    @Override
    public Contrato createContrato() {
        return new CotratoPF();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboPF();
    }

}
