package com.dio.santander.openacademy.fluxocontrole;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    Count count = new Count();

    public Main() {
        this.scanner = scanner;
        this.count = count;
    }

    public void start() {
        System.out.println("Please, insert a number: ");
        int numberA = this.scanner.nextInt();

        System.out.println("Please, insert another number: ");
        int numberB = this.scanner.nextInt();

        this.count.run(numberA, numberB);
    }

    public static void main (String[] args){
        Main main = new Main();
        main.start();
    }
}