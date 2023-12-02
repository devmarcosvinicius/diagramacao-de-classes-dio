package com.marcosviniciusdev.model;

import com.marcosviniciusdev.interfaces.AparelhoTelefonico;
import com.marcosviniciusdev.interfaces.NavegadorInternet;
import com.marcosviniciusdev.interfaces.ReprodutorMusical;

import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String cor;
    private int memoria;
    private boolean isReproduzindoMusica;
    private String nomeMusica;
    private boolean isLigado;
    private boolean isChamada;
    private boolean isCorreioVoz;
    private String paginaAtual;
    private List<String> paginas;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public boolean isReproduzindoMusica() {
        return isReproduzindoMusica;
    }

    public void setReproduzindoMusica(boolean reproduzindoMusica) {
        isReproduzindoMusica = reproduzindoMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public boolean isChamada() {
        return isChamada;
    }

    public void setChamada(boolean chamada) {
        isChamada = chamada;
    }

    public boolean isCorreioVoz() {
        return isCorreioVoz;
    }

    public void setCorreioVoz(boolean correioVoz) {
        isCorreioVoz = correioVoz;
    }

    public String getPaginaAtual() {
        return paginaAtual;
    }

    @Override
    public void ligar() {
        if (!isLigado()) {
            this.setLigado(true);
            System.out.println("O Iphone foi ligado.");
        } else {
            this.setLigado(false);
            System.out.println("O Iphone foi desligado.");
        }
    }

    @Override
    public void atender() {
        if (!isChamada) {
            this.setChamada(true);
            System.out.println("A chamada foi atendida.");
        } else {
            this.setChamada(false);
            System.out.println("A chamada foi desligada.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (!isCorreioVoz()) {
            this.setCorreioVoz(true);
            System.out.println("O correio de voz foi iniciado.");
        } else {
            this.setCorreioVoz(false);
            System.out.println("O correio de voz foi finalizado.");
        }
    }

    @Override
    public void exibirPagina() {
        if (!paginaAtual.isEmpty()){
            System.out.println("A pagina atual é " + this.getPaginaAtual());
        } else {
            System.out.println("Não há nenhuma pagina aberta.");
        }
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        paginas.add(pagina);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A pagina " + this.getPaginaAtual() + " foi atualizada.");
    }

    @Override
    public void tocar() {
        if (!isReproduzindoMusica()) {
            System.out.println("A musica começou a tocar.");
        } else {
            System.out.println("A musica já está tocando.");
        }
    }

    @Override
    public void pausar() {
        if (isReproduzindoMusica) {
            System.out.println("A musica foi pausada.");
        } else {
            System.out.println("A musica já está em pausa.");
        }
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        this.setNomeMusica(nomeMusica);
        System.out.println("A musica " + this.getNomeMusica() + " foi selecionada.");
    }
}
