import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            int freq[] = new int[26];
            for(char c: s.toCharArray()){
                freq[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<26;i++){
                sb.append("#");
                sb.append(freq[i]);
            }

            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(s);  
        }
        return new ArrayList<>(map.values());
    }
}