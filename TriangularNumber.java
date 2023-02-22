/**
 * TriangularNumber
 */
import java.util.Scanner;

public class TriangularNumber {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    public static int getNumberFromUser(String text) {
        System.out.println(text);
        return input.nextInt();
    }
}

// 1. Получение порядка числа от пользователя
// 2. Вычисение числа по формуле
// 3. Вывод треугольного числа