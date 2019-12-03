public class Reverse_WordsString {
    public static void main(String[] args) {
        String s;
        s = "Let's take LeetCode contest";
        char [] str = s.toCharArray();

        for (int i = str.length -1; i>=0; i--) {
            System.out.println(str[i] + "\r");
        }
    }
}
