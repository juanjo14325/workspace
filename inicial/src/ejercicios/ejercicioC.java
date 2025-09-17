package ejercicios;

import java.util.Scanner;

public class ejercicioC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int contPar = 0;
        int contImpar = 0;

        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        while (num > 0) {
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            cont++;
            if (num % 2 != 0){
                                
            }
        }
        System.out.println("Total de numeros: " + cont);
    }
}
