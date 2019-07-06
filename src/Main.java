public class Main {

    public static void main(String[] args) {
        TinyURL tinyURL = new TinyURL();

        String tiny = tinyURL.idToShortURL(1400533);
        System.out.println("tiny Url: " + tiny);

        int id = tinyURL.reverseTinyURL(tiny);
        System.out.println("id = " + id);


    }
}
