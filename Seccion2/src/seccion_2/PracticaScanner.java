package seccion_2;

import java.util.Scanner;

public class PracticaScanner {
    public static void main(String[] args) {
        System.out.println("Ingrese un nombre: ");
        Scanner data = new Scanner(System.in);
        String nombre = data.nextLine();
        System.out.println("Usuario: "+nombre);
        System.out.println("Ingrese su titulo: ");
        String titulo = data.nextLine();
        System.out.println("Titulo: "+titulo);
        System.out.println("Bienvenido: "+titulo+" "+nombre);


    }

}
