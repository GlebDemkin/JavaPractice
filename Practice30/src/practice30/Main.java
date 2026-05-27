package practice30;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        /*
         * Массив имеет тип Number[].
         * Поэтому при переборе через for-each каждая переменная n имеет тип Number,
         * даже если реальный объект внутри массива является Integer, Float или Double.
         */
        Number[] num = {
            Integer.valueOf(1),
            11,
            1.11f,
            11.11
        };

        System.out.println("Цикл for:");

        /*
         * В этом цикле переменная n имеет тип Number.
         * Перегрузка методов определяется на этапе компиляции,
         * поэтому Java выбирает printNum(Number).
         */
        for (Number n : num) {
            a.printNum(n);
        }

        System.out.println();

        System.out.println("Отдельные вызовы:");

        /*
         * Здесь компилятор видит конкретные типы аргументов,
         * поэтому выбирает разные перегруженные версии метода.
         */
        a.printNum(Integer.valueOf(1)); // printNum(Integer)
        a.printNum(11);                 // printNum(int)
        a.printNum(1.11f);              // printNum(Float)
        a.printNum(11.11);              // printNum(Number)
    }
}