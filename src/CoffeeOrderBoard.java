
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


public void turn() {
    System.out.println("-----------");
    System.out.println(" Num | Name");
    for (Order order : coffeeOrderBoardn) {
        if (coffeeOrderBoardn)
            System.out.println(order.toString());
    }
}


    public void deliver(int nunber) {
        Scanner scanner = new Scanner(System.in);
        nunber = scanner.nextInt();
        for (Order order : coffeeOrderBoardn) {
            if (nunber == order.getClientOderNumber()) {
                coffeeOrderBoardn.remove(nunber - 1);
                draw();
                return;
            }
        }
    }
}

