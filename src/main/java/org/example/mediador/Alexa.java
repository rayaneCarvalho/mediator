package org.example.mediador;

import org.example.implementacao.AbrirJanela;
import org.example.implementacao.ApagarLuz;
import org.example.implementacao.Comando;
import org.example.implementacao.TocarMusica;

public class Alexa {

    private static Alexa instancia = new Alexa();

    private Alexa() {}

    public static Alexa getInstancia() {
        return instancia;
    }

    public void processarComando(String comando) {
        Comando cmd;
        switch (comando.toLowerCase()) {
            case "tocar música":
                cmd = new TocarMusica();
                break;
            case "apagar luz":
                cmd = new ApagarLuz();
                break;
            case "abrir janela":
                cmd = new AbrirJanela();
                break;
            default:
                System.out.println("Comando desconhecido.");
                return;
        }
        cmd.executar();
    }
}


