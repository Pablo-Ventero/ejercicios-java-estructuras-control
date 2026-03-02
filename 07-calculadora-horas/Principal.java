package Ejercicio027;

import java.util.Scanner;

/*
 Realiza un programa que calcule las horas transcurridas entre dos horas de dos d�as de la semana. 
No se tendr�n en cuenta los minutos ni los segundos.
El d�a de la semana se puede pedir como un n�mero (del 1 al 7) o como una cadena
(de �lunes� a �domingo�). Se debe comprobar que el usuario introduce los datos correctamente
y que el segundo d�a es posterior al primero.
Ejemplo: Por favor, introduzca la primera hora.
D�a: lunes
Hora: 18
Por favor, introduzca la segunda hora.
D�a: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
*/

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el primer dia y hora de la semana: ");
        int diaprim=teclado.nextInt();
        int horaprim=teclado.nextInt();
        System.out.println("Introduce el segundo dia y hora de la semana: ");
        int diaseg=teclado.nextInt();
        int horaseg=teclado.nextInt();
        int horas = 0;
        
        for (int diasem = diaprim; diasem <= diaseg; diasem++) {
            if (diasem == diaprim) {
                horas = 24 - horaprim;
            } else if (diasem == diaseg) {
                horas += horaseg;
            } else {
                horas += 24;
            }
        }
        System.out.println("Horas totales: "+horas);
    }  
}
