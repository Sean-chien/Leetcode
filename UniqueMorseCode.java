import java.util.HashSet;

public class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....",
                        "..",".---","-.-",".-..","--","-.","---",".--.","--.-",
                        ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> str = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            String res = "";
            for (char ch: words[i].toCharArray()) {
                res += arr[ch-'a'];
            }
            str.add(res);
        }
        return str.size();
        // Hashset, set, get -> want to know size -> length
    }
}
