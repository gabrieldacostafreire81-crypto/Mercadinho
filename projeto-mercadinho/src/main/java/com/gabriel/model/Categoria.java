package com.gabriel.model;

import java.util.ArrayList;

public class Categoria {
    private int codigoCategoria;
    private String nomeCategoria;
    private ArrayList<Item> items;

    public Categoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
        this.items = new ArrayList<>();

    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public void adicionarItem(Item item) {
        items.add(item);
    }

    public void removerItem(int codigoItem) {
        System.out.println(items.get(codigoItem).getNomeItem() + "Removido da categoria com sucesso!");
        items.remove(codigoItem);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

}
