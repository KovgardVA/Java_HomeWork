public class MergeSort {
    public static void main(String[] args) {
        int[] myArray = createArray(8);
        fill(myArray, 10, 20);
        System.out.println(print(myArray));
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

    public static void mergeSort(int[] array) {
        int size = array.length;

        if (size < 2) return;

        int mid = size / 2;

        int[] leftSide = new int[mid];
        System.arraycopy(array, 0, leftSide, 0, mid);

        int[] rightSide = new int[size - mid];
        System.arraycopy(array, mid, rightSide, 0, size - mid);

        mergeSort(leftSide);
        mergeSort(rightSide);

        merge(array, leftSide, rightSide);
    }

    public static void merge(int[] array, int[] leftSide, int[] rightSide) {
        int sizeL = leftSide.length;
        int sizeR = rightSide.length;

        int i = 0, j = 0, k = 0;
        while (i < sizeL && j < sizeR) {
            if (leftSide[i] <= rightSide[j]) {
                array[k++] = leftSide[i++];
            }
            else {
                array[k++] = rightSide[j++];
            }
        }
        while (i < sizeL) {
            array[k++] = leftSide[i++];
        }
        while (j < sizeR) {
            array[k++] = rightSide[j++];
        }
    }
}

// 1. Создание массива
// 2. Заполнение данными
// 3. Печать
// 4. Сортировка слиянием
// 4.1 Разделение массива на две половины
// 4.2 Объединение в один упорядоченный массив