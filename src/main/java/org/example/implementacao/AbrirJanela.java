package org.example.implementacao;

public class AbrirJanela implements Comando {
    @Override
    public void executar() {
        SistemaDeControle.abrirJanela();
        System.out.println("Janela aberta.");
    }
}
