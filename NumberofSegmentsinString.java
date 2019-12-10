public class NumberofSegmentsinString {
    public int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        String [] arr = s.split(" ");
        for (String str: arr) {
            if (!"".equals(str)) {
                count ++;
            }
        }
        return count;
    }
}
