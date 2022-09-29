public class Employee {
    private String nameEmployee;
    private String posotionEmployee;
    private String emailEmployee;
    private String contactPhoneNumberEmployee;
    private int ageEmployee;


    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getPosotionEmployee() {
        return posotionEmployee;
    }

    public void setPosotionEmployee(String posotionEmployee) {
        this.posotionEmployee = posotionEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getContactPhoneNumberEmployee() {
        return contactPhoneNumberEmployee;
    }

    public void setContactPhoneNumberEmployee(String contactPhoneNumberEmployee) {
        this.contactPhoneNumberEmployee = contactPhoneNumberEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(int ageEmployee) {
        if (ageEmployee < 0) return;
        this.ageEmployee = ageEmployee;
    }
}
