public class TinyURL {

    private String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public String idToShortURL(int id) {
        StringBuffer tinyURL = new StringBuffer();
        char[] mapChar = map.toCharArray();

        while (id != 0) {
            int n = id%62;
            tinyURL.append(mapChar[n]);
            id = id /62;
        }
        return tinyURL.reverse().toString();
    }

    public int reverseTinyURL(String tinyURL) {
        int id = 0;
        for (int i = 0; i < tinyURL.length(); i++) {

            if ('a' <= tinyURL.charAt(i) && tinyURL.charAt(i) <= 'z')
                id = (id * 62) + tinyURL.charAt(i) - 'a';
            if ('A' <= tinyURL.charAt(i) && tinyURL.charAt(i) <= 'Z')
                id = (id * 62) + (tinyURL.charAt(i) - 'A') + 26;
            if ('0' <= tinyURL.charAt(i) && tinyURL.charAt(i) <= '9')
                id = (id * 62) + (tinyURL.charAt(i) - '0') + 52;
        }
        return id;
    }

}
