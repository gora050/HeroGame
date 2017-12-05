
public class Knight extends MyCharacter {

    private KickBehavior kickBehavior = new Hand();

    public void kick(MyCharacter character){
        kickBehavior.kick(this, character);
    }


    public Knight(){
        super();
        init();
     }

    public Knight(String n){
        super(n);
        init();
    }
    private void init() {
        this.hp = 2     + (int)(Math.random() * 19);
        this.power =2 + (int)(Math.random() * 10);

    }

}
