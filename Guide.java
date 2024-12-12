public class Guide extends EducationalBook {
    private String field;


    public Guide(String title, String author, int year, String subject, String field) {
        super(title, author, year, subject);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Галузь: " + field);
    }
}
