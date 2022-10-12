package phonebook;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Phonebook.addNewRecording(new NewRecord("Tomy", "048-356-36-56"));
        Phonebook.addNewRecording(new NewRecord("Jerry", "048-123-82-88"));
        Phonebook.addNewRecording(new NewRecord("Boby", "048-951-91-91"));
        Phonebook.addNewRecording(new NewRecord("Larry", "048-147-46-46"));
        Phonebook.addNewRecording(new NewRecord("Johny", "048-463-37-67"));
        Phonebook.addNewRecording(new NewRecord("Fredy", "048-137-11-12"));
    }

}
