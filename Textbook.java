public class Textbook extends EducationalBook {
    private String gradeLevel;


    public Textbook(String title, String author, int year, String subject, String gradeLevel) {
        super(title, author, year, subject);
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Рівень освіти: " + gradeLevel);
    }
}
