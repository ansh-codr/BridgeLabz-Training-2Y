package assignment15;

public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {10, null, 25, null, 30};
        int missing = 0;
        int total = 0;
        for (Integer score : scores) {
            if (score == null) {
                missing++;
            } else {
                total += score;
            }
        }
        System.out.println(missing);
        System.out.println(total);
    }
}
