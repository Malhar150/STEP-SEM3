package WEEK_07.CLASSROOM_PROBLEM;

public class QuizScorecard {

    static class Scorecard {

        private final boolean[] results;   // never exposed
        private int recorded;              // how many answers so far

        Scorecard(int totalQuestions) {
            this.results = new boolean[totalQuestions];
            this.recorded = 0;
        }

        public boolean recordAnswer(boolean correct) {
            if (recorded >= results.length) {
                return false;      // extra answers ignored
            }
            results[recorded] = correct;
            recorded++;
            return true;
        }

        public int getScore() {
            int score = 0;
            for (int i = 0; i < recorded; i++) {
                if (results[i]) {
                    score++;
                }
            }
            return score;
        }
    }

    public static void main(String[] args) {

        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Score: " + sc.getScore());

        boolean extra = sc.recordAnswer(true);
        System.out.println(
                "5th answer recorded? " + extra
                + ", score still = " + sc.getScore()
        );
    }
}
