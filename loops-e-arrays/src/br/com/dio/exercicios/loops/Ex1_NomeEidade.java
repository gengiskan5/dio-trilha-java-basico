package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true){

            System.out.println("nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("idade: ");
            idade = scan.nextInt();
        }

        System.out.println("continua Aqui...");

    }
}