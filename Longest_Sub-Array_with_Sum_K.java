class Longest_Sub-Array_with_Sum_K{
    
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        HashMap<Integer,Integer> map=new HashMap<>();
        int currentSum=0;
        int maxlength=0;
        for(int i=0;i<N;i++){
            currentSum+=A[i];
            if(currentSum==K){
                maxlength=i+1;
            }
            if(map.containsKey(currentSum-K)){
                maxlength=Math.max(maxlength,i-map.get(currentSum-K));
            }
            if(!map.containsKey(currentSum)){
                map.put(currentSum,i);
            }
        }
        return maxlength;
    }
}
