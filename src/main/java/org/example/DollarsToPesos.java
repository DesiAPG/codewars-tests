package org.example;

import java.util.Scanner;

public class DollarsToPesos {
    public void dollarsToPesos() {
        int cantidadCamisas = 5;
        double valorDolar = 4200;
        double totalVenta = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los precios de las " + cantidadCamisas + " camisas en dólares:");

        // Sumar los precios de las camisas en dólares
        for (int i = 0; i < cantidadCamisas; i++) {
            double precioDolares = scanner.nextDouble();
            totalVenta += precioDolares;
        }

        // Calcular el total de la venta en pesos
        double totalPesos = totalVenta * valorDolar;

        System.out.println("El total de la venta es: " + totalPesos + " pesos.");
    }
}
