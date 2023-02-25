package exercises;

import java.util.Scanner;

public class Exercise12 {

    public void execute() {
        Scanner sc = new Scanner(System.in);
        double hours, hourPrice, grossSalary, retention, netSalary, rawPercentage, percentage;
        System.out.println("===================================");
        System.out.println("¡Bienvenido al sistema de salarios!");
        System.out.println("===================================");

        System.out.println("Por favor ingrese las horas trabajadas a la semana: ");
        this.validateDouble(sc);
        hours = sc.nextDouble();

        System.out.println("Por favor ingrese el precio por hora: ");
        this.validateDouble(sc);
        hourPrice = sc.nextDouble();

        System.out.println("Por favor ingrese el porcentage de retención en la fuente: ");
        System.out.println("Si su porcentaje es 10.523 % ingrese: 10.523 ");
        this.validateDouble(sc);
        rawPercentage = sc.nextDouble();
        percentage = rawPercentage / 100;

        grossSalary = hours * hourPrice;
        retention = grossSalary * percentage;
        netSalary = grossSalary - retention;

        System.out.println("El salario bruto corresponde a: " + grossSalary);
        System.out.println("Con una retención de: " + retention);
        System.out.println("Y un salario neto igual a: " + netSalary);
    }

    private void validateDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Porfavor ingresa un número valido.");
            sc.next();
        }
    }
}
