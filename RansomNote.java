public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        for (int i = 0; i < mag.length; i++) {
            arr [mag[i] - 'a'] ++ ;
        }
        for (int j = 0; j < ran.length; j++) {
            if (arr [ran[j] - 'a'] -- == 0) {
                return false;
            }
        }
        return true;
    }
}
