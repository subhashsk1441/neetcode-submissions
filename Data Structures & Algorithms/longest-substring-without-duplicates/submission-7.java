class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int res =0;
        HashSet<Character> unique = new HashSet<>();

        for(int r = 0 ; r < s.length(); r++){
            while(unique.contains(s.charAt(r))){
                unique.remove(s.charAt(l));
                l++;
            }

            res = Math.max(res,r-l +1);
            unique.add(s.charAt(r));
        }

        return res;

        
    }
}
