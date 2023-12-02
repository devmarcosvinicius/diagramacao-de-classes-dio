package com.marcosviniciusdev.model;

import com.marcosviniciusdev.interfaces.AparelhoTelefonico;
import com.marcosviniciusdev.interfaces.NavegadorInternet;
import com.marcosviniciusdev.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String cor;
    private int memoria;

    public Iphone(String cor, int memoria) {
        this.cor = cor;
        this.memoria = memoria;
    }

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

    public void ligar() {

    }

    public void atender() {

    }

    public void iniciarCorreioVoz() {

    }

    public void exibirPagina() {

    }

    public void adicionarNovaAba() {

    }

    public void atualizarPagina() {

    }

    public void tocar() {

    }

    public void pausar() {

    }

    public void selecionarMusica() {

    }
}
