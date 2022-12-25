import atm.Handler;
import atm.Handler20;
import atm.Handler5;
import atm.Handler50;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestATM {
    @Test
    public void testATM() {
        Handler handler5 = new Handler5();
        Handler handler20 = new Handler20();
        Handler handler50 = new Handler50();
        handler50.setNextHandler(handler20);
        handler20.setNextHandler(handler5);
        handler50.process(125);
        assertThrows(NullPointerException.class, () -> handler50.process(127));
    }
}
