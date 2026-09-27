import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetsStartTest {

    @Test
    void getMessageReturnsHelloWorld() {
        assertEquals("Hello World!", LetsStart.getMessage());
    }
}