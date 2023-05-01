package Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;
import rwcom.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

class TinyURLTest {
    private static TinyURL tinyURL;
    @BeforeAll
    protected static void startUp() {
        tinyURL = new TinyURL();
    }
    @Test
    void idToShortURL() {
        String tiny = tinyURL.idToShortURL(1400533);
        assertEquals("tiny Url: " + tiny, "tiny Url: f2vp", "idToShortURL() failed");
    }

    @Test
    void reverseTinyURL() {
        String tiny = tinyURL.idToShortURL(1400533);
        int id = tinyURL.reverseTinyURL(tiny);
        assertEquals("id = " + id, "id = 1400533", "reverseTinyURL() failed");
    }
}