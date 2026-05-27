package practice29;

public class Main {
    public static void main(String[] args) {
        /*
         * При создании первого объекта класса A сначала выполнится static-блок,
         * затем логические блоки и только потом конструктор.
         */
        new A(100);
    }
}