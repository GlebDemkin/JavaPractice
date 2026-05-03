import java.util.ArrayList;

public class VarExample {
    public static void printType(String Name, Object value) {
        System.out.println(Name + " = " + value + ", тип: " + value.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        var name = "Глеб";
        var age = 19;
        var height = 1.83;
        var isStudent = true;
        var grade = 'A';

        var numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Пример использования var");
        System.out.println("var позволяет не писать тип переменной явно.");
        System.out.println("Тип определяется автоматически по значению справа.");

        System.out.println();

        printType("name", name);
        printType("age", age);
        printType("height", height);
        printType("isStudent", isStudent);
        printType("grade", grade);
        printType("numbers", numbers);
    }
}