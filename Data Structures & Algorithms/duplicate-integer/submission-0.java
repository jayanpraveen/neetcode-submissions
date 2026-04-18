class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> n = new HashSet<Integer>(); 
       for (Integer i : nums) {
         if (n.contains(i)) return true;
         n.add(i);
       }
        return false;
    }
}