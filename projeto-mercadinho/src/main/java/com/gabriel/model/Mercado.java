package com.gabriel.model;

import java.util.ArrayList;

public class Mercado {
    private int codigoMercado;
    private String nomeMercado;
    private ArrayList<Categoria> categorias;

    public Mercado(String nomeMercado) {
        this.categorias = new ArrayList<>();
    }

    public int getCodigoMercado() {
        return codigoMercado;
    }

    public void setCodigoMercado(int codigoMercado) {
        this.codigoMercado = codigoMercado;
    }

    public String getNomeMercado() {
        return nomeMercado;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);

    }

    public void removerCategoria(int codigoCategoria) {
        System.out.println(categorias.get(codigoCategoria).getNomeCategoria() + "Categoria foi Removido com SUCESSO!");
        categorias.remove(codigoCategoria);
    }

    public void apresenatarCategorias() {
        for (int i = 0; i < categorias.size(); i++) {
            System.out.println(
                    "Cdigo da categoria: " + i + " , Nome da categoria: " + categorias.get(i).getNomeCategoria());
        }
    }

    public void apresentarItems() {
        for (int i = 0; i < categorias.size(); i++) {
            ArrayList<Item> items = categorias.get(i).getItems();

            System.out.println("Categoria: " + i);
            for (int j = 0; j < items.size(); j++) {
                System.out.println("Nome: " + items.get(j).getNomeItem() + " Preço: " + items.get(j).getPreco());
            }

            System.out.println("");
        }
    }

    public void apresentarCategoriaItemPorCodigo(int codigoCategoria) {
        for (int i = 0; i < categorias.size(); i++) {
            if (codigoCategoria == 0) {
                for (int j = 0; j < categorias.get(0).getItems().size(); j++) {
                    System.out.println(categorias.get(0).getItems().get(j).getNomeItem());
                }
                i = categorias.size();

            } else if (codigoCategoria == 1) {
                for (int j = 0; j < categorias.get(1).getItems().size(); j++) {
                    System.out.println(categorias.get(1).getItems().get(j).getNomeItem());
                }
                i = categorias.size();

            } else if (codigoCategoria == 2) {
                for (int j = 0; j < categorias.get(2).getItems().size(); j++) {
                    System.out.println(categorias.get(2).getItems().get(j).getNomeItem());
                }
                i = categorias.size();
            }
        }
    }
}
