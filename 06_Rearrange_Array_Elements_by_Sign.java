class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                arr[index]=nums[i];
                index++;
            }
        }
        int temp=index;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr[index]=nums[i];
                index++;
            }
        }
        int j=0;
        int k=1;
        for(int i=0;i<n/2;i++){
            nums[j]=arr[i];
            j=j+2;
            nums[k]=arr[temp+i];
            k=k+2;
        }
        return nums;
    }
}
