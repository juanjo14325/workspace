package ejercicios;
import java.util.Scanner;
public class ejercicioB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base imponible del producto ");
        Double baseI = sc.nextDouble();
        System.out.println("Introduce el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = sc.next();
        System.out.println("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigo = sc.next();
        
        if (tipoIVA.equalsIgnoreCase("general")) {

            baseI = baseI * 0.21 + baseI;
            
        }else if (tipoIVA.equalsIgnoreCase("reducido")) {

            baseI = baseI * 0.10 + baseI;

        }else if (tipoIVA.equalsIgnoreCase("superreducido")) {

            baseI = baseI * 0.04 + baseI;
        
        }
        
        if (codigo.equalsIgnoreCase("mitad")) {
            
            baseI = baseI/2;
            
        }else if (codigo.equalsIgnoreCase("meno5")) {
            
            baseI = baseI - 5;
        }else if (codigo.equalsIgnoreCase("5porc")) {

            baseI = baseI - (baseI * 0.05);
        }
        System.out.println("Total: " + baseI);
    }
    
}
