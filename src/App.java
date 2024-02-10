public class App {
    public static void main(String[] args) throws Exception {
        Animal Cow = new Animal("Dog", "Dogus", false);
        Cow.setIsDomestic(true);

        System.out.println(Cow.getIsDomestic());
    }
}