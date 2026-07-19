class Solution {
    public boolean isAnagram(String s, String t) {
          HashMap<Character,Integer> sCount= new HashMap<>();
          HashMap<Character,Integer> tCount= new HashMap<>();


          for(char c : s.toCharArray()){
            sCount.put(c , sCount.getOrDefault(c,0)+1);
          }

          for(char v : t.toCharArray()){
            tCount.put(v , tCount.getOrDefault(v,0)+1);
          }

          if (sCount.equals(tCount)) {
           return true;
          }
           return false;

    
}
}
