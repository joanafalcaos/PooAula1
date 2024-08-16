package com.unicap.poo;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto.nome = "Bola";
        produto.categoria = "Objeto";
        produto.preco = 10;

        produto1.nome = "Pente";
        produto1.categoria = "Objeto";
        produto1.preco = 3;

        produto2.nome = "Lapis";
        produto2.categoria = "Objeto";
        produto2.preco = 8;

        System.out.println(produto.nome + " " + produto.categoria + " " + produto.preco);
    }

}
