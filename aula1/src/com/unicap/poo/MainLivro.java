package com.unicap.poo;

import com.unicap.poo.Livro;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.ano = 2002;
        livro.titulo = "Um livro";
        livro.autor = "fulano";

        Livro livro2 = new Livro();

        livro2.ano = 2002;
        livro2.titulo = "Um livro";
        livro2.autor = "fulano";

        Livro livro3 = new Livro();

        livro3.ano = 2002;
        livro3.titulo = "Um livro";
        livro3.autor = "fulano";

        System.out.println(livro.ano + livro.titulo + livro.autor);
        System.out.println(livro2.ano + livro2.titulo + livro2.autor);
        System.out.println(livro3.ano + livro3.titulo + livro3.autor);
    }
}
