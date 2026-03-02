package Ejercicio021;

import java.util.Scanner;

/*
Escribe un programa que muestre, cuente y sume los m�ltiplos de 3 que hay entre 1 y un n�mero le�do por teclado.
*/
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un n�mero: ");
        int num = teclado.nextInt();
        
        int contador = 0;
        int acumulador = 0;
        for (int numascendente = 1; numascendente <= num; numascendente++) {
            if (numascendente % 3 == 0) {
                System.out.println(numascendente);
                contador++;
                acumulador+=numascendente;
            }
        }
    }    
}
