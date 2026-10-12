package com.gabriel.model;

public class Item {
    private int codigoItem;
    private String nomeItem;
    private double preco;

    public Item(String nomeItem, double preco) {
        this.nomeItem = nomeItem;
        this.preco = preco;

    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
