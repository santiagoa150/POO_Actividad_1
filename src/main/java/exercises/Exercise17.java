package exercises;

import java.util.Scanner;

public class Exercise17 {
    
    public void execute(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el radio de un círculo: ");
        this.validateDouble(sc);
        double radio = sc.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        
        System.out.println("");
        System.out.println("Usted está trabajando con una circunferencia de radio: " + radio);
        System.out.println("El área es: " + area);
        System.out.println("La longited de circunferencia es: " + perimetro);
    }
    
    private void validateDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Porfavor ingresa un número valido.");
            sc.next();
        }
    }
}
