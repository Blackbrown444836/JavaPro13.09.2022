package MovementOfDifferentBodies;

public class RoadSection implements TrackProperties {

    double RoadLong;
    double WallHeight;

    public RoadSection(double roadLong, double wallHeight) {
        RoadLong = roadLong;
        WallHeight = wallHeight;
    }

    @Override
    public double WallHeight() {
        return this.WallHeight;
    }

    @Override
    public double TrackLong() {
        return this.RoadLong;
    }
}

