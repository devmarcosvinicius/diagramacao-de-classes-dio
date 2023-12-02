package com.marcosviniciusdev.model;

import com.marcosviniciusdev.interfaces.AparelhoTelefonico;
import com.marcosviniciusdev.interfaces.NavegadorInternet;
import com.marcosviniciusdev.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String cor;
    private int memoria;
    private boolean isReproduzindoMusica;
    private String nomeMusica;
    private boolean isLigado;
    private boolean isChamada;
    private boolean isCorreioVoz;

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

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica() {

    }
}
