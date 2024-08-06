package org.example.mediador;

public class Usuario {

    public void darComando(String comando) {
        Alexa.getInstancia().processarComando(comando);
    }
}

