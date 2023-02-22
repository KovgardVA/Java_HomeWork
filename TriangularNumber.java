/**
 * TriangularNumber
 */
import java.util.Scanner;

public class TriangularNumber {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getNumberFromUser("Введите порядковый номер треугольного числа: ");
        int result = getTriangularNumber(n);
        System.out.printf("Треугольное число, стоящее под номером %d, равно %d.", n, result);
    }

    public static int getNumberFromUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    public static int getTriangularNumber(int number) {
        return number * (number + 1) / 2;
    }
}

// 1. Получение порядка числа от пользователя
// 2. Вычисение числа по формуле
// 3. Вывод треугольного числа