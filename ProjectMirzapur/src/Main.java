import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Kaleen kaleen = new Kaleen(65, 85, 95, 95);
        Guddu guddu = new Guddu(95, 80, 80, 45);
        Munna munna = new Munna(65, 80, 80, 65);
        Sharad sharad = new Sharad(70, 65, 70, 75);

//        System.out.println("Kaleen: " + kaleen.getAveragePower());
//        System.out.println("Guddu: " + guddu.getAveragePower());
//        System.out.println("Munna: " + munna.getAveragePower());
//        System.out.println("Sharad: " + sharad.getAveragePower());

        Util util = new Util();
        List<Bahubali> team1 = new ArrayList<>();
        team1.add(guddu);
        team1.add(munna);

        List<Bahubali> team2 = new ArrayList<>();
        team2.add(kaleen);
        team2.add(sharad);

        util.whoWins(team1, team2);
    }
}

class Util {
    public void whoWins(List<Bahubali> team1, List<Bahubali> team2) {
        int averagePowerTeam1 = 0;
        int averagePowerTeam2 = 0;

        for (Bahubali bahubali : team1) {
            averagePowerTeam1 = averagePowerTeam1 + bahubali.getAveragePower();
        }

        for (Bahubali bahubali : team2) {
            averagePowerTeam2 = averagePowerTeam2 + bahubali.getAveragePower();
        }

        if (averagePowerTeam1 > averagePowerTeam2) {
            System.out.println("Team 1 wins!!");
        } else {
            System.out.println("Team 2 wins!!");
        }
    }
}