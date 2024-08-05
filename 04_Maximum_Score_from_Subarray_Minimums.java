class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int maxSum=0;
        int sum=0;
        for(int i=1;i<arr.size();i++){
            sum=arr.get(i)+arr.get(i-1);
            if(sum>maxSum){
                maxSum=sum;
            }
            
        }
        return maxSum;
    }
}
