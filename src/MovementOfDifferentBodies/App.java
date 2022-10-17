package MovementOfDifferentBodies;

public class App {
    static double resultDistance;

    public static void main(String[] args) {

        ParticipantProperty[] bodiesAraysName = {new Cat("Matilda"), new Human("Vitaliy"),
                new Robot("T1000")};

        TrackProperties[] track = {
                new Track(35),
                new Wall(1),
                new Track(50),
                new Wall(1),
                new Track(60),
                new Wall(2),
                new Track(500),
                new Wall(3),
                new Track(30)
        };

        for (ParticipantProperty player : bodiesAraysName) {
            resultDistance = 0;
            for (TrackProperties runTry : track) {
                while (player.jumping() >= runTry.getWallSise()) {
                    while (player.runningMax() > resultDistance + runTry.getRoadSise()) {
                        resultDistance = runTry.getRoadSise() + resultDistance;

                        System.out.println(player.getClass().getSimpleName() + " " + player.nameId() + " " +
                                "jumped over the wall" + " " + runTry.getWallSise() + "m and total ran " +
                                Rounder.roundValue(resultDistance) + "m");
                        break;
                    }
                    break;
                }
            }
        }
    }
}
