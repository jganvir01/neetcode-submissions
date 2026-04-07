class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);

        }
        int [] ans=new int [k];
        Queue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.values());
        System.out.println(pq);
        for(int i=0;i<k;i++)
        {
            int value=pq.poll();
            for(Map.Entry<Integer,Integer> entry: map.entrySet())
            {
                if(entry.getValue().equals(value))
                {
                    ans[i]=entry.getKey();
                    break;
                }
            }
            
            
            
            map.remove(ans[i]);
        }
        return ans;
    }
}
