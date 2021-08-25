package com.javaopp4ex2;

import com.javaopp4ex2.model.PraticaExcecoes;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("------------------Exercício 1-1 ---------------------");

        PraticaExcecoes.calculoQuociente();

        System.out.println("------------------Exercício 2---------------------");

        PraticaExcecoes.exercicio2();

        System.out.println("------------------Exercício 3 - IOException ---------------------");

        PraticaExcecoes.lerArquivo("AulaExcecoes");

        System.out.println("------------------Exercício 3 - FileNotFoundException ---------------------");

        PraticaExcecoes.lerArquivo2("AulaExcecoes");

        System.out.println("------------------Exercício 4 ---------------------");

        PraticaExcecoes.minimo();
        PraticaExcecoes.maximo();
        PraticaExcecoes.potencia();
        PraticaExcecoes.cosseno();
        PraticaExcecoes.raiz();
        PraticaExcecoes.aleatorio();

        System.out.println("------------------Exercício 1-2 ---------------------");

        PraticaExcecoes.dividir(300, 0);
    }
}
