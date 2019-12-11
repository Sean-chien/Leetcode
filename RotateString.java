public class RotateString {
    public boolean rotateString(String A, String B) {
        if (A.equals(B)) {
            return true;
        }
        int n = A.length();
        for (int i = 0; i < n; i++) {
            A = A.substring(1,n) + A.substring(0,1);
            if(A.equals(B)) {
                return true;
            }
        }
        return false;
    }
}
