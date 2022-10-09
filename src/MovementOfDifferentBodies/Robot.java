package MovementOfDifferentBodies;

public class Robot implements Participant {
    String nameOfParticipant;
    int limitNumberOfJumps = 15;
    double limitDistance = 800;

    public Robot(String nameOfParticipant) {
        this.nameOfParticipant = nameOfParticipant;
    }

    @Override
    public String nameId() {
        return nameOfParticipant;
    }

    @Override
    public int jumping() {
        return limitNumberOfJumps;
    }

    @Override
    public double runningMax() {
        return limitDistance;
    }
}
