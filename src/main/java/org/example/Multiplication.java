package org.example;

import java.util.Scanner;

public class Multiplication {
    public void multiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabla de multiplicar decreciente del número " + numero + ":");

            for (int i = 10; i >= 1; i--) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("El número ingresado está fuera del rango válido.");
        }
    }
}
