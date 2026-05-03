public class ByteConversion {
    public static void main(String[] args) {
        int a = 120;

        System.out.println("int a = " + a);

        // byte b = a + 10; 
        System.out.println("\nbyte b = a + 10; // ошибка компиляции");
        System.out.println("Причина: a + 10 имеет тип int, а int нельзя автоматически записать в byte.");

        byte c = (byte) (a + 10);
        System.out.println("\nbyte c = (byte) (a + 10);");
        System.out.println("c = " + c);
        System.out.println("Причина: 130 выходит за диапазон byte (-128..127), поэтому получается -126.");

        // byte d = a + 1; 
        System.out.println("\nbyte d = a + 1; // ошибка компиляции");
        System.out.println("Причина: a + 1 тоже имеет тип int, даже если результат 121 входит в диапазон byte.");

        byte d = (byte) (a + 1);
        System.out.println("\nС явным приведением:");
        System.out.println("byte d = (byte) (a + 1);");
        System.out.println("d = " + d);
    }
}