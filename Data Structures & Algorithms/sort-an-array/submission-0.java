class Solution {
        private final Random rand = new Random();

    public int[] sortArray(int[] nums) {
           if (nums == null || nums.length <= 1) return nums;
        quickShort(nums, 0, nums.length - 1);
        return nums;
    }
        public void quickShort(int[]a,int l,int r ){
            if(l>=r) return ;
        int pivotIdx = l + rand.nextInt(r - l + 1);
        int pivot = a[pivotIdx];

        int lt = l , i= l , gt = r ;

        while(i<=gt){
            if(a[i]<pivot){
                swap(a,lt++,i++);

            }else if (a[i]>pivot){
                swap(a,gt--,i);
            }else{
                i++;
            }
        }
        

        quickShort(a,l,lt-1);
           quickShort(a,gt+1,r);

        
        }
        

         public void swap(int[]a , int i , int j  ){
            int temp = a[i];
            a[i] = a[j];
            a[j]= temp;
         }



        
    }
