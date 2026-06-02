import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for(int i : nums){
            if(arr.contains(i)) return true;
            else{
                arr.add(i);
            }
        }
        return false;
    }
}
