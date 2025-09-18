package ejercicios;

import java.util.Scanner;

public class ejercicioD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        String numero = sc.nextLine();

        System.out.print("Introduce un dígito: ");
        char digito = sc.nextLine().charAt(0);

        boolean encontrado = false;
        System.out.print("El dígito aparece en la(s) posición(es): ");
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == digito) {
                System.out.print((i + 1) + " ");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.print("ninguna");
        }
        System.out.println();
    }
}
