public abstract class MyCharacter {
    protected int hp;
    protected int power;
    protected boolean isAlive;
    protected String id;

    public MyCharacter() {
        this("Character");
    }

    public MyCharacter(String id) {
        this.id = id;
        this.isAlive = true;
    }


    public String toString() {
        return this.id + " (" + this.getClass().getCanonicalName() + ") ";
    }

    public String getName() {
        return this.id;
    }

    public int getPower() {
        return this.power;
    }

    public int getHp() {
        return this.hp;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void changeHpOn(int deltaHp) {
        if (this.isAlive) {
            String status = deltaHp <= 0 ? "damaged" : "healed";
            this.hp += deltaHp;
            System.out.println(this.id + " (" + this.getClass().getCanonicalName() + ") was " + status + " by " + Integer.toString(deltaHp) + " hp");
            if (this.hp <= 0) {
                this.setToDead();
            }
        } else {
            System.out.println("You can't do that. He is dead already");
        }
    }

    public void changePowerOn(int deltaPower) {
        this.power += deltaPower;
        if (this.power <= 0) {
            this.setToDead();
        }
        ;
    }

    public void setToDead() {
        this.isAlive = false;
        System.out.println(this.id + " (" + this.getClass().getCanonicalName() + "): God our Father, \n" +
                "Your power brings us to birth, \n" +
                "Your providence guides our lives, \n" +
                "and by Your command we return to dust.\n" +
                "Amen.");
    }

    abstract public void kick(MyCharacter enemy);

}
