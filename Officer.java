public class Officer extends Employer {
    private String department;
    private String shift;

    public Officer(String nameSurname, String phoneNo, String eMail, String department, String shift) {
        super(nameSurname, phoneNo, eMail);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work() {
        System.out.println(getNameSurname() + ", you should work");
    }

}
