package org.example.implementacao;

public class SistemaDeControle {
    private static boolean musicaTocando = false;
    private static boolean luzApagada = false;
    private static boolean janelaAberta = false;

    public static void tocarMusica() {
        musicaTocando = true;
    }

    public static void apagarLuz() {
        luzApagada = true;
    }

    public static void abrirJanela() {
        janelaAberta = true;
    }

    public static boolean isMusicaTocando() {
        return musicaTocando;
    }

    public static boolean isLuzApagada() {
        return luzApagada;
    }

    public static boolean isJanelaAberta() {
        return janelaAberta;
    }

    public static void resetar() {
        musicaTocando = false;
        luzApagada = false;
        janelaAberta = false;
    }
}

