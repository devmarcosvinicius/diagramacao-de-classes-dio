package com.marcosviniciusdev.model;

public class Iphone {

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
}
