package MovementOfDifferentBodies;

public class App {
    static double resultDistance;

    public static void main(String[] args) {

        Participant[] bodiesAraysName = {new Cat("Murka"), new Human("Vova"),
                new Robot("T2")};
        Track[] track = {new Track(300, 9), new Track(500, 25)};
// в зависимости от особенностей бегущих, на каждый прижок через стену тратиться 3% от дистанции.

        for (Participant player : bodiesAraysName) {
            for (Track runTry : track) {
                if (player.runningMax() >= runTry.getDistance() || player.jumping() >= runTry.getWall()) {
                    resultDistance = runTry.getDistance() - runTry.getDistance() * 0.03 * runTry.getWall();
                } else if (player.runningMax() >= runTry.getDistance() || player.jumping() < runTry.getWall()) {
                    resultDistance = runTry.getDistance() / runTry.getWall() * player.jumping() -
                            runTry.getDistance() / runTry.getWall() * player.jumping() * 0.03 * player.jumping();
                } else if (player.runningMax() < runTry.getDistance() || player.jumping() >= runTry.getWall()) {
                    resultDistance = player.runningMax() - player.runningMax() * 0.03 * runTry.getWall();
                } else {
                resultDistance = player.runningMax() / runTry.getWall() * player.jumping() - player.runningMax() /
                        runTry.getWall() * player.jumping() * 0.03 * player.jumping();
            }

            System.out.println(player.getClass().getSimpleName() + " " + player.nameId() + " on distance " +
                    runTry.getDistance() + " m with " + runTry.getWall() + " walls " + "run " +
                    Rounder.roundValue(resultDistance) + "m");
        }
    }
}
}