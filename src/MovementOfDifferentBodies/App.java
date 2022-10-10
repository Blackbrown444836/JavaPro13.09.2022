package MovementOfDifferentBodies;

public class App {
    static double resultDistance;

    public static void main(String[] args) {

        ParticipantProperty[] bodiesAraysName = {new Cat("Murka"), new Human("Vova"),
                new Robot("T2")};

 TrackProperty[] tracks = {new Track(15), new Wall(1),new Track(60),
         new Wall(2), new Track(100), new Wall(3) };

        for (ParticipantProperty player : bodiesAraysName) {
            resultDistance = 0;
            for (TrackProperty runTry : tracks) {
                resultDistance = runTry.TrackProperty()



            }
        }
    }
}

// depending on features players, for each jump over the wall to be spent 3% от runTry.getDistance.
// if (player.runningMax() >= runTry.getDistance() || player.jumping() >= runTry.getWall()) {
//         resultDistance = runTry.getDistance() - runTry.getDistance() * 0.03 * runTry.getWall();
//         } else if (player.runningMax() >= runTry.getDistance() || player.jumping() < runTry.getWall()) {
//        resultDistance = runTry.getDistance() / runTry.getWall() * player.jumping() -
//        runTry.getDistance() / runTry.getWall() * player.jumping() * 0.03 * player.jumping();
//        } else if (player.runningMax() < runTry.getDistance() || player.jumping() >= runTry.getWall()) {
//        resultDistance = player.runningMax() - player.runningMax() * 0.03 * runTry.getWall();
//        } else {
//        resultDistance = player.runningMax() / player.jumping() * player.jumping() - player.runningMax() /
//        runTry.getWall() * player.jumping() * 0.03 * player.jumping();

//            for (Participant player : bodiesAraysName) {
//            for (Track runTry : track) {
//            if (player.runningMax() >= runTry.getDistance() || player.jumping() >= runTry.getWall()) {
//            resultDistance = runTry.getDistance();
//            } else if (player.runningMax() >= runTry.getDistance() || player.jumping() < runTry.getWall()) {
//        resultDistance = runTry.getDistance() / runTry.getWall() * player.jumping();
//        } else if (player.runningMax() < runTry.getDistance() || player.jumping() >= runTry.getWall()) {
//        resultDistance = player.runningMax();
//        } else {
//        resultDistance = player.runningMax() / runTry.getWall() * player.jumping();
//        }
//
//        System.out.println(player.getClass().getSimpleName() + " " + player.nameId() + " on distance " +
//        runTry.getDistance() + " m with " + runTry.getWall() + " walls " + "run " +
//        Rounder.roundValue(resultDistance) + "m");