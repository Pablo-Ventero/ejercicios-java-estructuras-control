package Ejercicio029;

import java.util.Scanner;

/*
Escribe un programa que muestre los n primeros t�rminos de la serie de Fibonacci. 
El primer t�rmino de la serie de Fibonacci es 1, el segundo es 1 y el resto 
se calcula sumando los dos anteriores, por lo que tendr�amos que los t�rminos 
son 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144� 
El n�mero n se debe introducir por teclado.
*/

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cuantos terminos de la serie Fibonacci quieres que aparezcan: ");
        int rep = teclado.nextInt();
        int anterior = 0;
        int actual = 1;
        
        for (int veces = 0; veces <= rep; veces++) {
            System.out.println(actual + "");
            int siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
    } 
}
