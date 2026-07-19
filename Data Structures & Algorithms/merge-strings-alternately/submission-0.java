class Solution {
    public String mergeAlternately(String word1, String word2) {

       int l = word1.length();
       int r = word2.length();
       StringBuilder res = new StringBuilder();
        for( int i = 0 ; i<l || i< r ; i++){
           
           if(i<l){
            res.append(word1.charAt(i));
           }

            if(i<r){
            res.append(word2.charAt(i));
           }
          

        }

        return res.toString();

    }
}