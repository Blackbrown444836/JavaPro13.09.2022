
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CoffeeOrderBoard {
    private int lastOrderNumber;
    private final LinkedList<Order> coffeeOrderBoardn = new LinkedList<>();

    public void add() {
        add("no name");
    }

    private void add(String no_name) {
    }

    public void addCoffeeOrderBoard(String clientOderName) {
        Order newOrder = new Order(++lastOrderNumber, clientOderName);
        coffeeOrderBoardn.addLast(newOrder);
    }

    public void draw() {
        System.out.println("-----------");
        System.out.println(" Num | Name");
        for (Order order : coffeeOrderBoardn) {
            System.out.println(order.toString());
        }
    }

    public void deliver(int nunber){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of ready order");
    nunber = scanner.nextInt();
if (nunber = coffeeOrderBoardn.getFirst().getClientOderNumber(toString)) re

}
}

