public class FibonacciNumber {
    public int fib(int N) {
//        if (N == 0) {
//            return 0;
//        }
//        if (N == 1) {
//            return 1;
//        }
//        return fib(N-1) + fib(N-2);
        if (N <= 1) {
            return N;
        }
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 2; i < N; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }
}
