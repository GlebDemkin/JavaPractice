/*
 * Собственное исключение создаётся через наследование от класса Exception.
 * По соглашению название класса исключения заканчивается словом Exception.
 */
class InvalidAgeException extends Exception {
    /*
     * Конструктор без параметров.
     * Создаёт исключение без дополнительного сообщения.
     */
    public InvalidAgeException() {
        super();
    }

    /*
     * Конструктор с сообщением об ошибке.
     * Это сообщение можно получить через метод getMessage().
     */
    public InvalidAgeException(String message) {
        super(message);
    }

    /*
     * Конструктор с сообщением и причиной исключения.
     * Причина нужна, если одно исключение возникло из-за другого.
     */
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class CustomExceptionPractice {
    public static void main(String[] args) {
        try {
            setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Поймано собственное исключение.");
            System.out.println("Тип исключения: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }
    }

    public static void setAge(int age) throws InvalidAgeException {
        /*
         * Если возраст меньше 0, создаём и выбрасываем собственное исключение.
         * Так как InvalidAgeException наследуется от Exception,
         * метод должен объявить throws InvalidAgeException.
         */
        if (age < 0) {
            throw new InvalidAgeException("Возраст не может быть отрицательным.");
        }

        System.out.println("Возраст: " + age);
    }
}