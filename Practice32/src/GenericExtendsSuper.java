import java.util.ArrayList;
import java.util.List;

public class GenericExtendsSuper {
    /*
     * <? extends Number> означает:
     * список содержит объекты типа Number или его наследников.
     *
     * Из такого списка безопасно читать элементы как Number.
     */
    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }

    /*
     * <? super Integer> означает:
     * список может быть List<Integer>, List<Number> или List<Object>.
     *
     * В такой список безопасно добавлять Integer.
     */
    public static void addIntegers(List<? super Integer> numbers) {
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);

        /*
         * Метод sumNumbers() принимает List<? extends Number>,
         * поэтому ему можно передать список Integer и список Double.
         */
        System.out.println("Сумма integerList: " + sumNumbers(integerList));
        System.out.println("Сумма doubleList: " + sumNumbers(doubleList));

        List<Number> numberList = new ArrayList<>();

        /*
         * Метод addIntegers() принимает List<? super Integer>,
         * поэтому в него можно передать List<Number>.
         */
        addIntegers(numberList);

        System.out.println("numberList после addIntegers(): " + numberList);

        /*
         * Главное правило:
         * extends удобно использовать для чтения данных,
         * super удобно использовать для добавления данных.
         */
    }
}