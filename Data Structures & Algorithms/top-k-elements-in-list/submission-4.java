class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> [] freq =new List[nums.length+1];
        int i=0;
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            freq[i]=new ArrayList<>();
            i++;

        }
        freq[i]=new ArrayList<>();
        int [] ans=new int [k];
       
       
       
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            freq[entry.getValue()].add(entry.getKey());
        }
        int index=0;
        for( i=freq.length-1;i>0 && index<k;i--)
        {
            for(int n:freq[i])
            {
                ans[index]=n;
                index++;
                if(index==k)
                return ans;
            }
        }
        return ans;
    }
}
