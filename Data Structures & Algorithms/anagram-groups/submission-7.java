class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> group = new HashMap<>();
          
          for(int i = 0 ; i<strs.length;i++){
             String word = strs[i];
             int [] count = new int[26];

             for(char c : word.toCharArray() ){

                count[c- 'a']++;

             }

             String key = Arrays.toString(count);
             group.putIfAbsent(key, new ArrayList<>());
             group.get(key).add(word);

          }

          return new ArrayList<>(group.values());
          
    }
}
