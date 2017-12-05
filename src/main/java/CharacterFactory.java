import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class CharacterFactory {
    public Integer id = 0;
    private List<Class<? extends MyCharacter>> characterClasses = new ArrayList<>(Arrays.asList(Hobbit.class, Elf.class, Knight.class, King.class));

    public MyCharacter createCharacter() throws Exception {
        int randClass = (int) (Math.random() * characterClasses.size());
        Class characterClass = characterClasses.get(randClass);
        MyCharacter randomCharacter = (MyCharacter) characterClass.asSubclass(characterClass).getConstructor(String.class).newInstance(this.id.toString());
        this.id += 1;
        return randomCharacter;
    }

}
