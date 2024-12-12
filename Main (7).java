public class Main {
    public static void main(String[] args) {

        Textbook textbook = new Textbook("Алгебра", "Іваненко П.", 2021, "Математика", "Середня школа");
        Guide guide = new Guide("Програмування на Java", "Петренко О.", 2020, "Програмування", "Інформаційні технології");
        Anthology anthology = new Anthology("Збірник віршів", "Шевченко Т.", 2018, 200);


        System.out.println("Інформація про підручник:");
        textbook.displayInfo();

        System.out.println("\nІнформація про посібник:");
        guide.displayInfo();

        System.out.println("\nІнформація про збірник творів:");
        anthology.displayInfo();
    }
}
