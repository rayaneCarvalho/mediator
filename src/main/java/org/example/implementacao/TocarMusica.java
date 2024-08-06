package org.example.implementacao;

public class TocarMusica implements Comando {
    @Override
    public void executar() {
        SistemaDeControle.tocarMusica();
        System.out.println("Tocando música.");
    }
}