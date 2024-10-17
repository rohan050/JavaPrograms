class GF{
    private boolean[] visited = new boolean[256];
    private int maxLength = 0;

    public int longestUniqueSubsttr(String str) {
        if (str.length() == 0) return 0;
        if (str.length() == 1) return 1;

        int left = 0, right = 0;
        while (right < str.length()) {
            if (visited[str.charAt(right)]) {
                while (visited[str.charAt(right)]) {
                    visited[str.charAt(left)] = false;
                    left++;
                }
            }
            visited[str.charAt(right)] = true;
            maxLength = Math.max(maxLength, (right - left + 1));
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        GF gfg = new GF();
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);
        int len = gfg.longestUniqueSubsttr(str);
        System.out.println("The length of the longest " + "non-repeating character " + "substring is " + len);
    }
}