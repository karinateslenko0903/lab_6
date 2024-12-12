public class Anthology extends Book {
    private int numberOfWorks; // Кількість творів у збірнику


    public Anthology(String title, String author, int year, int numberOfWorks) {
        super(title, author, year);
        this.numberOfWorks = numberOfWorks;
    }

    public int getNumberOfWorks() {
        return numberOfWorks;
    }

    public void setNumberOfWorks(int numberOfWorks) {
        this.numberOfWorks = numberOfWorks;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кількість творів: " + numberOfWorks);
    }
}
