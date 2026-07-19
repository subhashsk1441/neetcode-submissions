class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count= new HashMap<>();
        int res = 0;
        int maxCount = 0;

        for(int n :nums){

            count.put(n,count.getOrDefault(n,0)+1);

            if(count.get(n)>maxCount){
                res= n;
                maxCount = count.get(n);
            }
            
        }

        return res;
    }
}