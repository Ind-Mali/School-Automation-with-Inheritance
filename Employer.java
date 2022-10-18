public class Employer {
    private String nameSurname;
    private String phoneNo;
    private String eMail;

    public Employer(String nameSurname, String phoneNo, String eMail) {
        this.nameSurname = nameSurname;
        this.phoneNo = phoneNo;
        this.eMail = eMail;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void enter() {
        System.out.println(this.nameSurname + ", entered the place");
    }

    public void exit() {
        System.out.println(this.nameSurname + ", exited the place");
    }

    public void dininghole() {
        System.out.println(this.nameSurname + ", entered the dininghole");
    }
}
