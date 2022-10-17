package MovementOfDifferentBodies;

public class Track implements TrackProperties {

    double trackLong;

    public Track(double trackLong) {
        this.trackLong = trackLong;
    }

    @Override
    public double getWallSise() {
        return 0;
    }

    @Override
    public double getRoadSise() {
        return trackLong;
    }
}


