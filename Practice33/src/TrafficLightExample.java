enum TrafficLight {
    RED("Красный", 30),
    YELLOW("Жёлтый", 5),
    GREEN("Зелёный", 25);

    private final String title;
    private final int duration;

    /*
     * Конструктор enum вызывается для каждой константы:
     * RED, YELLOW и GREEN.
     *
     * Напрямую создать объект через new нельзя.
     * Все элементы перечисления создаются только внутри enum.
     */
    TrafficLight(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}

public class TrafficLightExample {
    public static void main(String[] args) {
        /*
         * Перебираем все элементы перечисления TrafficLight.
         * Метод values() возвращает массив всех констант enum.
         */
        for (TrafficLight signal : TrafficLight.values()) {
            System.out.println("Сигнал: " + signal.getTitle());
            System.out.println("Длительность: " + signal.getDuration() + " секунд");
            System.out.println();
        }
    }
}