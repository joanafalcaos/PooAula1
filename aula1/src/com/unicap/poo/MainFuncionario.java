package com.unicap.poo;

public class MainFuncionario {
    public static void main(String [] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.nome = "José";
        funcionario1.departamento = "Financeiro";
        funcionario1.salario = 1000;

        funcionario2.nome = "Maria";
        funcionario2.departamento = "Comercial";
        funcionario2.salario = 3000;

        funcionario3.nome = "Carlos";
        funcionario3.departamento = "TI";
        funcionario3.salario = 3000;

        System.out.println(funcionario1.nome + " é do departamento de " + funcionario1.departamento + " e recebe " + funcionario1.salario);
        System.out.println(funcionario2.nome + " é do departamento de " + funcionario2.departamento + " e recebe " + funcionario2.salario);
        System.out.println(funcionario3.nome + " é do departamento de " + funcionario3.departamento + " e recebe " + funcionario3.salario);

    }
}
