public class NarrowTypes {
    public static void main(String[] args) {
        int intValue = 100;
        double doubleValue = 15.75;
        long longValue = 100000L;
        int bigIntValue = 130;

        System.out.println("Сужающее преобразование типов");

        System.out.println("\nint -> byte:");
        System.out.println("int value = " + intValue);
        System.out.println("byte value = " + (byte) intValue);
        System.out.println("Значение 100 входит в диапазон byte, поэтому при преобразовании оно не изменяется.");

        System.out.println("\ndouble -> int:");
        System.out.println("double value = " + doubleValue);
        System.out.println("int value = " + (int) doubleValue);
        System.out.println("Дробная часть отбрасывается.");

        System.out.println("\nlong -> short:");
        System.out.println("long value = " + longValue);
        System.out.println("short value = " + (short) longValue);
        System.out.println("Значение 100000 не входит в диапазон short, поэтому при преобразовании происходит потеря данных.");

        System.out.println("\nПример переполнения при int -> byte:");
        System.out.println("int value = " + bigIntValue);
        System.out.println("byte value = " + (byte) bigIntValue);
        System.out.println("Тип byte хранит значения только от -128 до 127.");
        System.out.println("Значение 130 не входит в этот диапазон, поэтому после преобразования получается другое число.");
    }
}