public class RotatedDigits {
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = i + "";
            boolean f = false;
            for (char ch: s.toCharArray()) {
                if (ch == '3' || ch == '4' || ch =='7') {
                    f = false;
                    break;
                }
                if (ch == '2' || ch == '5' || ch == '6' || ch == '9') {
                    f = true;
                }
            }
            if (f) {
                count ++;
            }
        }
        return count;
    }
}
