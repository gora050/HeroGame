import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HobbitTest {
    private Hobbit hobbit = new Hobbit();

    @Test
    public void kick() throws Exception {
        int power = hobbit.getPower();
        hobbit.kick(new Hobbit());
        assertEquals(power - 1, hobbit.getPower());
    }
}
