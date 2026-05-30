/*
 * final-класс нельзя использовать как суперкласс.
 * От него нельзя создать дочерний класс через extends.
 */
final class SecurityConfig {
    public void printConfig() {
        System.out.println("Настройки безопасности загружены.");
    }
}

/*
 * Так писать нельзя.
 * Класс SecurityConfig объявлен как final,
 * поэтому наследование от него вызовет ошибку компиляции.
 */

// class CustomSecurityConfig extends SecurityConfig {
//     public void printCustomConfig() {
//         System.out.println("Пользовательские настройки безопасности.");
//     }
// }

public class FinalClassPractice {
    public static void main(String[] args) {
        SecurityConfig config = new SecurityConfig();

        config.printConfig();

        System.out.println();
        System.out.println("final-класс SecurityConfig можно использовать для создания объекта,");
        System.out.println("но нельзя использовать как родительский класс.");
    }
}