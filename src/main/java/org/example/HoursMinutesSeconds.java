package org.example;

import java.util.Scanner;

public class HoursMinutesSeconds {
    public void hoursMinutesSeconds() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la hora (0-23): ");
        int hora = scanner.nextInt();

        System.out.print("Ingrese los minutos (0-59): ");
        int minutos = scanner.nextInt();

        System.out.print("Ingrese los segundos (0-59): ");
        int segundos = scanner.nextInt();

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;

            if (minutos == 60) {
                minutos = 0;
                hora++;

                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        System.out.println("La hora en el siguiente segundo es: " + hora + ":" + minutos + ":" + segundos);
    }
}
