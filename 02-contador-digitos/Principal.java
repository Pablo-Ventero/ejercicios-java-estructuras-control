package Ejercicio018;

import java.util.Scanner;
/*
Realiza un programa que nos diga cuantos digitos tiene 
un numero entero introducido por teclado
*/
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un n�mero: ");
        int num = teclado.nextInt();
        int numero = num;
        
        int contador = 1;
        while ((numero/10)!=0){
            contador++;
            numero= numero/10;
        }
        System.out.println("El numero "+num+" tiene: "+contador+" digitos");
    }
    
}
