import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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