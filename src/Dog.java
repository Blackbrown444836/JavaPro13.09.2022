public class Dog extends Animal {
    public static int countDog = 0;
    public Dog (String nameAnimal, double runDistans, double swimDistans) {
        super(nameAnimal, runDistans);
        countDog++;
        System.out.println("This dog " + nameAnimal + " runed " + moveRun(setRunDistansAnimalLimit(500),runDistans) + "m" +
                " and swimed " + swimMove(setSwimDistansAnimalLimit(10), swimDistans) + "m");
    }
}
