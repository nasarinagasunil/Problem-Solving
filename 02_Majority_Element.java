class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        Integer element=null;
        for(int num : nums){
            if(count==0){
                element=num;
            }
            if(num==element){
                count++;
            }
            else{
                count--;
            }
            
        }
        return element;
    }
}
