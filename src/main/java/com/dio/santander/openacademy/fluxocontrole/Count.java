package com.dio.santander.openacademy.fluxocontrole;

public class Count {

    public void run(int numberA, int numberB) {
        try {
            if(numberA >= numberB) {
                throw new ParametrosInvalidosException("O primeiro valor deve ser menor que o segundo");
            }
            int maxCounting = numberB - numberA;
            for(int i = 1; i <= maxCounting; i++) {
                System.out.println("Contando: " + i);
            }

        }catch(ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("Programa finalizado!");
        }
    }
}
