import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        inRange();
        plusMinus();
        plusTrueMinusFalse();
        numberOfTimes();
        leapYear();
    }

    // Task 2.
    public static void printThreeWords() {
        System.out.printf("Orange%nBanana%nApple%n- - -%n");
    }

    // Task 3.
    public static void checkSumSign() {
        int a = -900;
        int b = 150;
        if ((a + b) >= 0) {
            System.out.printf("The amount is positive%n- - -%n");
        } else {
            System.out.printf("The amount is negative%n- - -%n");
        }
    }

    // Task 4.
    public static void printColor() {
        int value = 500;
        if (value <= 0) {
            System.out.printf("Red%n- - -%n");
        } else if (value > 0 && value < 100) {
            System.out.printf("Yellow%n- - -%n");
        } else {
            System.out.printf("Green%n- - -%n");
        }
    }

    // Task 5.
    public static void compareNumbers() {
        int a = -900;
        int b = 150;
        if (a >= b) {
            System.out.printf("a >= b%n- - -%n");
        } else {
            System.out.printf("a < b%n- - -%n");
        }
    }

    // Task 6.
    public static void inRange() {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Check sum a+b between 10 and 20");
        System.out.println("Enter the value of a:");
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b = sc.nextInt();
        System.out.printf("Result is %b%n- - -%n", checkRange(a, b));
    }

    public static boolean checkRange(int a, int b) {
        if (a + b <= 20 && a + b >= 10) {
            return true;
        } else {
            return false;
        }
    }

    // Task 7.
    public static void plusMinus() {
        int a;
        System.out.println("Check plus is or minus, enter the value of a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.printf("Result is %s%n- - -%n", checkPlusMinus(a));
    }

    public static String checkPlusMinus(int a) {
        String result;
        if (a >= 0) {
            result = "positive";
        } else {
            result = "negative";
        }
        return result;
    }

    // Task 8.
    public static void plusTrueMinusFalse() {
        int a;
        System.out.println("Enter the value, plus'll true, minus'll false");
        Scanner sc = new Scanner(System.in);
        a = validateOnlyIntNoZero(sc);
        System.out.printf("Result is %s%n- - -%n", checkplusTrueMinusFalse(a));
    }

    public static boolean checkplusTrueMinusFalse(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Task 9.

    public static void numberOfTimes() {
        String string = "Lockey is ";
        int variable = 777;
        int number;
        System.out.println("Enter the number of lines");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        newLine(string, variable, number);
    }

    public static String newLine(String string, int variable, int number) {
        int a;
        int b = 1;
        for (a = 0; a < number; ) {
            System.out.println(b + "). " + string + variable);
            a++;
            b++;
        }
        return string;
    }

    public static int validateOnlyIntNoZero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not a number!\n", str);
            System.out.print("Enter number!: ");
        }
        int variable = scanner.nextInt();
        while (variable == 0) {
            System.out.print("Zero is incorrect value, enter integer number: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - not a number!\n", str);
                System.out.print("Enter number!: ");
            }
            variable = scanner.nextInt();
        }
        return variable;
    }

    // Task 10.
    public static void leapYear() {
        int year;
        System.out.printf("- - -%nEnter the year ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        System.out.println("leap Year = true, other = false. Entered year - " + calcLeapYear(year));
    }

    public static boolean calcLeapYear(int x) {
        if (x % 400 == 0) {
            return true;
        } else if (x % 100 == 0) {
            return false;
        } else if (x % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
