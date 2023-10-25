import java.util.Scanner;

public class TestBaseballGame {
    private String[] teamNames = new String[2];
    protected int[][] scores;

    public TestBaseballGame() {
        scores = new int[2][9];
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 9; j++) {
                scores[i][j] = 999;
            }
        }
    }

    public void setTeam(int team, String name) {
        teamNames[team] = name;
    }

    public void setScores(int team, int index, int score) {
        if (index == 0 || (index < scores[team].length && scores[team][index - 1] != 999)) {
            scores[team][index] = score;
            if (scores[0][scores[0].length - 1] != 999 && scores[1][scores[1].length - 1] != 999) {
                calculateScore();
            }
        }
    }

    public void calculateScore() {
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 9; j++) {
                switch (i) {
                    case 0:
                        result1 += scores[0][j];
                        break;
                    case 1:
                        result2 += scores[1][j];
                        break;
                }
            }
        }
        if (result1 > result2)
            System.out.println("Team " + teamNames[0] + " wins!");
        else if (result1 < result2)
            System.out.println("Team " + teamNames[1] + " wins!");
        else
            System.out.println("It's a tie!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestBaseballGame baseBall = new TestBaseballGame();
        System.out.print("Enter name of team number 1 >> ");
        baseBall.setTeam(0, sc.nextLine());

        for (int i = 0; i < 9; i++) {
            System.out.println("Please enter scores for " + baseBall.teamNames[0] + " in game #" + (i + 1));
            baseBall.setScores(0, i, sc.nextInt());
        }

        System.out.print("Enter name of team number 2 >> ");
        sc.nextLine(); // Consume the newline left in the input buffer
        baseBall.setTeam(1, sc.nextLine());

        for (int i = 0; i < 9; i++) {
            System.out.println("Please enter scores for " + baseBall.teamNames[1] + " in game #" + (i + 1));
            baseBall.setScores(1, i, sc.nextInt());
        }

        // Calculate and display the winner in the calculateScore() method.
    }
}
