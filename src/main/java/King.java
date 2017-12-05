public class King extends Knight {

    private KickBehavior kickBehavior = new Hand();

    public void kick(MyCharacter character){
        kickBehavior.kick(this, character);
    }
    public King(String id){
        super(id);
        this.hp = 5 + (int)(Math.random() * 10);
        this.power = 5 + (int)(Math.random() * 10);
    }




}
