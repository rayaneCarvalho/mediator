package org.example.mediador;

public class Pessoa {

    public void darComando(String comando) {
        Alexa.getInstancia().processarComando(comando);
    }
}

