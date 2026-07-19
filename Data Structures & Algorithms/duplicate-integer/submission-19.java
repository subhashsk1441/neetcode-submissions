class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicates = new HashSet<>();
        for( int n : nums){
            if(duplicates.contains(n) ){
                return true ;
            }else{
                duplicates.add(n);
            }
        }
        return false;
    }

    
}