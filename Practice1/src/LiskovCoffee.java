class CoffeeMachine {
    public void makeEspresso() {
        System.out.println("\tГотовится эспрессо...");
    }

    public void makeAmericano() {
        System.out.println("\tГотовится американо...");
    }
}

class SmartCoffeeMachine extends CoffeeMachine {
    @Override
    public void makeEspresso() {
        System.out.println("\tУмная кофемашина проверяет количество зёрен кофе.");
        super.makeEspresso();
    }

    public void makeCappuccino() {
        System.out.println("\tГотовим капучино с молочной пенкой...");
    }

    public void cleanMilkSystem() {
        System.out.println("\tОчищаем молочную систему...");
    }
}

public class LiskovCoffee {
    public static void makeBasicCoffee(CoffeeMachine machine) {
        machine.makeEspresso();
        machine.makeAmericano();
    }

    public static void main(String[] args) {
        CoffeeMachine simpleMachine = new CoffeeMachine();
        SmartCoffeeMachine smartMachine = new SmartCoffeeMachine();

        System.out.println("Обычная кофемашина:");
        makeBasicCoffee(simpleMachine);

        System.out.println();

        System.out.println("Умная кофемашина:");
        makeBasicCoffee(smartMachine);

        System.out.println();

        System.out.println("Дополнительные функции умной кофемашины:");
        smartMachine.makeCappuccino();
        smartMachine.cleanMilkSystem();
    }
}
