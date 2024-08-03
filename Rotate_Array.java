class Rotate_Array {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int arr[]=new int[k];

        
        for(int i=0;i<k;i++){
            arr[i]=nums[nums.length-k+i];
        }
        for(int i=0;i<nums.length-k;i++){
            nums[nums.length-i-1]=nums[nums.length-k-i-1];
        }
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
    }
}
