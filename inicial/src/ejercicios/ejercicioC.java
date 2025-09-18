package ejercicios;

import java.util.Scanner;

public class ejercicioC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int maxPar = Integer.MIN_VALUE;
        double mediaImpar = 0;
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int contImpar = 0;
        while (num > 0) {
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            cont++;
            if (num % 2 != 0){
                contImpar++;
                mediaImpar = (mediaImpar + num);
                mediaImpar = mediaImpar / contImpar;
            }else{
                if (num > maxPar){
                    maxPar = num;
                }
            }
        }
        System.out.println("Total de numeros: " + cont);
        System.out.println("Maximo par: " + maxPar);
        System.out.println("Media de impares: " + mediaImpar);
        sc.close();
    }
}
