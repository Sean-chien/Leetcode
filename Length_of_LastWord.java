public class Length_of_LastWord {
    public int LeagthOfLastWorld(String s) {
        int len = s.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (s.charAt(i) == ' ' && count != 0) {
                return count;
            }
        }
        return count;
    }
}

