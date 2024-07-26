class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n<k || nums==null){
            return 0;
        }
        Map<Integer,Integer> elementCount=new HashMap<>();
        long currentSum=0;
        long maxSum=0;
        for(int i=0;i<k;i++){
            elementCount.put(nums[i],elementCount.getOrDefault(nums[i],0)+1);
            currentSum +=nums[i];
        }
        if(elementCount.size()==k){
            maxSum=currentSum;
        }
        for(int i=k;i<n;i++){
            int outelement=nums[i-k];
            currentSum=currentSum-outelement;
            elementCount.put(outelement,elementCount.get(outelement)-1);
            if(elementCount.get(outelement)==0){
                elementCount.remove(outelement);
            }
            int inelement=nums[i];
            currentSum=currentSum+inelement;
            elementCount.put(inelement,elementCount.getOrDefault(inelement,0)+1);
            
            if(elementCount.size()==k){
                maxSum=Math.max(currentSum,maxSum);
            }
            
        }
        return maxSum;

        
    }
}
