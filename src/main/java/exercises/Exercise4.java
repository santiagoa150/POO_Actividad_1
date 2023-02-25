package exercises;

import java.util.Scanner;

public class Exercise4 {

    public void execute(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es la edad de Juan?");
        this.validateInt(sc);
        
        int edadJuan = sc.nextInt();
        int edadAlberto = (2 * edadJuan) / 3;
        int edadAna = (4 * edadJuan) / 3;
        int edadMama = edadJuan + edadAlberto + edadAna;
        
        System.out.println("Las edades son: ");
        System.out.println("Juan: " + edadJuan);
        System.out.println("Alberto: " + edadAlberto);
        System.out.println("Ana: " + edadAna);
        System.out.println("Mamá: " + edadMama);
    }
    
    private void validateInt(Scanner sc){
        while(!sc.hasNextInt()){
            System.out.println("Porfavor ingresa un número valido.");
            sc.next();
        }
    }
}