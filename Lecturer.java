public class Lecturer extends Instructor {
    private String doorNo;

    public Lecturer(String nameSurname, String phoneNo, String eMail, String department, String title, String doorNo) {
        super(nameSurname, phoneNo, eMail, department, title);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public void senateMeeting() {
        System.out.println(getNameSurname() + ", make a senate meeting");
    }

    public void doExam() {
        System.out.println(getNameSurname() + ", do exam!");
    }

}
