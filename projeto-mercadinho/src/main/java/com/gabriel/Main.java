package com.gabriel;

import com.gabriel.model.Categoria;
import com.gabriel.model.Item;
import com.gabriel.model.Mercado;

public class Main {
    public static void main(String[] args) {

        // categorias
        Categoria alimentos = new Categoria("Alimentos");
        Categoria higienePessoal = new Categoria("Higiene Pessoal ");
        Categoria higieneLar = new Categoria("Higiene do lar");

        // Items de alimentos
        Item feijaoCristal = new Item("Feijão Cristal", 19.99);
        Item feijaoKikaldo = new Item("Feijão KiKaldo", 7.99);

        alimentos.adicionarItem(feijaoCristal);
        alimentos.adicionarItem(feijaoKikaldo);

        // Items de higiene pessoal
        Item saboneteNivia = new Item("Sabão nivia", 1.99);
        Item saboneteOudora = new Item("Sabonete Eudora", 4.00);

        higienePessoal.adicionarItem(saboneteNivia);
        higienePessoal.adicionarItem(saboneteOudora);

        // Items de higiene do lar
        Item amaciante = new Item("Amaciante OMO", 17.99);
        Item sabaoEmPo = new Item("Sabão em pó", 8.99);

        higieneLar.adicionarItem(sabaoEmPo);
        higieneLar.adicionarItem(amaciante);

        // mercados
        Mercado precoBaixo = new Mercado(" Mercado Preço Baixo");
        precoBaixo.adicionarCategoria(alimentos);
        precoBaixo.adicionarCategoria(higieneLar);
        precoBaixo.adicionarCategoria(higienePessoal);

        System.out.println("");

        System.out.println("Categorias Cadastradas: ");
        precoBaixo.apresenatarCategorias();

        System.out.println("");

        System.out.println("Apresentar todos os itens: ");
        precoBaixo.apresentarItems();

    }
}
