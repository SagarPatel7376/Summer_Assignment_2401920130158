import java.util.*;
class Longest_Substring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, count = 0;
        Set<Character> S = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            if(!(S.contains(s.charAt(right)))){
                S.add(s.charAt(right));
                count = Math.max(count, right-left+1);
            }
            else{
                while(S.contains(s.charAt(right)) && left < right){
                    S.remove(s.charAt(left));
                    left++;
                }
                S.add(s.charAt(right));
                count = Math.max(count, right-left+1);
            }
        }
        return count;
    }
}
