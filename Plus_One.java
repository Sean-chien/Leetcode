

public class Plus_One {
    public static void main(String[] args) {
        int [] dights = {};
        for (int i = dights.length -1; i >=0; i--) {
            dights[i] = dights[i] + 1;

            if (dights[i] == 10) {
                dights[i] = 0;
            } else {
                System.out.println(dights);
            }
        }
        int [] newdights = new int[dights.length +1];
        newdights[0] = 1;
        for (int i = 1; i < newdights.length; i++) {
            dights[i] = dights[i - 1];
        }
        System.out.println(dights);
    }

}
