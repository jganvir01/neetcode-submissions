class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(Integer i :nums)
        {
            if(map.contains(i) )
            {
            
                return true;
                
            }
            else
            map.add(i);
        }
        return false;
    }
}