public class Cat extends Animal{
    public static int countCat = 0;
    public Cat(String nameAnimal, double runDistans) {
        super(nameAnimal, runDistans);
        countCat++;
        System.out.println("This cat " + nameAnimal + " runed " + moveRun(setRunDistansAnimalLimit(200),runDistans) + "m");
    }
}
