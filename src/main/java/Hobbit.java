public class Hobbit extends MyCharacter {
    public Hobbit(){
        super();
        init();
    }
    public Hobbit(String id){
        super(id);
        init();
    }

    private void init() {
        this.power = 0;
        this.hp = 3;
    }
    public void kick(MyCharacter character){
        this.changePowerOn(-1);
        toCry();
    }

    private void toCry(){
        System.out.println("Allahu Akbar, La ilaha illal lah!!!!!!");
        System.out.println(this.hp);
    }
}
