public class IntegerCachePractice {
    public static void main(String[] args) {
        /*
         * При автоупаковке int автоматически превращается в Integer.
         * Фактически Java использует Integer.valueOf(...).
         */
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;

        System.out.println("Проверка значения 128:");

        /*
         * При сравнении Integer и int объект Integer распаковывается в int.
         * Поэтому сравниваются обычные числовые значения.
         */
        System.out.println("a1 == i1 -> " + (a1 == i1));
        System.out.println("b1 == i1 -> " + (b1 == i1));

        /*
         * При сравнении Integer и Integer через == сравниваются ссылки на объекты.
         * Значение 128 не входит в стандартный кэш IntegerCache,
         * поэтому a1 и b1 являются разными объектами.
         */
        System.out.println("a1 == b1 -> " + (a1 == b1));

        /*
         * Метод equals() сравнивает значения объектов, а не ссылки.
         */
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));

        System.out.println();

        /*
         * Значение 127 входит в стандартный кэш IntegerCache.
         * Поэтому при автоупаковке a2 и b2 будут ссылаться на один объект.
         */
        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;

        System.out.println("Проверка значения 127:");

        // Integer снова распаковывается в int, поэтому сравниваются значения.
        System.out.println("a2 == i2 -> " + (a2 == i2));
        System.out.println("b2 == i2 -> " + (b2 == i2));

        // a2 и b2 ссылаются на один объект из IntegerCache.
        System.out.println("a2 == b2 -> " + (a2 == b2));

        // equals() сравнивает значения, поэтому результат true.
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));
    }
}