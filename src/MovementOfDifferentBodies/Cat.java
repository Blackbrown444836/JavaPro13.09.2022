package MovementOfDifferentBodies;

public class Cat implements ParticipantProperty {
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

    public void setNameOfParticipant(String nameOfParticipant) {
        this.nameOfParticipant = nameOfParticipant;
    }

    public void setLimitNumberOfJumps(int limitNumberOfJumps) {
        this.limitNumberOfJumps = limitNumberOfJumps;
    }

    public void setLimitDistance(double limitDistance) {
        this.limitDistance = limitDistance;
    }
}

