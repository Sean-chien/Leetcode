public class Numberof1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i< 32; i++) {
            count += n&1;
            n = n >> 1;
            // << : 左移运算符，num << 1,相當于num乘以2
            // >> : 右移运算符，num >> 1,相當于num除以2
        }
        return count;
    }
}
