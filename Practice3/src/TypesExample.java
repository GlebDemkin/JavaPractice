public class TypesExample {
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;

    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 1000;
        int intValue = 100000;
        long longValue = 10000000000L;

        float floatValue = 3.14F;
        double doubleValue = 3.1415926535;

        char charValue = 'A';
        boolean booleanValue = true;

        System.out.println("\nПримеры базовых типов данных:");
        System.out.println("\tbyte: " + byteValue);
        System.out.println("\tshort: " + shortValue);
        System.out.println("\tint: " + intValue);
        System.out.println("\tlong: " + longValue);
        System.out.println("\tfloat: " + floatValue);
        System.out.println("\tdouble: " + doubleValue);
        System.out.println("\tchar: " + charValue);
        System.out.println("\tboolean: " + booleanValue);

        System.out.println("\nНулевые значения базовых типов:");
        System.out.println("\tbyte: " + defaultByte);
        System.out.println("\tshort: " + defaultShort);
        System.out.println("\tint: " + defaultInt);
        System.out.println("\tlong: " + defaultLong);
        System.out.println("\tfloat: " + defaultFloat);
        System.out.println("\tdouble: " + defaultDouble);
        System.out.println("\tchar: " + (int) defaultChar);
        System.out.println("\tboolean: " + defaultBoolean);
    }
}