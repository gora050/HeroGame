import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MyCharacterTest {
    private class TestMyCharacter extends MyCharacter {
        private KickBehavior kickBehavior = new Hand();

        public TestMyCharacter(String id){
            super(id);
            this.hp = 8;
        }
        public void kick(MyCharacter character){
            kickBehavior.kick(this, character);
        }
    }

    private MyCharacter character = new TestMyCharacter("Some_id-name");

    @Test
    public void isAlive() throws Exception {


        character.changeHpOn(55);
        assertTrue(character.isAlive());


        character.changeHpOn(-1);
        assertTrue(character.isAlive());

        character.changeHpOn(-330);
        assertFalse(character.isAlive());
    }

    @Test
    public void TestPower() throws Exception {
        int a =character.getPower();
        character.changePowerOn(12);
        assertEquals(a+12, character.getPower());
        character.changePowerOn(-12);
        assertEquals(a, character.getPower());
    }

}