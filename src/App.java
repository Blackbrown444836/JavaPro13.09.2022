public class App {
    public static void main(String[] args) {
        CoffeeOrderBoard cafe = new CoffeeOrderBoard();
        cafe.add();
        cafe.addCoffeeOrderBoard("Semen");
        cafe.addCoffeeOrderBoard("Misha");
        cafe.addCoffeeOrderBoard("Fima");
        cafe.addCoffeeOrderBoard("Zyasha");
        cafe.addCoffeeOrderBoard("Helya");
        cafe.addCoffeeOrderBoard("Marusia");
        cafe.addCoffeeOrderBoard("Slava");
        cafe.addCoffeeOrderBoard("Kostya");

      cafe.draw();
    }
}
