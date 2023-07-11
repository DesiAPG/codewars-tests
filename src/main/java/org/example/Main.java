package org.example;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
// Un corredor de maratón (distancia 42,195 Km) ha recorrido la carrera en 2 horas 25 minutos
// Se desea un algoritmo que calcule el tiempo medio en minutos por Kilómetro.
        Scanner entrada = new Scanner(System.in);
        System.out.println("distancia recorrida de un atleta en km");

        //codigo quemado del ejemplo
        double numeroKilometros = 42.195;
        int horas = 2;
        int minutos = 25;
        int convertidorHorasMinutos;

        //System.out.println("numeroKilometros = " + numeroKilometros);

        convertidorHorasMinutos = (horas * 60) + minutos;
        //System.out.println("convertidorHorasMinutos = " + convertidorHorasMinutos);

        StringBuilder sb = new StringBuilder();
        sb.append(numeroKilometros).append("km\n").append(convertidorHorasMinutos + " min");
        System.out.println(sb);
        minutos = 0;
        char salida = 'y';
        System.out.println("ingrese la letra \'n\' para salir del programa");
        while (salida != 'n') {
            sb = new StringBuilder();
            System.out.println("ingrese los kilometros recorridos");
            numeroKilometros = Integer.valueOf(entrada.next());
            System.out.println("Ingrese las horas recorridas");
            horas = Integer.parseInt(entrada.next());
            System.out.println("Ingrese los minutos recorridos");
            minutos = entrada.nextInt();
            convertidorHorasMinutos = (horas * 60) + minutos;
            sb.append(numeroKilometros).append("km\n").append(convertidorHorasMinutos + " min");
            System.out.println(sb);

            System.out.println("desea continuar?");
            System.out.println("ingrese la letra \'n\' para salir del programa");
            salida = entrada.next().charAt(0);

            if (salida == 'n')
                System.out.println("ha terminado el programa");


        }
    }
}


