package MovementOfDifferentBodies;

public class Human implements Participant  {
    String nameOfParticipant;
    int limitNumberOfJumps = 10;
    double limitDistance = 1000;

    public Human(String nameOfParticipant) {
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
