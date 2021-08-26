package com.javaopp4ex2.model;

import java.io.*;

public class PraticaExcecoes extends RuntimeException {

    public static void calculoQuociente() {
        int a = 0;
        int b = 300;

        try {
            int quociente = b / a;
        } catch (ArithmeticException ex) {
            System.out.println("Ocorreu um erro:" + ex.getMessage());
        } finally {
            System.out.println("Não pode ser dividido por zero");
        }
    }

    public static void dividir(int a, int b) {
        try {
            if (b == 0) {
                throw new IllegalArgumentException();
            } else {
                double result = a / b;
                System.out.println(result);
            }
        } catch (IllegalArgumentException il) {
            System.out.println("Não pode ser dividido por zero!");
        }
    }

    public static void exercicio2() {
        String mensagemFinal = "Esta é a última mensagem";
        try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(mensagemFinal);
        }
    }

    public static void lerArquivo(String nomeArquivo) throws IOException {

        try {
            String texto = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo especificado");
        }
    }

    public static void lerArquivo2(String nomeArquivo) throws IOException {
        try {
            String texto = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo especificado não foi encontrado");
        }
    }

    public static void maximo(double a, double b) {
        System.out.printf("Máximo entre " + a + " e " + b + " => %.0f\n", Math.max(a, b));
    }

    public static void minimo(double a, double b) {
        System.out.printf("Mínimo entre " + a + " e " + b + " => %.0f\n", Math.min(a, b));
    }

    public static void potencia(double a, double b) {
        System.out.printf("Potência de " + a + " e " + b + " => %.0f\n", Math.pow(a, b));
    }

    public static void cosseno(double a) {
        a = Math.toRadians(a);
        System.out.printf("Cosseno Math.cos(" + a + ") => %.0f\n", Math.cos(a));
    }

    public static void raiz(double a) {
        System.out.printf("Raiz de " + a + "=> %.0f\n", Math.sqrt(a));
    }

    public static void aleatorio() {
        double numeroAleatorio = Math.random() * 1000;
        System.out.printf("Número aleatório de 1 a 999 => %.0f\n", numeroAleatorio);
    }
}
