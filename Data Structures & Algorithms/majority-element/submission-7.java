class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int res= 0;
        int maxCount = 0 ;

        for(int n : nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
            if(freq.get(n)>maxCount){
                res = n;
                maxCount = freq.get(n);
            }
        }

        return res ;
    }
}