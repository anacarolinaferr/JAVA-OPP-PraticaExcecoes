package com.javaopp4ex2;

import com.javaopp4ex2.model.PraticaExcecoes;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("------------------ Exercício 1-1 ---------------------");

        PraticaExcecoes.calculoQuociente();

        System.out.println("------------------ Exercício 1-2 ---------------------");

        PraticaExcecoes.dividir(300, 0);

        System.out.println("------------------ Exercício 2 ---------------------");

        PraticaExcecoes.exercicio2();

        System.out.println("------------------ Exercício 3 - IOException ---------------------");

        PraticaExcecoes.lerArquivo("AulaExcecoes");

        System.out.println("------------------ Exercício 3 - FileNotFoundException ---------------------");

        PraticaExcecoes.lerArquivo2("AulaExcecoes");

        System.out.println("------------------ Exercício 4 ---------------------");

        PraticaExcecoes.minimo(28d, 47d);
        PraticaExcecoes.maximo(25d, 68d);
        PraticaExcecoes.potencia(5d, 2d);
        PraticaExcecoes.cosseno(180d);
        PraticaExcecoes.raiz(25d);
        PraticaExcecoes.aleatorio();
    }
}
