import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ElfTest {
    @Test
    public void kick() throws Exception {
        Elf elf = new Elf("Some elf name.");
        int a = elf.getPower();
        elf.kick(elf);
        assertTrue(elf.isAlive());
        assertEquals(a - 1, elf.getPower());
    }

}
