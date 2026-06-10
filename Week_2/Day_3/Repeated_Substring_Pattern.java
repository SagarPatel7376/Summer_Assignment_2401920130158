class Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String s) {
        int prevLPS = 0, i = 1;
        int[] lps = new int[s.length()];
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(prevLPS)) {
                lps[i++] = ++prevLPS;
            } else if (prevLPS == 0) {
                lps[i++] = 0;
            } else {
                prevLPS = lps[prevLPS - 1];
            }
        }
        return lps[s.length() - 1] > 0 && s.length() % (s.length() - lps[s.length() - 1]) == 0;
    }
}
