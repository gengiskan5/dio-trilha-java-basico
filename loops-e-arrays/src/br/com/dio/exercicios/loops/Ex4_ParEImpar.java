package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int qtdImpares = 0, qtdPares = 0;




        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)qtdPares++;
            else qtdImpares++;

            count++;

        }while (count < quantNumeros);

        System.out.println("Quantidade Par: " + qtdPares);
        System.out.println("Quantidade ImPar: " + qtdImpares);


    }
}
