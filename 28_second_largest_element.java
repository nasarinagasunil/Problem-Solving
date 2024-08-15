class Solution {
    public int print2largest(int[] arr) {
        // Code Here
        
        
         
        int largest=arr[0],second_largest=-1,n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]<largest){
                second_largest=arr[i];
            }
        }
        return second_largest;
        
        
        /** 
         Approach-2
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
        **/
    }
}
