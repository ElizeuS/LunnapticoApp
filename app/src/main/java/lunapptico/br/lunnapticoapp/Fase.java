package lunapptico.br.lunnapticoapp;

import java.util.ArrayList;

/**
 * Created by Elizeu on 03/02/2017.
 */

public class Fase {
    private int opcoes[];
    private int pontuacao;
    private String nome_jogador;

    public Fase(){

    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int[] getOpcoes() {
        return opcoes;
    }

    public String getNome_jogador() {
        return nome_jogador;
    }

    public void setOpcoes(int[] opcoes) {
        this.opcoes = opcoes;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setNome_jogador(String nome_jogador) {
        this.nome_jogador = nome_jogador;
    }
}
