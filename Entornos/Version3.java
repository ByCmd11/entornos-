package Entornos;

import java.util.Scanner;

public class Version3 {
   
   /** 
    * 
    * @author Crsçisthian Mayoral Duran
    * @version 3.0
    * @param numero 
    */
   public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int numero;
    System.out.println("Introduzca un numero");
    numero=teclado.nextInt();

    System.out.println("El numero introducido es: "+numero);
   }
}


