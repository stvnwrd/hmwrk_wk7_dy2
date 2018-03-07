import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void setUp() throws Exception {
        godzilla = new Godzilla("GODZILLA", 100, 80);
    }

    @Test
    public void canGetName() {
    assertEquals("GODZILLA", godzilla.name);
    }
}
