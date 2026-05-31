class OverloadCalculator {
    /*
     * Перегрузка методов — это несколько методов с одинаковым названием,
     * но с разным количеством или типами параметров.
     */

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public String sum(String a, String b) {
        return a + b;
    }
}

public class OverloadingPractice {
    public static void main(String[] args) {
        OverloadCalculator calculator = new OverloadCalculator();

        /*
         * Java выбирает нужную версию метода sum()
         * по количеству и типам переданных аргументов.
         */
        System.out.println("sum(int, int): " + calculator.sum(10, 20));
        System.out.println("sum(int, int, int): " + calculator.sum(10, 20, 30));
        System.out.println("sum(double, double): " + calculator.sum(2.5, 3.7));
        System.out.println("sum(String, String): " + calculator.sum("Gleb ", "Demkin"));
    }
}