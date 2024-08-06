package org.example.implementacao;

public class ApagarLuz implements Comando {
    @Override
    public void executar() {
        SistemaDeControle.apagarLuz();
        System.out.println("Luz apagada.");
    }
}
