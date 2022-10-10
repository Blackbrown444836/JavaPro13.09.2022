package MovementOfDifferentBodies;

public class Wall implements TrackProperty{
    int TrackWallHight;

    public Wall(int trackWallHight) {
        TrackWallHight = trackWallHight;
    }

    @Override
    public double TrackProperty() {
        return 0;
    }
}

