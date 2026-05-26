public class UnboxingNullPointerException {
    public static void main(String[] args) {
        /*
         * Integer — это класс-оболочка для базового типа int.
         * Объект Integer может хранить число, а может быть равен null.
         */
        Integer wrapperValue = null;

        System.out.println("Пример автораспаковки null-объекта");
        System.out.println("Integer wrapperValue = " + wrapperValue);

        /*
         * Здесь происходит автораспаковка:
         * Java пытается преобразовать Integer в int.
         *
         * Но wrapperValue равен null, поэтому из него нельзя получить int.
         * В результате возникает исключение NullPointerException.
         */
        try {
            int primitiveValue = wrapperValue;

            System.out.println("primitiveValue = " + primitiveValue);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: нельзя выполнить автораспаковку из null.");
            System.out.println("Было выброшено исключение NullPointerException.");
        }
    }
}