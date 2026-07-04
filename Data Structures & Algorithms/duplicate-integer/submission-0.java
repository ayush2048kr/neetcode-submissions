class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int num : nums)
        {
            if(seen.contains(num))
            {
                System.out.println("Duplicate Found:"+num);
                return true;
            }
            seen.add(num);
        }
        return false;
        
    }
}