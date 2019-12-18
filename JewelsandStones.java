public class JewelsandStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) > -1) {
                count ++;
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        String J = "aA";
//        String S = "aAAbbbb";
//        int count = 0;
//        for (int i = 0; i < S.length(); i++) {
//            if (J.indexOf(S.charAt(i)) > -1) {
//                count ++;
//            }
//        }
//        System.out.println(count);
//    }
}
