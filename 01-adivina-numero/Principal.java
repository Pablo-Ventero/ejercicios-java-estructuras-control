package Ejercicio013;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int aleatorio = (int) (Math.ceil(Math.random() * 10));
        
        System.out.println("Introduce un número del 1 al 10: ");
        int num = teclado.nextInt();
        int contador = 1;
        
        while (num != aleatorio) {
            System.out.println("No has acertado, te doy otro intento");
            System.out.println("Dime otro número: ");
            num = teclado.nextInt();
            contador++;
        }
        
        System.out.println("¡Has acertado el número: " + aleatorio + "!");
        System.out.println("Intentos: " + contador);
    }
}
