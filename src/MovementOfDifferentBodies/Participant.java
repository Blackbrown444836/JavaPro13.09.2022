package MovementOfDifferentBodies;

public interface Participant extends Running,Jumping {

String nameId();


    @Override
    int jumping();

    @Override
    double runningMax();
}