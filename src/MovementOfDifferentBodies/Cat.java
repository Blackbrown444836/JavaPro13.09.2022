package MovementOfDifferentBodies;

public class Cat implements Participant {
    String nameOfParticipant;
    int limitNumberOfJumps = 7;
    double limitDistance = 100;

    public Cat(String nameOfParticipant) {
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

