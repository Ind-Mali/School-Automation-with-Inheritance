public class Asistant extends Instructor {
    private String consultationHour;

    public Asistant(String nameSurname, String phoneNo, String eMail, String department, String title,
            String consultationHour) {
        super(nameSurname, phoneNo, eMail, department, title);
        this.consultationHour = consultationHour;
    }

    public String getConsultationHour() {
        return consultationHour;
    }

    public void setConsultationHour(String consultationHour) {
        this.consultationHour = consultationHour;
    }

    public void doQuiz() {
        System.out.println(getNameSurname() + ", should do quiz!!");
    }

}
