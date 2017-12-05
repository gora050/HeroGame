import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CharacterFactoryTest {
    @Test
    public void createCharacter() throws Exception {
        CharacterFactory factory = new CharacterFactory();
        MyCharacter c1 = factory.createCharacter();
        assertTrue(c1.isAlive());
        assertEquals("0",c1.getName());
    }


}
