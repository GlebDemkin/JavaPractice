package practice30;
public class A {
    /*
     * Метод принимает объект Integer.
     * Эта версия будет выбрана, если компилятор заранее видит,
     * что аргумент имеет тип Integer.
     */
    public void printNum(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }

    /*
     * Метод принимает значение базового типа int.
     * Эта версия будет выбрана для int-литералов, например 11.
     */
    public void printNum(int i) {
        System.out.printf("int = %d%n", i);
    }

    /*
     * Метод принимает объект Float.
     * Для значения 1.11f Java может выполнить автоупаковку:
     * float -> Float.
     */
    public void printNum(Float f) {
        System.out.printf("Float = %.4f%n", f);
    }

    /*
     * Метод принимает Number.
     * Number — это общий родительский класс для Integer, Float, Double и других числовых оболочек.
     */
    public void printNum(Number n) {
        System.out.println("Number = " + n);
    }
}