public class Instructor extends Employer {
    private String department;
    private String title;

    public Instructor(String nameSurname, String phoneNo, String eMail, String department, String title) {
        super(nameSurname, phoneNo, eMail);
        this.title = title;
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void enterClass() {
        System.out.println(getNameSurname() + ", enter the lecture");
    }

}
