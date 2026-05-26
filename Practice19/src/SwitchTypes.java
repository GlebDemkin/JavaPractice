enum UserRole {
    STUDENT,
    TEACHER,
    ADMIN
}

public class SwitchTypes {
    public static void main(String[] args) {
        /*
         * В switch можно использовать:
         * byte, short, char, int,
         * их классы-оболочки Byte, Short, Character, Integer,
         * String и enum.
         *
         * Нельзя использовать boolean, long, float и double.
         */

        byte byteValue = 1;
        short shortValue = 2;
        char charValue = 'A';
        int intValue = 3;

        Byte byteWrapper = 1;
        Short shortWrapper = 2;
        Character charWrapper = 'B';
        Integer intWrapper = 3;

        String stringValue = "Gleb";
        UserRole role = UserRole.STUDENT;

        System.out.println("Пример switch с byte:");
        switch (byteValue) {
            case 1:
                System.out.println("byteValue равен 1");
                break;
            default:
                System.out.println("Другое значение byteValue");
                break;
        }

        System.out.println("\nПример switch с short:");
        switch (shortValue) {
            case 2:
                System.out.println("shortValue равен 2");
                break;
            default:
                System.out.println("Другое значение shortValue");
                break;
        }

        System.out.println("\nПример switch с char:");
        switch (charValue) {
            case 'A':
                System.out.println("charValue равен A");
                break;
            default:
                System.out.println("Другой символ");
                break;
        }

        System.out.println("\nПример switch с int:");
        switch (intValue) {
            case 3:
                System.out.println("intValue равен 3");
                break;
            default:
                System.out.println("Другое значение intValue");
                break;
        }

        System.out.println("\nПример switch с Byte:");
        switch (byteWrapper) {
            case 1:
                System.out.println("byteWrapper равен 1");
                break;
            default:
                System.out.println("Другое значение byteWrapper");
                break;
        }

        System.out.println("\nПример switch с Short:");
        switch (shortWrapper) {
            case 2:
                System.out.println("shortWrapper равен 2");
                break;
            default:
                System.out.println("Другое значение shortWrapper");
                break;
        }

        System.out.println("\nПример switch с Character:");
        switch (charWrapper) {
            case 'B':
                System.out.println("charWrapper равен B");
                break;
            default:
                System.out.println("Другой символ");
                break;
        }

        System.out.println("\nПример switch с Integer:");
        switch (intWrapper) {
            case 3:
                System.out.println("intWrapper равен 3");
                break;
            default:
                System.out.println("Другое значение intWrapper");
                break;
        }

        System.out.println("\nПример switch с String:");
        switch (stringValue) {
            case "Gleb":
                System.out.println("Строка равна Java");
                break;
            default:
                System.out.println("Другая строка");
                break;
        }

        System.out.println("\nПример switch с enum:");
        switch (role) {
            case STUDENT:
                System.out.println("Роль: студент");
                break;
            case TEACHER:
                System.out.println("Роль: преподаватель");
                break;
            case ADMIN:
                System.out.println("Роль: администратор");
                break;
            default:
                System.out.println("Неизвестная роль");
                break;
        }
    }
}