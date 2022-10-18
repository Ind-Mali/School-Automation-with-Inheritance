public class Security extends Lecturer {
    private String documantion;

    public Security(String nameSurname, String phoneNo, String eMail, String department, String title, String doorNo,
            String documantion) {
        super(nameSurname, phoneNo, eMail, department, title, doorNo);
        this.documantion = documantion;
    }

    public String getDocumantion() {
        return documantion;
    }

    public void setDocumantion(String documantion) {
        this.documantion = documantion;
    }

    public void guard() {
        System.out.println(getNameSurname() + ", should be on guard duty");
    }

}
