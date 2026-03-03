import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarAndPeaceTest {

    @Test
    public void warAndPeace1() {
        String text = "war what is it good for";
        assertEquals(false, WarAndPeace.warAndPeace(text));
    }
}