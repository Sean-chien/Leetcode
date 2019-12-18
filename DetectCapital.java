public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (char c: word.toCharArray()) {
            if (c - 'a' < 0) {
                count ++;
            }
        }
        if (count == word.length() || count == 0) {
            return true;
        }
        return count == 1 && word.charAt(0)-'a' < 0;
    }
}
