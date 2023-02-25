package main;

import exercises.Exercise12;
import exercises.Exercise14;
import exercises.Exercise17;
import exercises.Exercise4;
import exercises.Exercise5;
import java.util.Scanner;

public class POO_ACTIVITY_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el indice del ejercicio: ");
        validateInt(sc);
        int option = sc.nextInt();
        System.out.println("");

        switch (option) {
            case 4:
                Exercise4 exc4 = new Exercise4();
                exc4.execute();
                break;
            case 5:
                Exercise5 exc5 = new Exercise5();
                exc5.execute();
                break;
            case 12:
                Exercise12 exc12 = new Exercise12();
                exc12.execute();
                break;
            case 14:
                Exercise14 exc14 = new Exercise14();
                exc14.execute();
                break;
            case 17:
                Exercise17 exc17 = new Exercise17();
                exc17.execute();
            default:
                System.out.println("Este indice no ejecuta ningún ejercicio: ");
                break;
        }
    }
    
    private static void validateInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Porfavor ingresa un número valido.");
            sc.next();
        }
    }
}
