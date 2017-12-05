import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameManagerTest {
    @Test
    public void fight() throws Exception {
        MyCharacter hobbit = new Hobbit("Gremly");
        MyCharacter elf = new Elf("Aaron");
        MyCharacter knight = new Knight("Kuzia");
        MyCharacter king = new King("Krol");

        GameManager.fight(elf, hobbit);
        hobbit = new Hobbit();
        GameManager.fight(hobbit, hobbit);
        //GameManager.fight(knight, king); // We can not test it. Very big random factor

        //assertFalse(king.isAlive());

        //assertTrue(knight.isAlive());
        assertFalse(hobbit.isAlive());
        assertTrue(elf.isAlive());
    }

}