public class NumberComplement {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                arr[i] = '1';
            }
            else {
                arr[i] = '0';
            }
        }
        return Integer.parseInt(String.valueOf(arr), 2);
        //
    }
}
