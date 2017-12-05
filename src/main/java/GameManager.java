
public class GameManager {
    public static void main(String[] args) throws Exception {
        CharacterFactory characterFactory = new CharacterFactory();
        MyCharacter character1, character2;
        character1 = characterFactory.createCharacter();
        character2 = characterFactory.createCharacter();
        fight(character1, character2);
    }

    public static void fight(MyCharacter c1, MyCharacter c2) throws Exception {
        System.out.println(c1.id + " (" + c1.getClass().getCanonicalName() + ")" + " versus " + c2.id + " (" + c2.getClass().getCanonicalName() + ")");
        while (c1.isAlive && c2.isAlive) {
            System.out.print("....................\n");
            c1.kick(c2);

            if (c2.isAlive) {
                c2.kick(c1);
                System.out.print("....................\n");

            } else {

            }
        }
        if (c2.isAlive) {
            gameEnd(c2, c1);
        } else {
            if (c1.isAlive()) {
                System.out.print("....................\n");
                gameEnd(c1, c2);
            }else{
                gameEnd();
            }
        }

    }
    private static void gameEnd(){
        System.out.println("Nobody WONS THAT GAME\n\n\n");
    }
    private static void gameEnd(MyCharacter winner, MyCharacter looser) {
        System.out.println("_____________________________\n");
        System.out.println(winner.id + " (" + winner.getClass().getCanonicalName() + ")" + " WON THE BATTLE WITH HERO: " + looser.id + " (" + looser.getClass().getCanonicalName() + ")");
        System.out.println("_____________________________\n\n\n");
    }
}
