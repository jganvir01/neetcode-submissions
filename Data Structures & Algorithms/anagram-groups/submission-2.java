class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        
        int n=strs.length;
        boolean [] visited = new boolean [n];
        for(int i=0;i<n;i++)
        {
            if(visited[i])
            continue;
            List<String> curr = new ArrayList<>();
            curr.add(strs[i]);
            visited[i]=true;
            int [] arr = new int [26];
            for(int x=0;x<strs[i].length();x++)
            {
              arr[strs[i].charAt(x)-'a']++;  
            }
            for(int j=i+1;j<n ;j++)
            {
                    if (visited[j])
                    continue;
                int brr[] = new int [26];
                for(int x=0;x<strs[j].length();x++)
                {
                    brr[strs[j].charAt(x)-'a']++;  
                }

            
            if(Arrays.equals(arr,brr)){
            curr.add(strs[j]);
            visited[j]=true;
            }
            }
            ans.add(curr);
            
        }
        return ans;
    }
}
