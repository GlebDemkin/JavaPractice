import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        /*
         * Класс Arrays содержит статические методы для работы с массивами.
         * Методы вызываются через имя класса: Arrays.methodName(...).
         */
        int[] numbers = {5, 2, 9, 1, 3};
        int[] sameNumbers = {1, 2, 3, 5, 9};
        int[] otherNumbers = {1, 2, 4, 5, 9};

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(numbers));

        /*
         * sort() сортирует исходный массив.
         * Метод ничего не возвращает, а изменяет сам массив.
         */
        Arrays.sort(numbers);

        System.out.println("\nПосле Arrays.sort(numbers):");
        System.out.println(Arrays.toString(numbers));

        /*
         * binarySearch() выполняет бинарный поиск.
         * Перед использованием массив должен быть отсортирован.
         * Если элемент найден, возвращается его индекс.
         */
        int index = Arrays.binarySearch(numbers, 5);

        System.out.println("\nArrays.binarySearch(numbers, 5):");
        System.out.println("Индекс элемента 5: " + index);

        /*
         * equals() сравнивает массивы по содержимому.
         * Если длина и элементы массивов одинаковые, результат будет true.
         */
        boolean equalsResult = Arrays.equals(numbers, sameNumbers);

        System.out.println("\nArrays.equals(numbers, sameNumbers):");
        System.out.println("Результат: " + equalsResult);

        /*
         * compare() сравнивает массивы лексикографически.
         * 0 означает, что массивы равны.
         * Отрицательное число означает, что первый массив меньше второго.
         * Положительное число означает, что первый массив больше второго.
         */
        int compareResult = Arrays.compare(numbers, otherNumbers);

        System.out.println("\nArrays.compare(numbers, otherNumbers):");
        System.out.println("Результат: " + compareResult);
    }
}