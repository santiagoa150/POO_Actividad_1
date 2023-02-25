package exercises;

import java.util.Scanner;

public class Exercise14 {

    public void execute() {
        Scanner sc = new Scanner(System.in);

        double number, cuadrado, cubo;

        System.out.println("Por favor ingrese un número cualquiera: ");
        this.validateDouble(sc);
        number = sc.nextDouble();

        cuadrado = Math.pow(number, 2);
        cubo = Math.pow(number, 3);

        System.out.println("El cuadrado de " + number + " es: " + cuadrado);
        System.out.println("El cubo de " + number + " es: " + cubo);
    }

    private void validateDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Porfavor ingresa un número valido.");
            sc.next();
        }
    }
}
