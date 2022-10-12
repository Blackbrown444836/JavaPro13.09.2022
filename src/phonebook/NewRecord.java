package phonebook;

public class NewRecord {
    private final String contactName;
    private final String contactPhoneNumber;

    public NewRecord(String contactName, String contactPhoneNumber) {
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }


}
