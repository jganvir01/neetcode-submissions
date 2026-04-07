class Solution {

    public String encode(List<String> strs) {
        if(strs.size()<1)
        return "";
StringBuilder s = new StringBuilder();
for(String str:strs)
{
    s.append(str.length());
    s.append("#");
    s.append(str);
}

return s.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int start=0;
        
        while(start<str.length())
        {
            int end=start;
            while(str.charAt(end)!='#')
            {
                end++;
            }
            int length = Integer.parseInt(str.substring(start,end));
            start=end+1;
            end= start+length;
            res.add(str.substring(start,end));
            start=end;
        }
        return res;
    }
}
