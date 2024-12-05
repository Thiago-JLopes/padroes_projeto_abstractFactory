package com.example;

public class Pessoa {
    private Contrato contrato;
    private Recibo recibo;

   public Pessoa (FabricaAbstrata fabrica) {
    this.contrato = fabrica.createContrato();
    this.recibo = fabrica.createRecibo();
   }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirRecibo() {
        return this.recibo.emitir();
    }

}
