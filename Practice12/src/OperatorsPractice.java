public class OperatorsPractice {
    public static void main(String[] args) {
        // Основные числовые переменные для примеров операторов.
        int a = 10;
        int b = 3;

        System.out.println("Арифметические операторы:");

        // Выполняем сложение, вычитание, умножение, деление и остаток от деления.
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nОператоры присваивания:");

        // Составные операторы изменяют значение переменной и сразу сохраняют результат.
        int x = 10;
        System.out.println("x = " + x);

        x += 5;
        System.out.println("x += 5 -> " + x);

        x -= 3;
        System.out.println("x -= 3 -> " + x);

        x *= 2;
        System.out.println("x *= 2 -> " + x);

        x /= 4;
        System.out.println("x /= 4 -> " + x);

        x %= 3;
        System.out.println("x %= 3 -> " + x);

        System.out.println("\nОператоры сравнения:");

        // Операторы сравнения возвращают true или false.
        System.out.println("a == b -> " + (a == b));
        System.out.println("a != b -> " + (a != b));
        System.out.println("a > b -> " + (a > b));
        System.out.println("a >= b -> " + (a >= b));
        System.out.println("a < b -> " + (a < b));
        System.out.println("a <= b -> " + (a <= b));

        System.out.println("\nЛогические операторы:");

        // Логические операторы работают с boolean-значениями.
        boolean firstCondition = a > b;
        boolean secondCondition = b < 0;

        System.out.println("firstCondition = " + firstCondition);
        System.out.println("secondCondition = " + secondCondition);
        System.out.println("firstCondition && secondCondition -> " + (firstCondition && secondCondition));
        System.out.println("firstCondition || secondCondition -> " + (firstCondition || secondCondition));
        System.out.println("!firstCondition -> " + (!firstCondition));

        System.out.println("\nПобитовые операторы:");

        // Побитовые операторы работают не с числом целиком, а с его битами.
        int m = 6; // 110 в двоичной системе.
        int n = 3; // 011 в двоичной системе.

        // & ставит 1 только там, где оба бита равны 1.
        // 110 & 011 = 010, то есть 2.
        System.out.println("m & n = " + (m & n));

        // | ставит 1 там, где хотя бы один бит равен 1.
        // 110 | 011 = 111, то есть 7.
        System.out.println("m | n = " + (m | n));

        // ^ ставит 1 там, где биты отличаются.
        // 110 ^ 011 = 101, то есть 5.
        System.out.println("m ^ n = " + (m ^ n));

        // ~ инвертирует все биты числа: 0 становится 1, а 1 становится 0.
        // Для int результат будет -7, потому что int хранится в 32 битах. (6 = 00000000 00000000 00000000 00000110 )
        System.out.println("~m = " + (~m));

        System.out.println("\nОператоры сдвига:");

        // Сдвиги перемещают биты числа влево или вправо.
        // Для примера: 8 = 1000 в двоичной системе.
        int shiftValue = 8; // 1000

        // << сдвигает биты влево.
        // 1000 << 1 = 10000, то есть 16.
        // Для положительных чисел сдвиг влево на 1 похож на умножение на 2.
        System.out.println("shiftValue << 1 = " + (shiftValue << 1));

        // >> сдвигает биты вправо с сохранением знака числа.
        // 1000 >> 1 = 0100, то есть 4.
        // Для положительных чисел сдвиг вправо на 1 похож на деление на 2.
        System.out.println("shiftValue >> 1 = " + (shiftValue >> 1));

        // >>> сдвигает биты вправо и заполняет свободные биты нулями.
        // Для положительных чисел результат обычно такой же, как у >>.
        System.out.println("shiftValue >>> 1 = " + (shiftValue >>> 1));

        System.out.println("\nТернарный оператор:");

        // Тернарный оператор выбирает одно из двух значений по условию.
        String result = a > b ? "a больше b" : "a не больше b";
        System.out.println(result);

        System.out.println("\nИнкремент и декремент:");

        int postIncrement = 5;
        // При postIncrement++ сначала выводится текущее значение,
        // а потом переменная увеличивается на 1.
        System.out.println("\nНачальное значение: " + postIncrement);
        System.out.println("Результат postIncrement++: " + postIncrement++);
        System.out.println("Значение после операции: " + postIncrement);

        int preIncrement = 5;
        // При ++preIncrement переменная сначала увеличивается на 1,
        // а потом выводится уже новое значение.
        System.out.println("\nНачальное значение: " + preIncrement);
        System.out.println("Результат ++preIncrement: " + ++preIncrement);
        System.out.println("Значение после операции: " + preIncrement);

        int postDecrement = 5;
        // При postDecrement-- сначала выводится текущее значение,
        // а потом переменная уменьшается на 1.
        System.out.println("\nНачальное значение: " + postDecrement);
        System.out.println("Результат postDecrement--: " + postDecrement--);
        System.out.println("Значение после операции: " + postDecrement);
;
        int preDecrement = 5;
        // При --preDecrement переменная сначала уменьшается на 1,
        // а потом выводится уже новое значение.
        System.out.println("\nНачальное значение: " + preDecrement);
        System.out.println("Результат --preDecrement: " + --preDecrement);
        System.out.println("Значение после операции: " + preDecrement);

        System.out.println("\nОператоры со строками:");

        // Для String оператор + используется не для сложения,
        // а для конкатенации, то есть соединения строк.
        String text = "Java";

        String message = text + " programming";
        System.out.println("text + \" programming\" -> " + message);

        // Оператор += добавляет новую часть строки к уже существующей строке.
        text += " language";
        System.out.println("text += \" language\" -> " + text);

        System.out.println("\nСравнение строк:");

        // Строки являются объектами, поэтому оператор == сравнивает ссылки,
        // то есть проверяет, один и тот же это объект в памяти или нет.
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        // s1 и s2 указывают на один строковый литерал из пула строк,
        // поэтому результат будет true.
        System.out.println("s1 == s2 -> " + (s1 == s2));

        // s3 создаётся через new String(), поэтому это отдельный объект.
        // Текст внутри такой же, но ссылка другая, поэтому результат false.
        System.out.println("s1 == s3 -> " + (s1 == s3));

        // Так как ссылки разные, выражение s1 != s3 вернёт true.
        System.out.println("s1 != s3 -> " + (s1 != s3));

        // Для сравнения именно содержимого строк используется equals().
        System.out.println("s1.equals(s3) -> " + s1.equals(s3));

        System.out.println("\nСкобки и массивы:");

        // Скобки меняют порядок вычислений.
        int expressionResult = (a + b) * 2;
        System.out.println("(a + b) * 2 = " + expressionResult);

        // Квадратные скобки используются для обращения к элементам массива.
        int[] numbers = {10, 20, 30};

        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);
    }
}