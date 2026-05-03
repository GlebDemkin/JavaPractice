public class MixedTypes {
    public static String printType(byte value) {
        return "byte";
    }

    public static String printType(short value) {
        return "short";
    }

    public static String printType(int value) {
        return "int";
    }

    public static String printType(long value) {
        return "long";
    }

    public static String printType(float value) {
        return "float";
    }

    public static String printType(double value) {
        return "double";
    }

    public static String printType(char value) {
        return "char";
    }

    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 100;
        long longValue = 1000L;
        float floatValue = 2.5F;
        double doubleValue = 3.75;
        char charValue = 'G';

        int byteShortResult = byteValue + shortValue;
        long intLongResult = intValue + longValue;
        float longFloatResult = longValue + floatValue;
        double floatDoubleResult = floatValue + doubleValue;
        int charIntResult = charValue + intValue;

        System.out.println("Принцип преобразования: byte -> short -> int -> long -> float -> double");
        System.out.println("Особенность: в арифметических выражениях byte, short и char сначала автоматически преобразуются к int.");

        System.out.println();

        System.out.println("byte + short = " + byteShortResult + ", тип результата: " + printType(byteShortResult));
        System.out.println("int + long = " + intLongResult + ", тип результата: " + printType(intLongResult));
        System.out.println("long + float = " + longFloatResult + ", тип результата: " + printType(longFloatResult));
        System.out.println("float + double = " + floatDoubleResult + ", тип результата: " + printType(floatDoubleResult));
        System.out.println("char + int = " + charIntResult + ", тип результата: " + printType(charIntResult));
    }
}