package MovementOfDifferentBodies;

public class App {
    static double resultDistance;

    public static void main(String[] args) {

        ParticipantProperty[] bodiesAraysName = {new Cat("Matilda"), new Human("Vitaliy"),
                new Robot("T1000")};

        TrackProperties[] track = {new RoadSection(15, 2), new RoadSection(35, 1),
                new RoadSection(35, 2), new RoadSection(55, 2),
                new RoadSection(500, 2), new RoadSection(100, 3)};

        for (ParticipantProperty player : bodiesAraysName) {
            resultDistance = 0;
            for (TrackProperties runTry : track) {
                while (player.jumping() >= runTry.WallHeight()) {
                    if (player.runningMax() > resultDistance + runTry.TrackLong()) {
                        resultDistance = runTry.TrackLong() + resultDistance;

                        System.out.println(player.getClass().getSimpleName() + " " + player.nameId() + " " +
                                "jumped over the wall" + " " + runTry.WallHeight() + "m and total ran " +
                                Rounder.roundValue(resultDistance) + "m");
                    }
                    break;
                }
            }
        }
    }
}
