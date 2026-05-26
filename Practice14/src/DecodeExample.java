public class DecodeExample {
    public static void main(String[] args) {
        /*
         * Метод decode() создаёт объект класса-оболочки из строки.
         * Он понимает десятичные, восьмеричные и шестнадцатеричные числа.
         */

        Integer decimalValue = Integer.decode("12");      // обычное десятичное число
        Integer octalValue = Integer.decode("012");       // число с 0 в начале считается восьмеричным
        Integer hexValue1 = Integer.decode("0x12");       // шестнадцатеричное число
        Integer hexValue2 = Integer.decode("#12");        // ещё один вариант записи шестнадцатеричного числа
        Integer negativeHex = Integer.decode("-0x12");    // отрицательное шестнадцатеричное число

        /*
         * Метод decode() есть у целочисленных классов-оболочек:
         * Byte, Short, Integer, Long.
         */
        Byte byteValue = Byte.decode("0x7F");
        Short shortValue = Short.decode("010");
        Long longValue = Long.decode("0x100000000");

        System.out.println("Примеры Integer.decode():");
        System.out.println("Integer.decode(\"12\") = " + decimalValue);
        System.out.println("Integer.decode(\"012\") = " + octalValue);
        System.out.println("Integer.decode(\"0x12\") = " + hexValue1);
        System.out.println("Integer.decode(\"#12\") = " + hexValue2);
        System.out.println("Integer.decode(\"-0x12\") = " + negativeHex);

        System.out.println();

        System.out.println("Примеры decode() у других классов-оболочек:");
        System.out.println("Byte.decode(\"0x7F\") = " + byteValue);
        System.out.println("Short.decode(\"010\") = " + shortValue);
        System.out.println("Long.decode(\"0x100000000\") = " + longValue);
    }
}