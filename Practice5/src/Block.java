public class Block {
    public static void main(String[] args) {

        {
            int b = 2;
            System.out.println("Переменная b существует внутри блока.");
            System.out.println("Значение b внутри блока: " + b);
        }

        System.out.println("\nПосле блока переменная b уже недоступна.");
        System.out.println("Поэтому выражение int c = a + b; вызовет ошибку компиляции.");

        // Уберите комменатарии снизу, чтобы убедиться в ошибке компиляции
        // int a = 1;
        // int c = a + b;
    }
}
