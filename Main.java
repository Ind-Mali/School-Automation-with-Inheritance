public class Main {
    public static void main(String[] args) {
        Employer c1 = new Employer("Mali", "456465465", "mali@mali.org");
        Instructor a1 = new Instructor("aslı", "1231", "aslı@123.com", "history", "Prof");
        Officer o1 = new Officer("must", "123123", "mst@mali.org", "histr", "09:00-17:00");
        Lecturer l1 = new Lecturer("abs", "1231412", "abs@mali.ogr", "hist", "Doc", "123");

        o1.enter();
        l1.doExam();
        a1.getTitle();
        c1.exit();
    }
}
