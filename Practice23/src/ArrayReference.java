import java.util.Arrays;

public class ArrayReference {
    public static void main(String[] args) {
        /*
         * Переменные a1 и a2 не хранят сами массивы.
         * Они хранят ссылки на массивы в памяти.
         */
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};

        System.out.println("До присваивания:");
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));

        /*
         * После a1 = a2 переменная a1 начинает ссылаться
         * на тот же массив, на который ссылается a2.
         * Старый массив {1, 2, 3, 4, 5} больше не доступен через a1.
         */
        a1 = a2;

        System.out.println("\nПосле присваивания a1 = a2:");
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));

        /*
         * Изменяем первый элемент через a2.
         * Так как a1 и a2 теперь ссылаются на один массив,
         * изменение будет видно и через a1.
         */
        a2[0] = 100;

        System.out.println("\nПосле изменения a2[0] = 100:");
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));
    }
}