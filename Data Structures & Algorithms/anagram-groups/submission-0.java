class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>,List<String>> map = new HashMap<>();
        for(String str: strs)
        {
            char [] s = str.toCharArray();
            Integer [] a=new Integer [26];
            Arrays.fill(a,0);
            for(char c:s)
            {
                a[c-'a']++;

            }
            List<Integer> arr = Arrays.asList(a);
            
            if(!map.containsKey(arr))    
            map.put(arr,new ArrayList<>());
            
            map.get(arr).add(str);
            }
           // System.out.println(map);

    
        return new ArrayList<>(map.values());
        }
        
    }

