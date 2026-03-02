package Ejercicio024;

import java.util.Scanner;

/*
Escribe un programa que lea un n�mero n e imprima una pir�mide de n�meros con n filas como en la siguiente figura:
1
121
12321
1234321
*/

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n=4;
        int acumulador = 0;
        double resultado = 0;
        for (int veces = 0; veces <n; veces++) {
            acumulador += Math.pow(10, veces);
            resultado= Math.pow(acumulador, 2);
            System.out.println((int)resultado);
            
        }
    }  
}
