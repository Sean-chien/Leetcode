public class GuessNumberHigherLower {
    public int guessNumber(int n) {
        for (int i = 1; i < n; i++) {
            if (guessNumber(i) == 0) {
                return i;
            }
        }
        return n;
    }
}
