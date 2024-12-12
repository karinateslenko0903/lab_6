public class EducationalBook extends Book {
    private String subject;


    public EducationalBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Предмет: " + subject);
    }
}
