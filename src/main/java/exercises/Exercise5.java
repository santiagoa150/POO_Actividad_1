package exercises;

import java.util.Scanner;

public class Exercise5 {
    
    public void execute(){
        Scanner sc = new Scanner(System.in);
        double suma = 0, x, y;
        
        System.out.println("Por favor ingrese un valor para X: ");
        validateDouble(sc);
        x = sc.nextDouble();
        
        suma = suma + x;
        
        System.out.println("Por favor ingrese un valor para Y: ");
        validateDouble(sc);
        y = sc.nextDouble();
        
        x = x  + Math.pow(y, 2);
        
        suma = suma + (x / y);
        
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }
    
    private static void validateDouble(Scanner sc){
        while(!sc.hasNextDouble()){
            System.out.println("Porfavor ingresa un número valido.");
            sc.next();
        }
    }
}