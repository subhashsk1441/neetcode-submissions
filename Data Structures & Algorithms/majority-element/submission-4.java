class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> count = new HashMap<>();
           int res = 0 , maxcount = 0;
        for(int n :nums){
           count.put(n , count.getOrDefault(n,0)+1);
           if(count.get(n) > maxcount  ){
            res = n;
            maxcount = count.get(n);
           }
                
        }
        return res ;
    }
}