public class HeapSort {
    public static void main(String[] args) {
        
    }
    
    public static int getLeft(int index) {
        return (2 * index + 1);
    }
    
    public static int getRight(int index) {
        return (2 * index + 2);
    }
}

/*  Двоичная куча 
         4(0)
        /   \
    10(1)    3(2)
    /   \
5(3)    1(4) */

// Левый элемент - 2i + 1
// Правый элемент - 2i + 2

// 1. Heapify - создание из массива максимальной двоичной кучи
// 1.1. Swap - меняем элементы местами
// 1.2. Left - возвращает левый элемент двоичного дерева
// 1.3. Right - возвращает правый элемент
// 2. Сортировка (pop + heapify)
// 2.1 Pop - меняем первый и последний элемент кучи местами и "отсекаем"
// 3. Вывод