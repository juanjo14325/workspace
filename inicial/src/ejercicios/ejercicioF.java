package ejercicios;

import java.util.Scanner;

public class ejercicioF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una coordenada (ejemplo: a1): ");
        String entrada = sc.nextLine();
        if (entrada.length() != 2) {
            System.out.println("Entrada inválida. Debe tener exactamente 2 caracteres.");
            return;
            
        }

        char col = entrada.charAt(0);
        char fila = entrada.charAt(1);
        
        if (col < 'a' || col > 'h' || fila < '1' || fila > '8') {
            System.out.println("Entrada inválida. La letra debe estar entre 'a' y 'h' y el número entre '1' y '8'.");
            return;
            
        }
        int letraNum = col - 'a' + 1;
        int numero = 8 -(fila - '0' + 1);
        System.out.println("Letra: " + " " + numero);


        
    }   
}
