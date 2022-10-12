package phonebook;

import java.util.ArrayList;

public class Phonebook {
    private static final ArrayList<NewRecord> newRecording = new ArrayList<>();

    public static void addNewRecording(NewRecord exemplar) {
        newRecording.add(exemplar);
    }



}
