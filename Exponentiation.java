import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exponentiation {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
    }

    // Считывание информации с файла
    public static String read(String path) throws FileNotFoundException, IOException{
        String data = "";
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            data = sb.toString();
        }
        finally {
            br.close();
        }
        return data;
    }

    // Убираем все лишнее, оставляем символы и буквы
    public static String clean(String data) {
        return data.replaceAll("[^\\w+]", "");
    }

    // Обработка информации в соответствии с условием
    public static int[] getNumbers(String data) {
        int[] numberAndPower = new int[2];
        char[] charArray = data.toCharArray();

        if (charArray[0] == 'a') {
            numberAndPower[0] = Integer.parseInt(String.valueOf(charArray[1]));
            numberAndPower[1] = Integer.parseInt(String.valueOf(charArray[3]));
        } else {
            numberAndPower[0] = Integer.parseInt(String.valueOf(charArray[3]));
            numberAndPower[1] = Integer.parseInt(String.valueOf(charArray[1]));
        }

        return numberAndPower;
    }

    // Возведение в степень
    public static double power(double num, int pow) {
        if (num == 0 && pow <= 0) System.out.println("Не определено.");
        if (num == 1 || num == 0) return num;
        if (pow > 1) return num * (power(num, --pow));
        if (pow < 1) return 1 / num * power(num, ++pow);
        return num;
    }

    // Получение форматированной строки для записи в файл
    public static String formatToUse(double number) {
        NumberFormat nf = new DecimalFormat();
        return String.valueOf(nf.format(number));
    }

    // Запись в файл
    public static void write(String data) {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.write(data);
            fw.flush();
            } catch (IOException ex) {
            System.out.println(ex.getMessage());
            }
    }
}

// 1. Считывание строки с файла
// 2. Обработка строки с учетом задачи
// 3. Возведение в степень
// 3.1 В положительную степень
// 3.2 В отрицательную степень
// 3.3 В первую степень
// 3.4 В нулевую степень
// 3.5 Исключения
// (?) Создание файла
// 4. Запись вывода в файл