public class LabAsistant extends Asistant {

    public LabAsistant(String nameSurname, String phoneNo, String eMail, String department, String title,
            String consultationHour) {
        super(nameSurname, phoneNo, eMail, department, title, consultationHour);
    }

    public void enterLab() {
        System.out.println(getNameSurname() + ", enter the lab class");
    }

}
