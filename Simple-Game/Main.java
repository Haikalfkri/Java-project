public class Main
{
    public static void main(String[] args) {
        Player1 player = new Player1("Maven", "sword", 100);
        // System.out.println(player.getName());
        // System.out.println(player.getHealth());
        // System.out.println(player.getWeapon());

        // player.damageByGun1();
        // player.damageByGun2();
        // player.damageByGun2();

        Player2 betterPaPlayer2 = new Player2("Maven", "machine gun", 100, true);
        betterPaPlayer2.damageByGun1();
    }
}