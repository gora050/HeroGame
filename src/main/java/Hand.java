public class Hand implements KickBehavior {
    @Override
    public void kick(MyCharacter c1, MyCharacter c2) {
        int deltaHp = (int)(Math.random() * c1.getPower());
        c2.changeHpOn(-deltaHp);
    }
}