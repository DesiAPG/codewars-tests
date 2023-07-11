package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Elaborar un algoritmo que permita ingresar 20 números y muestre todos los números menores e iguales a 25.  
public class TwentyFive {
    public void lowerThanTwentyFive() {
        Scanner scanner = new Scanner(System.in);
        int integers[] = new int[20];
        for (int i = 0; i < integers.length; i++) {
            System.out.print("Ingrese el " + i + " numero: ");
            integers[i] = scanner.nextInt();
        }
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] <= 25) {
                System.out.println(integers[i]);
            }
        }
    }
}
