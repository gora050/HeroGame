public class Elf extends MyCharacter {
    public Elf() {
        super();
        init();
    }

    public Elf(String id) {
        super(id);
        init();
    }

    private void init() {
        this.hp = 10;
        this.power = 10;
    }

    public void kick(MyCharacter character) {

        if (this.power > character.getPower()) {
            character.changeHpOn(-character.hp);
            character.setToDead();
        } else {
            character.changePowerOn(-1);
            System.out.println(character.id + " (" + character.getClass().getCanonicalName() + ") lost 1 power due to some Elf");
        }

    }
}
