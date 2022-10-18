public class InformationDep extends Lecturer {

    private String duty;

    public InformationDep(String nameSurname, String phoneNo, String eMail, String department, String title,
            String doorNo, String duty) {
        super(nameSurname, phoneNo, eMail, department, title, doorNo);
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void setupNetwork() {
        System.out.println(getNameSurname() + ", should setup the network");
    }

}
