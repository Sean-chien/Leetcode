public class SumofSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int nums = (int)Math.sqrt(c);
        int a = 0;
        int b = nums;
        while (a <=b) {
            if (a*a + b*b > c) {
                b--;
            }
            else if (a*a + b*b < c) {
                a++;
            } else {
                return true;
            }
        }
        return false;
    }
}
