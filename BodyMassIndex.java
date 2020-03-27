// package Blok_4_Testability.Z2_Bmi; //Заменить на свой (Для IDEA)

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес в килогаммах:");
        int wight = scanner.nextInt();
        System.out.println("Введите рост в сантиметрах:");
        int height = scanner.nextInt();

        BmiService service = new BmiService();
        double bmi = service.calculate(wight, height);
        System.out.format("Индекс массы тела равен: " + "%.1f", bmi);
    }
}
