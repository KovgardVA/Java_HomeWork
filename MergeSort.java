public class MergeSort {
    public static void main(String[] args) {
        
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        return array;
    }

    public static void fill(int[] array, int minNumber, int maxNumber) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * ((maxNumber - minNumber) + 1)) + minNumber);
        }
    }

    public static String print(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        return result;
    }
}

// 1. Создание массива
// 2. Заполнение данными
// 3. Печать
// 4. Сортировка слиянием
// 4.1 Разделение массива на две половины
// 4.2 Объединение в один упорядоченный массив