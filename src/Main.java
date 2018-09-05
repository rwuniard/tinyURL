public class Main {

    public static void main(String[] args) {
        TinyURL tinyURL = new TinyURL();

        String tiny = tinyURL.idToShortURL(12345);
        System.out.println(tiny);

        int id = tinyURL.reverseTinyURL(tiny);
        System.out.println("id = " + id);

    }
}
