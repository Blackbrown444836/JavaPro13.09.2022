package MovementOfDifferentBodies;

public class Track {
    private final double distance;
    private final  int wall;

    public Track(double distance, int wall) {
        this.distance = distance;
        this.wall = wall;
    }

    public double getDistance() {
        return distance;
    }

    public int getWall() {
        return wall;
    }
}


