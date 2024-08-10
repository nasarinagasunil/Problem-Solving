class Solution {
    public int singleNumber(int[] nums) {
        int XOR=0;
        for(int i=0;i<nums.length;i++){
            XOR=XOR ^ nums[i];
        }
        return XOR;
        /**HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            if(freq.containsKey(num)){
                freq.put(num,freq.get(num)+1);
            }
            else{
                freq.put(num,1);
            }
        }
        int n=0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()==1){
                n=entry.getKey();
            }
        }
        return n;
        **/
    }
}
