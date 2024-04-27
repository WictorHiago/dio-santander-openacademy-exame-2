package com.dio.santander.openacademy.fluxocontrole;

import java.util.Scanner;

public class Main {

    public int soma(int a, int b) {
        return a + b;
    }

    public void saudacao () {
        System.out.println("Por favor, digite seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Ola, " + nome + "!" + "\nBom dia!");

    }

    public static void main(String[] args) {

        Main main = new Main();
        main.saudacao();
    }
}