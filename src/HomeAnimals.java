public class HomeAnimals {
    public static void main(String[] args) {
        Cat murka = new Cat("Murka", 154.25);
        Dog bobik = new Dog("Bobik", 365, 9.87);
        Cat markiz = new Cat("Markiz", 130.21);
        Dog barsic = new Dog("Barsic", 800.21, 2);
        System.out.println(murka);
        System.out.println(bobik);
        System.out.println(markiz);
        System.out.println(barsic);
        System.out.println("Total annimals: " + (Cat.countCat + Dog.countDog) + ", cats: " + Cat.countCat + ", dog: "
                + Dog.countDog + ".");
    }
}
