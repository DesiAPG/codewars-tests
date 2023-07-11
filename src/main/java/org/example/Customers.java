package org.example;

import java.util.Scanner;

public class Customers {
    public void customers() {
        double descuento = 0.2;
        double totalPagos = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el numero de clientes: ");
        int cantidadClientes = scanner.nextInt();

        System.out.println("Registro de consumo de los clientes: ");

        for (int i = 1; i <= cantidadClientes; i++) {
            System.out.println("Cliente #" + i);
            System.out.print("Ingrese el consumo del cliente en pesos: $");
            double consumo = scanner.nextDouble();

            double pago = consumo;

            if (consumo > 50000) {
                double descuentoAplicado = consumo * descuento;
                pago = consumo - descuentoAplicado;
                System.out.println("Descuento aplicado: $" + descuentoAplicado + " pesos");
            }

            System.out.println("Pago del cliente: $" + pago + " pesos");
            totalPagos += pago;
            System.out.println("-------------------------");
        }

        System.out.println("Total de todos los pagos: " + totalPagos + " pesos");
    }
}
