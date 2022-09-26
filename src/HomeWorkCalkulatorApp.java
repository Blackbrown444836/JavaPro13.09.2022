import java.util.Scanner;

public class HomeWorkCalkulatorApp {

    public static void main(String[] args) {
        System.out.printf("Calkulator ON%n+ add, - subtract, * multiply, / divide.%n");
        Scanner sc = new Scanner(System.in);
        double firstNumber = sc.nextDouble();
        double caseCalk = sc.nextDouble();
        double secondNumber = sc.nextDouble();
        System.out.println(firstNumber);
        System.out.println(caseCalk);
        System.out.println(secondNumber);
    }
}
