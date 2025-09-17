package ejercicios;

import java.util.Scanner;

public class ejercicioA {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Has introducido: " + nota1);
        
        System.out.print("Introduce la nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Has introducido: " + nota2);

        scanner.nextLine(); // Limpiar el buffer antes de leer la siguiente línea
        Double media = (nota1 + nota2) / 2;
        System.out.println("La media es: " + media);

        if (media >= 5) {
            System.out.println("Tu npta de programacion es: " + media + " , APTO");
        } else {
            scanner.nextLine(); // Limpiar el buffer antes de leer la siguiente línea
            System.out.print("¿La recuperación ha sido apto o no apto? ");
            String recuperacion = scanner.nextLine();
            if (recuperacion.equalsIgnoreCase("apto")) {
            System.out.println("Tu nota de programación es: 5 , Aprobado por recuperación");
            } else {
            System.out.println("Tu nota de programacion es: " + media + " , NO APTO");
            }
        }
    }
}
