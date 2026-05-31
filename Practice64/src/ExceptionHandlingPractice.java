public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        handleArithmeticException();
        handleArrayIndexOutOfBoundsException();
        handleIllegalArgumentException();
        handleClassCastException();
        handleNullPointerException();
    }

    public static void handleArithmeticException() {
        /*
         * ArithmeticException возникает при ошибке в арифметической операции.
         * В данном примере выполняется деление на ноль.
         */
        try {
            int result = 10 / 0;
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: деление на ноль запрещено.");
        }

        System.out.println();
    }

    public static void handleArrayIndexOutOfBoundsException() {
        /*
         * ArrayIndexOutOfBoundsException возникает при обращении
         * к элементу массива по несуществующему индексу.
         */
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: индекс выходит за границы массива.");
        }

        System.out.println();
    }

    public static void handleIllegalArgumentException() {
        /*
         * IllegalArgumentException используется, когда в метод
         * передан неправильный аргумент.
         */
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        System.out.println();
    }

    public static void setAge(int age) {
        /*
         * Возраст не может быть отрицательным.
         * Если значение неправильное, вручную выбрасываем исключение.
         */
        if (age < 0) {
            throw new IllegalArgumentException("возраст не может быть отрицательным");
        }

        System.out.println("age = " + age);
    }

    public static void handleClassCastException() {
        /*
         * ClassCastException возникает при неправильном приведении типа.
         * Здесь строку пытаются привести к Integer.
         */
        try {
            Object value = "Gleb";
            Integer number = (Integer) value;
            System.out.println(number);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: объект нельзя привести к указанному типу.");
        }

        System.out.println();
    }

    public static void handleNullPointerException() {
        /*
         * NullPointerException возникает, если обратиться к методу
         * или полю через ссылку, которая равна null.
         */
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: нельзя вызвать метод у null-ссылки.");
        }

        System.out.println();
    }
}