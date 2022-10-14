public class App {
    public static void main(String[] args) {
        CoffeeOrderBoard cafe = new CoffeeOrderBoard();

        cafe.addCoffeeOrderBoard("Semen");
        cafe.addCoffeeOrderBoard("Misha");
        cafe.addCoffeeOrderBoard("Fima");
        cafe.addCoffeeOrderBoard("Zyasha");
        cafe.addCoffeeOrderBoard("Helya");
        cafe.addCoffeeOrderBoard("Marusia");
        cafe.addCoffeeOrderBoard("Slava");
        cafe.addCoffeeOrderBoard("Kostya");

        cafe.draw();
        System.out.println("Enter number of ready order:");
        cafe.deliver();
        System.out.println("====================");
        System.out.println("Next turn of ready order: ");
        cafe.turn();
    }
}
