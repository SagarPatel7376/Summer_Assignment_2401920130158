class Anagrams_in_string {
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr = new int[128];
        for (char c : p.toCharArray()) arr[c]++;
        
        List<Integer> ans = new ArrayList<>();
        for (int i = 0, l = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c]--;
            while (arr[c] < 0) {
                arr[s.charAt(l)]++;
                l++;
            }

            if (i - l + 1 == p.length()) {
                ans.add(l);
            }
        }
        return ans;
    }
}
