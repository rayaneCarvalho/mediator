package org.example.mediador;

import org.example.implementacao.SistemaDeControle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @BeforeEach
    void setup() {
        SistemaDeControle.resetar(); // Reseta o estado antes de cada teste
    }

    @Test
    void deveTocarMusica() {
        Usuario usuario = new Usuario();
        usuario.darComando("Tocar música");
        assertTrue(SistemaDeControle.isMusicaTocando(), "A música não está tocando.");
    }

    @Test
    void deveApagarLuz() {
        Usuario usuario = new Usuario();
        usuario.darComando("Apagar luz");
        assertTrue(SistemaDeControle.isLuzApagada(), "A luz não foi apagada.");
    }

    @Test
    void deveAbrirJanela() {
        Usuario usuario = new Usuario();
        usuario.darComando("Abrir janela");
        assertTrue(SistemaDeControle.isJanelaAberta(), "A janela não foi aberta.");
    }

    @Test
    void deveComandoDesconhecido() {
        Usuario usuario = new Usuario();
        usuario.darComando("Abrir porta");
        // Nenhum estado deve mudar para um comando desconhecido
        assertFalse(SistemaDeControle.isMusicaTocando(), "A música não deve estar tocando.");
        assertFalse(SistemaDeControle.isLuzApagada(), "A luz não deve estar apagada.");
        assertFalse(SistemaDeControle.isJanelaAberta(), "A janela não deve estar aberta.");
    }
}
