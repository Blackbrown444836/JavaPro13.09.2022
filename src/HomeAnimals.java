public class HomeAnimals {
    public static void main(String[] args) {
        Animal murka = new Cat("Murka", 154.25);
        Animal bobik = new Dog("Bobik", 565, 19.87);
        Animal markiz = new Cat("Markiz", 130.21);
        Animal barsic = new Dog("Barsic", 300.21, 2);

        System.out.println("Total annimals: " + (Cat.countCat + Dog.countDog) + ", cats: " + Cat.countCat + ", dog: "
                + Dog.countDog + ".");
    }
}
