package MovementOfDifferentBodies;

public class Track implements TrackProperty {

    double trackPartLomg;

    @Override
    public double TrackProperty() {
        return 0;
    }

    public Track(double trackPartLomg) {
        this.trackPartLomg = trackPartLomg;
    }
}
