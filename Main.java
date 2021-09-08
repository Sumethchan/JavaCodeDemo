
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int playerScore = 1500;
        String playerName = "meth";
        int highScorePosition = calculatedHighScorePosition(1000);
        displayHighScorePosition("meth", highScorePosition);

        highScorePosition = calculatedHighScorePosition(950);
        displayHighScorePosition("Su", highScorePosition);

        highScorePosition = calculatedHighScorePosition(400);
        displayHighScorePosition("chan", highScorePosition);

        highScorePosition = calculatedHighScorePosition(50);
        displayHighScorePosition("kan", highScorePosition);
        /*
         * calculatedScore(false, score, levelCompleted, bonus); score = 10000;
         * levelCompleted = 8; bonus = 200; calculatedScore(true, score, levelCompleted,
         * bonus);
         */
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(
                playerName + " manage to get into position " + highScorePosition + " on the high score table ");
    }

    public static int calculatedHighScorePosition(int playerScore) {

        switch (playerScore / 100) {
            case 0:
            case 1:
            case 2:
            case 3:
                return 4;
            case 4:
            case 5:
            case 6:
                return 3;
            case 9:
            case 8:
            case 7:
                return 2;
            default:
                return 1;
        }
        // if (playerScore >= 1000) {
        // return 1;
        // } else if (playerScore >= 500 && playerScore < 1000) {
        // return 2;
        // } else if (playerScore >= 100 && playerScore < 500) {
        // return 3;
        // } else {
        // return 4;
        // }
    }
    /*
     * public static int calculatedScore(boolean gameOver, int score, int
     * levelCompleted, int bonus) { if (gameOver) { int finalScore = score +
     * (levelCompleted * bonus); finalScore += 2000;
     * System.out.println("Your sinal score was " + finalScore); return finalScore;
     * } return -1; }
     */

}
