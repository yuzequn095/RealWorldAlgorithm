import java.util.*;
class Solution {

    // Time Complexity: O(n * k), n - numbers of string in strs, k - the longest length of strings in strs
    // Space Complexity: O(n * k)
    public static List<List<String>> groupTitles(String[] strs){

        // For each strings passed in, we use an array to handle its char and freqence
        // and then we use a hash map to pair string pattern and real string

        List<List<String>> ret = new ArrayList<>();

        // corner case check
        if(strs == null || strs.length == 0){
            return ret;    
        }

        // for each passed string, we get the pattern as an array
        Map<String, List<String>> pair = new HashMap<>();
        for(String s : strs){
            int[] pattern = new int[26];
            // update for each char
            for(char c : s.toCharArray()){
                pattern[c - 'a']++;
            }
            // convert arr to string because array is an object in Java
            StringBuilder pattern_str = new StringBuilder();
            pattern_str.append("#");
            for(int i : pattern){
                pattern_str.append(i);
            }
            List<String> pattern_group = pair.getOrDefault(pattern_str.toString(), new ArrayList<>());
            pattern_group.add(s);
            pair.put(pattern_str.toString(), pattern_group);
        }

        // for each pattern, group all of strings
        for(Map.Entry<String, List<String>> entry : pair.entrySet()){
            List<String> group = new ArrayList<>(entry.getValue());
            ret.add(new ArrayList<>(group));
        }

        // return the titles group
        return ret;
        
    }

    public static void main(String[] args) {
        // Driver code
        String title1[] = {"duel","dule","speed","spede","deul","cars"};

        List<List<String>> gt = groupTitles(titles1);
        String query = "spede"; 

        // Searching for all titles
        for (List<String> g : gt){
            if (g.contains(query))
                System.out.println(g);
        }

  }
}