package org.example;

import java.util.Scanner;

public class NumberToN {
    public void numberToN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo N: ");
        int N = scanner.nextInt();

        long producto = 1;

        for (int i = 1; i <= N; i++) {
            producto *= i;
        }

        System.out.println("El producto desde 1 hasta " + N + " es: " + producto);
    }
}
