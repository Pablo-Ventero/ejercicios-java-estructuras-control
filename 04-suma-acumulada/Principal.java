package Ejercicio023;

import java.util.Scanner;

/*
Escribe un programa que permita ir introduciendo una serie indeterminada 
de n�meros mientras su suma no supere el valor 10000. 
Cuando esto �ltimo ocurra, se debe mostrar el total acumulado, 
el contador de los n�meros introducidos y la media.
*/

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        int fin= 10000;
        int acumulador = 0;
        int contador = 0;
       
        while(acumulador<fin) {
            System.out.println("Introduce un n�mero: ");
            int numero = teclado.nextInt();
            contador++;
            acumulador+=numero;
        }
        System.out.println("Acumulado: "+acumulador);
        System.out.println("Cantidad de n�meros: "+contador);
        double media= acumulador/contador;
        System.out.println("Media: "+ media);
    }
    
}
