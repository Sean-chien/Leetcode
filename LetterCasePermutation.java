import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
//        for (int i = 0; i< S.length(); i++) {
//            if (Character.isDigit(S.charAt(i))) {
//                continue;
//            }
//        }
//        int[] words = new int[];
//        for (int j = 0; j< words.length; j++) {
//            if (Character.isLowerCase(S.charAt(j))) {
//                words = S.toLowerCase();
//            }
//        }
        Queue<String> queue = new LinkedList<String>();
        queue.offer(S);
        for (int i = 0; i< S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) {
                continue;
            }
            int words = queue.size();
            for (int j = 0; j < words; j++) {
                String newWords = queue.poll();
                char[] arr = newWords.toCharArray();
                arr[i] = Character.toUpperCase(arr[i]);
                queue.offer(String.valueOf(arr));

                arr[i] = Character.toLowerCase(arr[i]);
                queue.offer(String.valueOf(arr));
            }
        }
        return new LinkedList<>(queue);
    }
}
